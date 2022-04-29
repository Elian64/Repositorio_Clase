package Arrays2

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

/*Declarar una clase Dado que tenga como propiedad su valor y dos métodos que permitan tirar el dado e imprimir su valor.
En la main definir un Array con 5 objetos de tipo Dado. Tirar los 5 dados e imprimir los valores de cada uno.*/

fun main() {

    var dado1 = Dado(4)
    var dado2 = Dado(6)
    var dado3 = Dado(1)
    var dado4 = Dado(5)
    var dado5 = Dado(2)
    var arregloDados: Array<Dado> = arrayOf(dado1, dado2, dado3, dado4, dado5)

    dado1.tirarDado()
    println(dado1.imprimeValor())

}

class Dado(var valor: Int) {

    fun tirarDado() = (0..6).random()

    fun imprimeValor(): Int = valor


}