package Tercer_Trimestre.Trabajos.Ejercicios_Codility

fun solution(A: IntArray): Int {
    var contNumDistinct = 0

    var listaNumeros = mutableListOf<Int>()

    for (i in A.indices) {
        if (A[i] !in listaNumeros)
        {
            listaNumeros.add(A[i])
        }
        else {
            contNumDistinct++
        }
    }


    return contNumDistinct
}

fun main() {

    var arrayEjemplo = intArrayOf(2, 6, 1, 2, 6, 1) //salida = 3 (3 valores distintos, 1,2 y 3)
    println(solution(arrayEjemplo))
}