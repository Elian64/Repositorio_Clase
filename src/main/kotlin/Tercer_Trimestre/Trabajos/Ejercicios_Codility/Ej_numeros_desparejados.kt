package Tercer_Trimestre.Trabajos.Ejercicios_Codility

/*internal class Solution {

    //A: IntArray?
    fun solution(A: MutableList<Int>): Int {


        for (i in 0 until A!!.size) {

            var iterador = A.iterator()
            if (A[i] != A[iterador.next()]) {

                return A[i]
            }

        }
        return 0
    }
}*/

internal class Solution {
    /*fun solution(A: MutableList<Int>?): Int {

        var listaNumerosRepetidos = mutableListOf<Int>()

        var contBucle1 = 0
        var contBucle2 = 0

        while(A!!.size!=contBucle1 && contBucle2 >= A!!.size)
        { //var array = mutableListOf<Int>(9, 3, 9, 3, 9, 7, 9)
            if(A[contBucle1]!=A[contBucle2+1] || A[contBucle1] !in listaNumerosRepetidos)
                /*(A[contBucle1]!=A[contBucle2+1] || A[contBucle1] !in listaNumerosRepetidos)*/
            {
                contBucle2++
            }
            else
            {
                contBucle1++
                //contBucle2=0
                listaNumerosRepetidos.add(A[contBucle1])
            }

        }

        return A[contBucle1]
    }*/

    fun solution(A: MutableList<Int>?): Int {

        var contIrerador = 1
        var numero = 0

        for (i in 0 until A!!.size) {

            try {

                if (A[i] != A[i + contIrerador] && A[i] != A[i - contIrerador]) {
                    contIrerador++
                    i == 0
                }
                contIrerador = 1
                i == i + 1

                if (contIrerador >= A!!.size-1) numero=A[i] /*return A[i]*/

            } catch (e: IndexOutOfBoundsException) {
                "rango no valido"
            }
        }

        return numero


    }

}


fun main() {

    var ejemplo1 = Solution()

    var array = mutableListOf<Int>(9, 3, 9, 3, 9, 7, 9)
    println(ejemplo1.solution(array))

}
