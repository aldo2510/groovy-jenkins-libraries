def call(Map config = [:]) {
    def app = config.app ?: error("config.app es obligatorio")
    def environment = config.environment ?: "dev"

    echo "Building ${app} for ${environment}"
    sh "echo 'Simulación de build de ${app}'"
}
