package ej_repaso_rec_junio.CodeWars

import kotlin.math.absoluteValue

/* Escribe una función, persistence, que tome un parámetro positivo numy devuelva su persistencia multiplicativa,
que es el número de veces que debes multiplicar los dígitos numhasta llegar a un solo dígito.

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)

*/

fun persistence(num: Int): Int {

    var resultado = 1
    var cont = 0
    var contBucle = 0
    var arrayResultados = mutableListOf<Int>()
    arrayResultados.add(num)

    while (arrayResultados[contBucle].toString().length > 1) {
        for (i in arrayResultados[contBucle].toString()) resultado *= i.digitToInt()

        arrayResultados.add(resultado)
        cont++
        contBucle++
        resultado = 1
    }

    return cont
}

fun main() {
    println(persistence(999))

}