import kotlin.random.Random

/*fun main() {

    var pistola1 = Pistola("Deagle", 10, 1, "Calibre-30", 100)
    var rifle1 = Rifle("AC130", 16, 2, "Calibre-50", 180)
    var bazooka1 = Bazooka("RPG", 6, 3, "Misil", 400)
    var casa1 = Casa(12, 36, "Casax")
    var coche1 = Coche(6, 24, "Cochex")
    var bocadillo1 = Bocadillo(2, 12, "Bocadillox")


    /*println(pistola1.dispara())
    println(pistola1.dispara())
    println(rifle1.dispara())
    println(rifle1.dispara())
    println(bazooka1.dispara())
    println(bazooka1.dispara())*/

    var listaArma = listOf<ArmaDeFuego>(
        pistola1, rifle1, bazooka1,
    )

    var mapArmas = mapOf(
        1 to listaArma[(0..5).random()],
        2 to listaArma[(0..5).random()],
        3 to listaArma[(0..5).random()],
        4 to listaArma[(0..5).random()],
        5 to listaArma[(0..5).random()],
        6 to listaArma[(0..5).random()]
    )

    var contador = 6
    while (contador != 0) {
        mapArmas[contador]?.dispara()
        println(mapArmas[contador])
        contador--
    }

}*/

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
