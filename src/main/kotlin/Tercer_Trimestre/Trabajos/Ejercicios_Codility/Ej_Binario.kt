package Tercer_Trimestre.Trabajos

import java.util.*
import kotlin.math.absoluteValue


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

fun solution(N: Int): String {

    var binario = pasoNumeroBinario(N)
    var contadorCeros = 0
    var contadorUnos = 0
    var listaContadorCeros = ArrayList<Int>()


       for (i in binario.indices) {
            when {
                binario[i] == 0 -> {
                    contadorCeros++
                    if (binario.get(i+1) !=0) listaContadorCeros.add(contadorCeros)
                }

                binario[i] == 1 -> {
                    contadorUnos++
                }

            }
        }

    return "lista de ceros= $listaContadorCeros\n grupo mayor de ceros= ${listaContadorCeros[listaContadorCeros.size-1] - listaContadorCeros[listaContadorCeros.size-2]}"

}

fun main() {

    println(pasoNumeroBinario(4357))
    println(solution(4357))
}