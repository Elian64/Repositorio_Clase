import java.lang.NullPointerException

fun main() {

    var juego1 = juego()
    juego().inicioPartida()


}


class Recursos() {

    companion object { //variables de caracter general del juego

        var mensaje = readLine()?.toInt()
        var random = (0..ZonaNivel1().listaMonstruos.size - 1).random()
        var monstruoRandom = ZonaNivel1().listaMonstruos.get(random)
        var vidaPersonaje = personajesJugables().listaPersonajes[Lucha().obtenerPersonaje()].vida
        var vidaMaxPersonaje = personajesJugables().listaPersonajes[Lucha().obtenerPersonaje()].vidaMax

        fun personajeElegido() {

            when (mensaje) {

                0 -> {
                    personajesJugables().listaPersonajes[0]
                    println(
                        "Has elegido ${personajesJugables().opcion1.nombre} con ${personajesJugables().opcion1.daño} de daño, " +
                                "${personajesJugables().opcion1.dañoMagico} de daño magico y ${personajesJugables().opcion1.vida} de vida"
                    )
                }
                1 -> {
                    personajesJugables().listaPersonajes[1]
                    println(
                        "Has elegido ${personajesJugables().opcion2.nombre} con ${personajesJugables().opcion2.daño} de daño, " +
                                "${personajesJugables().opcion2.dañoMagico} de daño magico y ${personajesJugables().opcion2.vida} de vida"
                    )
                }
                2 -> {
                    personajesJugables().listaPersonajes[2]
                    println(
                        "Has elegido ${personajesJugables().opcion3.nombre} con ${personajesJugables().opcion3.daño} de daño, " +
                                "${personajesJugables().opcion3.dañoMagico} de daño magico y ${personajesJugables().opcion3.vida} de vida"
                    )
                }
                3 -> {
                    personajesJugables().listaPersonajes[3]
                    println(
                        "Has elegido ${personajesJugables().opcion4.nombre} con ${personajesJugables().opcion4.daño} de daño, " +
                                "${personajesJugables().opcion4.dañoMagico} de daño magico y ${personajesJugables().opcion4.vida} de vida"
                    )
                }

                else -> "Personaje no encontrado"

            }


        }

    }


}

class juego() {


    fun inicioPartida() {

        println("Elige un personaje")
        println("*".repeat(80))
        println(" 0 -> Caballero \n 1 -> Cazador \n 2 -> Mago \n 3 -> Brujo \n")
        Recursos.mensaje
        Recursos.personajeElegido()
        println("Comienza la aventura, veremos que monstruo te espera...")
        println("Ha aparecido ${Recursos.monstruoRandom.nombre} con ${Recursos.monstruoRandom.vida} puntos de vida")
        Lucha().decisionLucha()

    }

}


class Personaje(var nombre: String, var daño: Int, var dañoMagico: Int, var vida: Int, var vidaMax: Int)

class personajesJugables() {

    val opcion1 = Personaje("Caballero", 90, 0, 600, 600)
    val opcion2 = Personaje("Cazador", 60, 40, 400, 400)
    val opcion3 = Personaje("Mago", 20, 110, 350, 350)
    val opcion4 = Personaje("Brujo", 40, 90, 450, 450)
    var listaPersonajes = mutableListOf<Personaje>(opcion1, opcion2, opcion3, opcion4)
}

class Enemigo(var nombre: String, var daño: Int, var vida: Int, var exp:Int) {

}

class ZonaNivel1() { //introducir porcentaje de fallo del ataque

    val monstruo1 = Enemigo("Gigante", 100, 600, 60)
    val monstruo2 = Enemigo("Cíclope", 80, 500, 80)
    val monstruo3 = Enemigo("Hombre-Lobo", 200, 350, 100)
    val monstruo4 = Enemigo("Anaconda", 170, 420, 90)
    var listaMonstruos = mutableListOf<Enemigo>(monstruo1, monstruo2, monstruo3, monstruo4)

}

class MovimientosGigante(){ //intentar poner que solo use ult despues de usar un numero x de veces los otros movimientos

    var mov1= 45
    var mov2= 70
    var mov3= 100
    var ult= 200
    var movimientosG = arrayOf(mov1,mov2,mov3,ult)

    var random = (0..movimientosG.size - 1).random()
    var movimientosRandom =movimientosG.get(random)

}

class Lucha() {

    fun decisionLucha() {

        while (Recursos.monstruoRandom.vida > 0 && Recursos.vidaPersonaje > 0) {

            println("Que quieres hacer        1|Atacar      2|Defenderse    3|Curarte")
            var mensaje2 = readLine()
            if (mensaje2 == "1") {
                peleaAtacar()
            }
            if (mensaje2 == "2") {
                peleaDefender()
            }
            if (mensaje2 == "3") {
                peleaCurar()
            } else "Opción no válida"
        }
        if (Recursos.monstruoRandom.vida <= 0) {
            println("WIN: ¡Monstruo Derrotado!") //pasar a fase 2
        }
        if (Recursos.vidaPersonaje <= 0) {
            println("LOSE: ¡Has perdido! :(")
        }

    }

    fun peleaAtacar() { //si el monstruo llega justo a 0 de vida no puede volver a atacar (terminar) //hacer un set de 4 movimientos para el monstruo,
        // en donde el monstruo si ve la posibilidad de matar al personaje con uno de sus movimientos de un golpe, lo haga

        ataquePersonaje()
        println("el monstruo cuenta ahora con ${Recursos.monstruoRandom.vida} puntos de vida")
        ataqueMonstruo()
    }

    fun peleaDefender() {

        ataqueMonstruoContraDefensa()
        println("(su daño se ha reducido a la mitad ya que te has defendido)")

    }

    fun peleaCurar() { //adecuar la curacion al nivel que tenga el personaje (siendo mayor cuanto mas nivel sea el personaje)
        //si se llama a la funcion, se llama a lose o win reptidas veces (corregir bien haciendo que ataque el monstruo y ya o con un boolean ?)

        var curacion = 150

        when {

            Recursos.vidaPersonaje == Recursos.vidaMaxPersonaje -> {
                println("Vida al completo en este momento")
                Lucha().decisionLucha()
            }

            Recursos.vidaPersonaje + curacion > Recursos.vidaMaxPersonaje -> {
                Recursos.vidaPersonaje = Recursos.vidaPersonaje + (Recursos.vidaMaxPersonaje - Recursos.vidaPersonaje)
                println("Tu personaje se ha curado menos puntos de vida, ahora tiene ${Recursos.vidaPersonaje}")
                ataqueMonstruo()

            }

            Recursos.vidaPersonaje + curacion < Recursos.vidaMaxPersonaje -> {
                Recursos.vidaPersonaje += curacion

                println("Tu personaje se ha curado $curacion puntos de vida, ahora tiene ${Recursos.vidaPersonaje}")
                ataqueMonstruo()

            }

        }

    }

    fun ataqueMonstruo() { //sera mejor hacer un conjunto de movimientos para todos los monstruos en lugar de para uno solo??
        // herencia para movimientos ??
        println("el monstruo ataca!")
        //Recursos.vidaPersonaje -= Recursos.monstruoRandom.daño
        Recursos.vidaPersonaje -= MovimientosGigante().movimientosRandom
        println(
          //  "el monstruo ha inflinjido ${Recursos.monstruoRandom.daño} puntos de daño," +
            "el monstruo ha inflinjido ${MovimientosGigante().movimientosRandom} puntos de daño," +
                    "ahora tu personaje tiene ${Recursos.vidaPersonaje} puntos de vida"
        )

    }

    fun ataqueMonstruoContraDefensa() {
        println("el monstruo ataca!")
        //Recursos.vidaPersonaje -= MovimientosGigante().movimientosG / 2 //como hacerlo??
        println(
            "el monstruo ha inflinjido ${Recursos.monstruoRandom.daño} puntos de daño," +
                    "ahora tu personaje tiene ${Recursos.vidaPersonaje} puntos de vida"
        )


    }

    fun ataquePersonaje() {
        Recursos.monstruoRandom.vida -= (personajesJugables().listaPersonajes[obtenerPersonaje()].daño
                + personajesJugables().listaPersonajes[obtenerPersonaje()].dañoMagico)
    }

    fun obtenerPersonaje(): Int {
        var i = 0
        while (i != Recursos.mensaje) {
            i++
        }
        return i

    }

}
