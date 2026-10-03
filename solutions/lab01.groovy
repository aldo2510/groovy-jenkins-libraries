def allowedEnvironments = ["dev", "qa", "prod"]

def config = [
    app: "payments-api",
    environment: "qa",
    version: "1.2.0"
]

assert config.environment in allowedEnvironments

def stages = ["Checkout", "Build", "Test", "Deploy"]

stages.each { stageName ->
    println "Ejecutando ${stageName} para ${config.app}"
}
