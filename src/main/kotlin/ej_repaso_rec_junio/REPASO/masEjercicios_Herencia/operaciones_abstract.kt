package ej_repaso_rec_junio.REPASO.masEjercicios_Herencia

/*Declarar una clase abstracta que represente una Operación. Definir en la misma tres propiedades valor1, valor2 y resultado, y dos métodos: calcular e imprimir.
Plantear dos clases llamadas Suma y Resta que hereden de la clase Operación.*/

abstract  class Operacion(var valor1: Int, var valor2: Int)
{
     protected var resultado:Int = 0

    abstract fun calcular()

    fun imprimir():String = "El resultado es $resultado"

}

class Suma(valor1: Int, valor2: Int) : Operacion(valor1, valor2)
{
    override fun calcular() {
    resultado = valor1 + valor2
    }
}

class Resta(valor1: Int, valor2: Int) : Operacion(valor1, valor2)
{
    override fun calcular() {
        resultado = valor1 - valor2
    }
}

fun main()
{
    var Ejsuma = Suma(4,5)
    var Ejresta = Resta(7,5)
    Ejsuma.calcular()
    Ejresta.calcular()
    print( Ejsuma.imprimir() )
    print( Ejresta.imprimir() )
}