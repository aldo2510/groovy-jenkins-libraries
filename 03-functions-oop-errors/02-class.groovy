class Deployment {
    String application
    String environment

    Deployment(String application, String environment) {
        this.application = application
        this.environment = environment
    }

    void execute() {
        println "Deploying ${application} to ${environment}"
    }
}

def deployment = new Deployment("payments-api", "dev")
deployment.execute()
