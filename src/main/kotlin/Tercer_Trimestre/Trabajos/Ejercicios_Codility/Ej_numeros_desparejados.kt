package Tercer_Trimestre.Trabajos.Ejercicios_Codility

import kotlin.math.absoluteValue

// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
internal class Solution {

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
}

fun main() {

    var ejemplo1 = Solution()

    var array = mutableListOf<Int>(9, 3, 9, 3, 9, 7, 9)
    println(ejemplo1.solution(array))

}