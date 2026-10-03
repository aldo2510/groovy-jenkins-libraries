def branch = "main"

if (branch == "main") {
    println "Deploy a producción"
} else if (branch == "develop") {
    println "Deploy a desarrollo"
} else {
    println "No hay deploy"
}

def resultado = branch == "main" ? "PROD" : "NO-PROD"
println resultado
