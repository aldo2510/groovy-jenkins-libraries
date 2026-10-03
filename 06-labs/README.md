# Labs

## Lab 01 — Pipeline configurable
- recibe aplicación y ambiente por parámetros;
- valida el ambiente;
- crea un Map de configuración;
- recorre una lista de stages.

## Lab 02 — Closure de ejecución
Crea una función que reciba una closure y ejecute una acción N veces.

## Lab 03 — Service Catalog
Crea una lista de servicios como Maps y genera:
- servicios habilitados;
- servicios por ambiente;
- cantidad total.

## Lab 04 — Shared Library
Crea:
```text
vars/
  deployApp.groovy
src/com/company/
  DeploymentService.groovy
```

deployApp debe validar configuración, imprimir información, ejecutar el servicio y manejar errores.

## Lab 05 — Pipeline estándar
Crea:
```groovy
standardPipeline(
    app: 'payments-api',
    environment: 'qa',
    runSecurity: true
)
```

Centraliza checkout, build, test, security y deploy.

## Lab 06 — Capstone
Construye una Shared Library para varios microservicios con configuración por Map, validaciones, build, test, seguridad, deploy, logging y excepciones.
