# Roadmap

## Nivel 1 — Groovy
Variables, strings, números, condiciones, loops, listas, maps, ranges, métodos, closures y excepciones.

## Nivel 2 — Jenkins
Pipeline, stages, steps, environment, params, when, post y variables de Jenkins.

## Nivel 3 — Shared Libraries
```text
shared-library/
├── vars/
├── src/
├── resources/
└── README.md
```

### vars/
Funciones globales invocables desde Jenkinsfile.

### src/
Clases Groovy reutilizables.

### resources/
Archivos de recursos para la library.

No empezamos directamente por Shared Libraries: primero entender closures, maps, métodos y clases.
