package Tercer_Trimestre.Trabajos

import java.util.Collections

fun main(){

    // println(solution(1041))
    println(pasoNumeroBinario(4))
}

fun pasoNumeroBinario(N: Int):ArrayList<Int> {
//usar reversed
    var numeroBinario = ArrayList<Int>(N.toString().length)
    var numeroAdivir = N
    for (i in 0..N) {

        if (N / 2 != 1 || N / 2 != 0) {
            return numeroBinario
        } else {
            numeroBinario[i] = numeroAdivir % 2
            numeroAdivir = numeroBinario[i]
        }

    }

    return numeroBinario
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