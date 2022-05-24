package ej_repaso_rec_junio.CodeWars

/* Escribe una función, persistence, que tome un parámetro positivo numy devuelva su persistencia multiplicativa,
que es el número de veces que debes multiplicar los dígitos numhasta llegar a un solo dígito.

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)

*/

fun persistence(num: Int): Int {

    var numeroAletra = num.toString()
    var numCifras = num.toString().length
    var resultado = 1

    for (i in 0 until numCifras)
    {
        if(numeroAletra[i+1].toInt() in numeroAletra.indices) resultado *= numeroAletra[i].toInt()
        break
    }

    return resultado
}

fun main() {
    println(persistence(999))

}