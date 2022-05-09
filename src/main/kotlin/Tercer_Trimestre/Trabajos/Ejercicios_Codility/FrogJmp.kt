package Tercer_Trimestre.Trabajos.Ejercicios_Codility

fun solution(X: Int, Y: Int, D: Int): Int {
    var num_saltos = 0
    var posic_actual = X

    while (Y > posic_actual) {
        posic_actual = +D
        num_saltos++

    }

    return num_saltos

}


fun main() {

    println(solution(10, 85, 30))
}