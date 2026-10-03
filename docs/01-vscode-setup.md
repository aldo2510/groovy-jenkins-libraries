# Preparación del entorno en VS Code

## Java
Instala JDK 17 o superior.

```bash
java -version
javac -version
```

## Groovy
Instala Apache Groovy y verifica:

```bash
groovy --version
```

## Extensiones recomendadas
- **Groovy Language Support**
- **Extension Pack for Java** de Microsoft
- **GitLens**
- **Jenkins Pipeline Linter Connector**
- **Docker**

Los nombres pueden variar en el Marketplace; prioriza extensiones mantenidas y de proveedor confiable.

## Ejecutar
```bash
code .
groovy 01-groovy-basics/01-hello.groovy
```

## Jenkins opcional con Docker
```bash
docker run -d \
  --name jenkins \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins_home:/var/jenkins_home \
  jenkins/jenkins:lts
```

Secuencia recomendada:

```text
Groovy local -> Jenkinsfile -> Shared Library
```
