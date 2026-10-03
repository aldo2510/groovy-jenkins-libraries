def parseVersion(String version) {
    if (!version.matches(/\d+\.\d+\.\d+/)) {
        throw new IllegalArgumentException("Versión inválida: ${version}")
    }
    return version
}

try {
    println parseVersion("1.2.0")
    println parseVersion("latest")
} catch (Exception e) {
    println "Error: ${e.message}"
} finally {
    println "Fin"
}
