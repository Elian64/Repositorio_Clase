package ej_repaso_rec_junio.CodeWars

/*
Cree una función que tome un entero positivo como su parámetro y
devuelva una cadena que contenga la representación en números romanos de ese entero.

Los números romanos modernos se escriben expresando cada dígito por separado, comenzando
con el dígito más a la izquierda y omitiendo cualquier dígito con un valor de cero. En números romanos, 1990
se representa: 1000=M, 900=CM, 90=XC; resultando en MCMXC. 2008 se escribe como 2000=MM, 8=VIII; o MMVIII
*/

fun encode(num: Int): String {
    var numero = num
    var listaNumeroFinal = mutableListOf<String>()
    var palabra = ""

    while (numero != 0) {
        when {
            numero >= 1000 -> {
                listaNumeroFinal.add("M")
                numero -= 1000
            }
            numero >= 100 -> {
                listaNumeroFinal.add("C")
                numero -= 100
            }
            numero >= 50 -> {
                listaNumeroFinal.add("D")
                numero -= 50
            }
            numero >= 10 -> {
                listaNumeroFinal.add("X")
                numero -= 10
            }
            numero >= 5 -> {
                listaNumeroFinal.add("V")
                numero -= 5
            }
            numero >= 1 -> {
                listaNumeroFinal.add("I")
                numero -= 1
            }
        }
    }

    for (i in listaNumeroFinal) palabra += i

    return palabra
}

fun main() {
    println(encode(1666))
}