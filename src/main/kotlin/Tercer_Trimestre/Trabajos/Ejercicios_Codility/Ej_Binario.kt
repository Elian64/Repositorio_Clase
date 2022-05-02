package Tercer_Trimestre.Trabajos

import java.util.*

fun pasoNumeroBinario(N: Int): List<Int> {

    var binario = N
    var numeroBinario = arrayListOf<Int>()
    var cociente = N

    while (binario > 1) {
        numeroBinario.add(binario % 2)
        binario = (binario - binario % 2) / 2

    }
    numeroBinario.add(binario)

    return numeroBinario.reversed()

}

fun solution(N: Int): Int {

    var numBinario=pasoNumeroBinario(N)
    var numeroUtilizable = numBinario.toString()
    var posicionNumeroCeros= mutableListOf<Int>()
    var numeroDeCeros=0
    var listaGrupoDeCeros = mutableListOf<Int>()

    if(N !in 1..2147483647 && N!=null)
    {
        "Número no válido"
    }
    else
    {


        for(i in 0..numeroUtilizable.length){

            for(i in 0..numeroUtilizable.length){
                if(numeroUtilizable.substring(i)=="0" && (numeroUtilizable.substring(i-1)=="1" || numeroUtilizable.substring(i+1)=="1") )
                {
                    numeroDeCeros++

                }
                posicionNumeroCeros[i]=numeroDeCeros
            }
            listaGrupoDeCeros[i]= Collections.max(posicionNumeroCeros)
        }
    }

    return Collections.max(listaGrupoDeCeros)
}

fun main() {

    println(pasoNumeroBinario(4))
}