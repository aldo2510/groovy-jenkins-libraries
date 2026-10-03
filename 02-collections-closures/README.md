# Módulo 2 — Collections y Closures

## Temas
List, Map, Range, each, collect, find, findAll, any, every y closures.

Una closure es un bloque de código que puedes guardar, pasar como argumento y ejecutar.

```groovy
def saludar = { nombre ->
    "Hola ${nombre}"
}
println saludar("Jenkins")
```
