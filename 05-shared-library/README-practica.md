# Práctica — Primera Shared Library

Crea una función global llamada `dockerBuild`.

Uso:

```groovy
dockerBuild(
    image: 'payments-api',
    tag: '1.0.0'
)
```

Debe simular:

```bash
docker build -t payments-api:1.0.0 .
```

### Extensión

Crea `DockerUtils` dentro de src/ con:
- build()
- tag()
- push()

La función `vars/dockerBuild.groovy` será la fachada.
