def saludar = { nombre ->
    println "Hola ${nombre}"
}

saludar("Aldo")

def ejecutarStage = { stageName ->
    println "Ejecutando ${stageName}"
}

["Build", "Test", "Deploy"].each { stageName ->
    ejecutarStage(stageName)
}

def nombres = ["jenkins", "groovy", "pipeline"]
def mayusculas = nombres.collect { it.toUpperCase() }
println mayusculas
