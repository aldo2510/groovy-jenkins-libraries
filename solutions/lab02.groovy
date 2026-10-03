def executeTimes(int times, Closure action) {
    for (int i = 0; i < times; i++) {
        action(i)
    }
}

executeTimes(3) { index ->
    println "Ejecutando acción #${index + 1}"
}
