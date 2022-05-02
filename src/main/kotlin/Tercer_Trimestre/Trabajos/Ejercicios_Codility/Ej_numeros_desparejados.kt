package Tercer_Trimestre.Trabajos.Ejercicios_Codility


internal class Solution {
    fun solution(A: IntArray): Int {

        var listaNumerosRepetidos = mutableListOf<Int>()
        var numeroNoRepetido = 0

        if (A != null) {
            for (i in A.indices) {

                if (A[i] !in 0..1000000) "Numero no valido"
                else {
                    if (A[i] == A[i.or(1) - 1] || A[i] == (A[i + 1] ?: A[A.size])) listaNumerosRepetidos.add(A[i])

                }
            }

            for (i in A.indices) {
                if (A[i] !in listaNumerosRepetidos) numeroNoRepetido = A[i]
            }

        }
        "Array nulo"

        return numeroNoRepetido

    }


}


fun main() {

    var ejemplo1 = Solution()

    var array:IntArray = intArrayOf(9, 3, 9, 3, 9, 7, 9)

    println(ejemplo1.solution(array))

}
