package Tercer_Trimestre.Trabajos

import java.util.*


fun pasoNumeroBinario(N: Int): List<Int> {

    var binario = N
    var numeroBinario = arrayListOf<Int>()

    while (binario > 1) {
        numeroBinario.add(binario % 2)
        binario = (binario - binario % 2) / 2

    }
    numeroBinario.add(binario)

    return numeroBinario.reversed()

}

fun solution(N: Int): Int {

    var binario = pasoNumeroBinario(N)
    var contadorCeros = 0
    var listaContadorCeros = ArrayList<Int>()


    for (i in binario.indices) {

        if (binario[i] == 0) {
            contadorCeros++

            if (binario[i + 1] != 0) {
                listaContadorCeros.add(contadorCeros)
                contadorCeros = 0
            }
        }
    }

    return listaContadorCeros.maxOf { it }
}


fun main() {

    println(pasoNumeroBinario(345347))
    println(solution(345347))
}