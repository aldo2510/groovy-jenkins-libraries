# Notas rápidas de Groovy en Jenkins

## String
```groovy
def app = "payments"
echo "Aplicación: ${app}"
```

## List
```groovy
def stages = ["Build", "Test", "Deploy"]
stages.each {
    echo "Stage: ${it}"
}
```

## Map
```groovy
def config = [environment: "dev", replicas: 2]
echo "${config.environment}"
```

## Closure
```groovy
def execute = { message ->
    echo message
}
execute("Hola Jenkins")
```
