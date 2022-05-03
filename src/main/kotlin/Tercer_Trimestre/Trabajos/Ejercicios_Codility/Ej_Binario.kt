package Tercer_Trimestre.Trabajos

import java.util.*


fun pasoNumeroBinario(N: Int): Int {

    var binario = N
    var numeroBinario = arrayListOf<Int>()

    while (binario > 1) {
        numeroBinario.add(binario % 2)
        binario = (binario - binario % 2) / 2

    }
    numeroBinario.add(binario)

    var binarioFinal = numeroBinario.toString().reversed().toInt() //mirar como sacar solo los valores

    return binarioFinal

}

fun solution(N: Int): Int {

    var binario = pasoNumeroBinario(N).toString()
    var contadorCeros = 0
    var contadorUnos = 0
    var listaContadorCeros = ArrayList<Int>()

    for (i in 0..N) {
        if (binario.substring(i) == "0") {
            while(binario.substring(i+1)!="1") {
                contadorCeros++
                listaContadorCeros[i]=contadorCeros
            }
        } else {
            contadorUnos++
        }
    }


    return 0
}

fun main() {

    println(pasoNumeroBinario(4))
}