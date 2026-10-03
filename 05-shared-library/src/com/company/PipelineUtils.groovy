package com.company

class PipelineUtils implements Serializable {
    private static final long serialVersionUID = 1L

    def steps

    PipelineUtils(steps) {
        this.steps = steps
    }

    void info(String message) {
        steps.echo "[INFO] ${message}"
    }

    void warn(String message) {
        steps.echo "[WARN] ${message}"
    }
}
