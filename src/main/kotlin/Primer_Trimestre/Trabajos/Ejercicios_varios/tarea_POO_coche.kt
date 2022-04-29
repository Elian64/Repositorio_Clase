package Primer_Trimestre.Trabajos.Ejercicios_varios

class Coche( // Faltan: Color por defecto (blanco)
    var marca: String, var matricula: String, var modelo: String,
    var puertas: Int, var caballos: Int, var velocidad: Int, var velocidadMax: Int, var color: String = "Blanco",
    var gasolina: Int, var marchaActual: Int, var tanque: Int
) {

    companion object {

        fun comparaCoches(coche: Coche, coche2: Coche) {

            if (coche.velocidad > coche2.velocidad) {

                println("El $coche (velocidad=${coche.velocidad}) es mas rápido que el $coche2 (velocidad=${coche2.velocidad})")
            } else
                println("El $coche2 (velocidad=${coche2.velocidad}) es mas rápido que el $coche (velocidad=${coche.velocidad})")
        }

    }

    init {
        require(marca != null)
        require(velocidad in 10..250)
    }

// funciones de mostrar datos acerca del coche (mostrar: marcha actual, velocidad actual, descripción y estado)

    fun mostrarMarchaActual(): Int {

        return marchaActual
    }

    fun mostrarVelocidadActual(): Int {

        return velocidad

    }

/*fun mostrarDescripcion():String{

    return descripcion
}

fun mostrarEstado():String{

    return estado
}*/

// funciones que hace el coche (encender, apagar, incrementar marcha, decrementar marcha, iniciar, acelerar, parar y frenar

    fun encender(): Boolean { //falta lo de si el coche esta no encendido
        return marchaActual != 0 && gasolina != 0
        iniciar()
    }

    fun apagar() {

        velocidad = 0
        marchaActual = 0

        println(
            "Coche apagado, todos sus valores alterados se encuentran en su estado " +
                    "de inicio: Velocidad= $velocidad, Marcha=$marchaActual."
        )
    }

    fun incrementaMarcha() {
        if (marchaActual < 5) {
            marchaActual += 1
            println("se ha subido un nivel la marcha, marcha= $marchaActual")
        } else println("No es posible incrementar las marchas por encima de 5")
    }

    fun decrementaMarcha() {
        if (marchaActual < 0) {
            marchaActual -= 1
            println("se ha bajado un nivel la marcha, marca= $marchaActual")
        } else println("No es posible decementar la marcha por debajo de 0")
    }

    fun llenarTanque(): String {

        if (gasolina < tanque) {
            gasolina += (tanque - gasolina)
            return "Tanque llenado a su capacidad máxima ($tanque)"
        } else return "Tanque llenado en su capacidad máxima"

    }

    fun iniciar(): String {

        if (encender() == true) {
            marchaActual = 1
            return ("Coche iniciando")
            acelerar()
        } else return "Coche en espera de iniciarse (Se incumplen requisitos)"
    }

    fun acelerar() {

        if (gasolina != 0 && gasolina > 0 && velocidad < velocidadMax) {

            velocidad += 5
            println("Velocidad subida a $velocidad")
            when (marchaActual) {
                1 -> gasolina -= 1
                2 -> gasolina -= 2
                3 -> gasolina -= 3
                4 -> gasolina -= 4
                5 -> gasolina -= 5

            }

            println("Combustible del coche= $gasolina")
        } else
            when {

                gasolina == 0 && gasolina < 0 -> {
                    println("Coche sin combustible en el tanque")
                    parar()
                }
                velocidad >= velocidadMax -> {
                    println("El coche ha excedido el límite de velocidad que tiene")
                    parar()
                }

            }

    }

    fun parar() {

        marchaActual = 0
        println("La marcha actual se ha fijado a $marchaActual")
        while (velocidad > 0) {
            frenar()
        }

    }

    fun frenar() {

        while (velocidad > 0) {
            velocidad -= 5
            println("Velocidad bajada a $velocidad")
        }


    }
    
    override fun toString(): String {
        return "$marca $modelo"
    }


}


fun main() {

    var coche1 = Coche(
        "Ford", "786789FC", "Fiesta",
        4, 100, 190, 200, "Rojo",
        10, 3, 180
    )

    var coche2 = Coche(
        "Seat", "786789FC", "Panda",
        4, 80, 60, 180, "Verde",
        70, 2, 200

    )

    /*println(coche1.llenarTanque())
    println(coche1.encender())
    println(coche1.iniciar())
    (coche1.incrementaMarcha())
    (coche1.incrementaMarcha())
    (coche1.incrementaMarcha())
    (coche1.incrementaMarcha())
    (coche1.acelerar())
    (coche1.acelerar())
    (coche1.acelerar())
    (coche1.acelerar())
    (coche1.acelerar())*/

    Coche.comparaCoches(coche1, coche2)

}

