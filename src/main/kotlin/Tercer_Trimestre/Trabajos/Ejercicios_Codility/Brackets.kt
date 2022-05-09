package Tercer_Trimestre.Trabajos.Ejercicios_Codility

fun solution(S: String): MutableList<Int> {
    var rangoLlaves = mutableListOf<Int>()
    var rangoCorchetes = mutableListOf<Int>()
    var rangoParentesis = mutableListOf<Int>()

    for (i in S.indices) {
        when {
            S[i] == '{' -> rangoLlaves.add(i)
            S[i] == '}' -> rangoLlaves.add(i)
            S[i] == '[' -> rangoCorchetes.add(i)
            S[i] == ']' -> rangoCorchetes.add(i)
            S[i] == '(' -> rangoParentesis.add(i)
            S[i] == ')' -> rangoParentesis.add(i)

        }
    }




    return rangoParentesis
}

fun main() {

    println(solution("{[()()]}"))

}