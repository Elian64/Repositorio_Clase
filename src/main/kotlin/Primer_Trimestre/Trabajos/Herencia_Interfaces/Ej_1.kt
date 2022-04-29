import kotlin.random.Random

fun main() {

    var pistola1 = ArmaDeFuego("Deagle", 10, 1, "Calibre-30", 100, "Amplio")
    var rifle1 = ArmaDeFuego("AC130", 16, 2, "Calibre-50", 180, "Pequeño")
    var bazooka1 = ArmaDeFuego("RPG", 6, 3, "Misil", 400, "Amplio")


    /*println(pisotla1.dispara())
    println(pisotla1.dispara())
    println(rifle1.dispara())
    println(rifle1.dispara())
    println(bazooka1.dispara())
    println(bazooka1.dispara())*/

    var listaArma = listOf<ArmaDeFuego>(
        pistola1, rifle1, bazooka1,
    )

    var mapArmas = mapOf(
        1 to listaArma[(0..2).random()],
        2 to listaArma[(0..2).random()],
        3 to listaArma[(0..2).random()],
        4 to listaArma[(0..2).random()],
        5 to listaArma[(0..2).random()],
        6 to listaArma[(0..2).random()]
    )
    
   var contador=6
    while(contador!=0){
        mapArmas[contador]?.dispara()
        println(mapArmas[contador])
        contador--
    }

}

open class ArmaDeFuego(
    protected var nombre: String, protected var municion: Int,
    protected var municionARestar: Int, protected var tipoDeMunicion: String,
    protected var danio: Int, protected var radio: String
) {
    init {
        if (radio != "Pequeño" && radio != "Amplio") {
            println("tipo de radio no válido")
        } //Revisar que funcione
    }

    open fun dispara() {
        if (municion != 0) {
            municion -= municionARestar
        }

        println("balas disparadas = $municionARestar")
    }

    open fun recarga() {
        var municionMax = municion
        municion += municionMax
        println("municion recargada a $municion")
    }

    class Pistola(
        nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String,
        danio: Int, radio: String
    ) : ArmaDeFuego(
        nombre, municion, municionARestar, tipoDeMunicion,
        danio, radio
    ) {
        override fun dispara() {

            if (municion != 0) {
                municion -= municionARestar
            }

            println("balas disparadas = $municionARestar")
        }

        override fun recarga() {
            var municionMax = municion
            municion += municionMax
            println("municion recargada a $municion")
        }

        class Rifle(
            nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String,
            danio: Int, radio: String
        ) : ArmaDeFuego(
            nombre, municion, municionARestar, tipoDeMunicion,
            danio, radio
        ) {
            override fun dispara() {

                if (municion != 0) {
                    municion -= municionARestar
                }

                println("balas disparadas = $municionARestar")
            }

            override fun recarga() {
                var municionMax = municion
                municion += municionMax
                println("municion recargada a $municion")
            }
        }

        class Bazooka(
            nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String,
            danio: Int, radio: String
        ) : ArmaDeFuego(
            nombre, municion, municionARestar, tipoDeMunicion,
            danio, radio
        ) {
            override fun dispara() {

                if (municion != 0) {
                    municion -= municionARestar
                }

                println("balas disparadas = $municionARestar")
            }

            override fun recarga() {
                var municionMax = municion
                municion += municionMax
                println("municion recargada a $municion")
            }
        }

    }
}
