def services = [
    [name: "payments", environment: "prod", enabled: true],
    [name: "orders", environment: "qa", enabled: false],
    [name: "customers", environment: "prod", enabled: true],
    [name: "catalog", environment: "dev", enabled: true]
]

println "Total: ${services.size()}"
println "Habilitados: ${services.findAll { it.enabled }}"
println "Producción: ${services.findAll { it.environment == 'prod' }}"
