import java.awt.List
import java.sql.Time
import java.util.*
import kotlin.math.E

fun main() {

    var juego1 = Juego()

    print(juego1.iniciaJuego())

}

class Juego() {

    companion object{

        var mensaje = readLine()
        var random = (0..EnemigosN1().listaMonstruos.size - 1).random()
        var monstruoRandom = EnemigosN1().listaMonstruos.get(random)
    }

    fun iniciaJuego() {
        println("Elige un personaje para tu aventura")
        println("*".repeat(80))
        println(" 1 -> Caballero \n 2 -> Cazador \n 3 -> Mago \n 4 -> Brujo \n")

        when (mensaje) {

            "1" -> almacenarPersonajeElegido()

            "2" -> almacenarPersonajeElegido()

            "3" -> almacenarPersonajeElegido()

            "4" -> almacenarPersonajeElegido()

            else -> "Personaje no registrado"
        }
        println("¡Comienza la aventura!")
        Nivel1().inicio() // insertar timeouts para que haya tiempo entre funcion y funcion
    }

    fun almacenarPersonajeElegido(){

        var personaje= mensaje
    }

}

class Personaje1(
    var nombre: String = "Caballero",
    var daño: Int = 90,
    var dañoMagico: Int = 0,
    var vida: Int = 200,
    var escudo: Int = 200
) {

}

class Personaje2(
    var nombre: String = "Cazador",
    var daño: Int = 60,
    var dañoMagico: Int = 40,
    var vida: Int = 100,
    var escudo: Int = 150
) {

}

class Personaje3(
    var nombre: String = "Mago",
    var daño: Int = 20,
    var dañoMagico: Int = 110,
    var vida: Int = 100,
    var escudo: Int = 90
) {

}

class Personaje4(
    var nombre: String = "Brujo",
    var daño: Int = 40,
    var dañoMagico: Int = 90,
    var vida: Int = 150,
    var escudo: Int = 50
) {

}


class Nivel1() {



    fun inicio() {

        println("Comienzo del nivel 1, veremos que enemigo te espera...")

        println("Ha aparecido un ${mostrarDatos()}")


    }

    fun mostrarDatos(): String {

        return Juego.monstruoRandom.nombre + "\n" + "Daño = " + Juego.monstruoRandom.daño + "\n" + "Vida = " + Juego.monstruoRandom.vida
    }

    fun luchaMonstruo() {

        while (Juego.monstruoRandom.vida > 0 || Personaje1().vida > 0) {
            println("Que quieres hacer        1|Atacar      2|Defenderse")
            var mensaje = readLine()
            when {

                mensaje == "1" -> {
                    Juego.monstruoRandom.vida = Juego.monstruoRandom.vida - 2
                }
                mensaje == "2" -> {
                }

                else -> "orden no encontrada"
            }
        }

    }


}

class Rival(var nombre: String, var daño: Int, var vida: Int) {

}

class EnemigosN1() { //introducir porcentaje de fallo del ataque

    val monstruo1 = Rival("Gigante", 100, 600)
    val monstruo2 = Rival("Cíclope", 80, 500)
    val monstruo3 = Rival("Hombre-Lobo", 200, 350)
    val monstruo4 = Rival("Anaconda", 170, 420)
    var listaMonstruos = mutableListOf<Rival>(monstruo1, monstruo2, monstruo3, monstruo4)

}
