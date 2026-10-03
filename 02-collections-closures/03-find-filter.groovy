def services = [
    [name: "payments", enabled: true],
    [name: "orders", enabled: false],
    [name: "customers", enabled: true]
]

def enabled = services.findAll { it.enabled }
def firstDisabled = services.find { !it.enabled }

println "Enabled: ${enabled}"
println "First disabled: ${firstDisabled}"
println "Todos tienen nombre: ${services.every { it.name }}"
println "Alguno habilitado: ${services.any { it.enabled }}"
