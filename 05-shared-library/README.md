# Módulo 5 — Jenkins Shared Libraries

## ¿Qué problema resuelven?

Permiten centralizar lógica repetida entre muchos Jenkinsfiles.

## Estructura

```text
shared-library/
├── vars/
│   └── securityScan.groovy
├── src/
│   └── com/company/
│       └── PipelineUtils.groovy
├── resources/
└── README.md
```

### vars/
Funciones globales invocables desde un Jenkinsfile.

```groovy
def call(String image) {
    sh "trivy image ${image}"
}
```

Uso:

```groovy
@Library('company-shared-library') _
securityScan("payments:1.0.0")
```

### src/
Clases Groovy reutilizables.

```groovy
package com.company

class PipelineUtils implements Serializable {
    def steps

    PipelineUtils(steps) {
        this.steps = steps
    }

    void info(String message) {
        steps.echo "[INFO] ${message}"
    }
}
```

## Modelo mental

```text
Jenkinsfile -> vars/ -> src/
```

La función de vars suele ser la fachada sencilla y src contiene lógica reutilizable más compleja.
