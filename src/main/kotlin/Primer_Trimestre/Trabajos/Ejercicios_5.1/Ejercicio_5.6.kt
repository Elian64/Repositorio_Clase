/* Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular
el área y el perímetro. Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.*/

class Rectangulo(var base: Int, var altura: Int) {

    fun calcularArea(): Int {

        return base * altura

    }

    fun calcularPerimetro(): Int {

        return 2 * (base + altura)

    }

    override fun toString(): String {
        return "El rectangulo tiene $base como base, y $altura como altura"
    }

}

fun main() {

    var ejemplo1 = Rectangulo(4, 5)
    var ejemplo2 = Rectangulo(7, 8)

    println(ejemplo1.calcularArea())
    println(ejemplo1.calcularPerimetro())

    println(ejemplo2.calcularArea())
    println(ejemplo2.calcularPerimetro())
}
