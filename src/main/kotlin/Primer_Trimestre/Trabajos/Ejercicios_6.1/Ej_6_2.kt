package Primer_Trimestre.Trabajos.Ejercicios_6.`1`

import kotlin.random.Random

fun main() {

}

interface dispara {
    var nombre: String
    var municion: Int
    var municionARestar: Int
    fun disparar() {
        if (municion != 0) {
            municion -= municionARestar
        }
    }


    abstract class ArmaDeFuego(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            var tipoDeMunicion: String,
            var danio: Int,
            var radio: String
    ) : dispara {

        override fun disparar() {
            if (municion != 0) {
                municion -= municionARestar
            }
        }

        open fun recargar() {
            var municionMax = municion
            municion += municionMax
            println("municion recargada a $municion")
        }
    }


    class Pistola(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara


    class Rifle(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara

    class Bazooka(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara

    class Casa(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara

    class Coche(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara

    class Bocadillo(
            override var nombre: String,
            override var municion: Int,
            override var municionARestar: Int,
            tipoDeMunicion: String,
            danio: Int,
            radio: String
    ) : dispara
}