# Módulo 4 — Groovy en Jenkins

Un Jenkinsfile Declarative combina Groovy con el DSL de Jenkins.

```groovy
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    def app = "payments"
                    echo "Building ${app}"
                }
            }
        }
    }
}
```

Importante: echo, sh, checkout, withCredentials y otros steps son proporcionados por Jenkins/plugins; no son Groovy estándar.
