def stages = ["Checkout", "Build", "Test", "Deploy"]

println stages[0]
println stages.size()

def pipeline = [
    name: "payments-api",
    environment: "dev",
    version: "1.0.0"
]

println pipeline.name
println pipeline["environment"]

pipeline.version = "1.1.0"
println pipeline
