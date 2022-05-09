package Tercer_Trimestre.Trabajos.Ejercicios_Codility

fun solution(A: IntArray): Int {

    var contNumDistinct = 0
    var listaNumeros = mutableListOf<Int>()

    for (i in A.indices) {
        if (A[i] !in listaNumeros) {
            listaNumeros.add(A[i])
            contNumDistinct++
        }
    }

    return contNumDistinct
}

fun main() {

    var arrayEjemplo = intArrayOf(2, 6, 6, 6, 6, 6)
    println(solution(arrayEjemplo))
}