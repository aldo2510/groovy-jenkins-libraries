def buildMessage(String app, String environment = "dev") {
    return "Building ${app} in ${environment}"
}

println buildMessage("payments")
println buildMessage("payments", "prod")

def multiply(a, b) {
    a * b
}

println multiply(4, 5)
