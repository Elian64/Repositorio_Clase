package ej_repaso_rec_junio.CodeWars

import kotlin.math.max
import kotlin.math.min

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {

    var listaLength1 = mutableListOf<Int>()
    var lista1ordenada = a1.sortedBy { it.length }
    lista1ordenada.forEach { listaLength1.add(it.length) }
    var maximoLista1 = listaLength1.last()
    var minimoLista1 = listaLength1.first()

    var listaLength2 = mutableListOf<Int>()
    var lista2ordenada = a2.sortedBy { it.length }
    lista2ordenada.forEach { listaLength2.add(it.length) }
    var maximoLista2 = listaLength2.last()
    var minimoLista2 = listaLength2.first()

    var resultado = max(maximoLista1, maximoLista2) - min(minimoLista1, minimoLista2)

    return resultado

}
fun main()
{

    print(mxdiflg(arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"), arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")))


}