package `Colecciones-3`

/*Problema propuesto

Definir un MutableSet y almacenar 6 valores aleatorios comprendidos entre 1 y 50.
El objeto de tipo MutableSet representa un cartón de lotería. Comenzar a generar valores aleatorios (comprendidos entre 1 y 5)
todos distintos y detenerse cuando salgan todos los que contiene el cartón de lotería. Mostrar cuantos números tuvieron que sortearse
hasta que se completó el cartón.*/

fun main() {
    var listaMutable = mutableSetOf<Int>()
    var cartonLoteria = mutableSetOf<Int>(
        (1..50).random(),
        (1..50).random(),
        (1..50).random(),
        (1..50).random(),
        (1..50).random(),
        (1..50).random()
    )

    for (element in cartonLoteria)
        println(element)

    var numeroDeSorteos = 0
    while (listaMutable != cartonLoteria) {
        listaMutable = mutableSetOf<Int>(
            (1..50).random(),
            (1..50).random(),
            (1..50).random(),
            (1..50).random(),
            (1..50).random(),
            (1..50).random()
        )
        println(listaMutable)
        numeroDeSorteos++
    }
    println("¡Números acertados!")
    println("Veces intentado= $numeroDeSorteos")

}