package Tercer_Trimestre.Ejs_repaso_examen

import java.io.File

class BattleRoyal() {

    //numeros linea por linea dispuestos en una posicion unica de una lista
    fun listaAnumeros(archivo: File): List<String> = archivo.readLines()

    fun dimensionesPartida(listaPartida: List<String>): List<String> = listaPartida[0].split(" ")

    fun tiempoPartida(listaPartida: List<String>): Int = listaPartida[1].toInt()

    fun jugadoresPartida(listaPartida: List<String>): MutableList<String> {

        //lista de jugadores
        val listaJuadores = mutableListOf<String>()

        //jugadores añadidos
        for (i in 2 until listaPartida.size) {
            listaJuadores.add(listaPartida[i].split(" ").toString())
        }

        return listaJuadores
    }

    fun partida(dimensiones: List<String>, tiempo: Int, jugadores: MutableList<String>): Int {

        var contadorJugadores = jugadores.size
        var campoDeBatalla = IntArray(dimensiones[0].toInt() * dimensiones[1].toInt())

        while (tiempo >= 10) { //falta lo de la almohadilla (no olvidar!)

            campoDeBatalla.size - (dimensiones[0].toInt() - 2 * dimensiones[1].toInt() - 2) //revisar ya que alomejor no se reduce el campo (no se actualiza)

            for (i in jugadores.indices) {
                if (jugadores[i].toInt() * jugadores[i + 1].toInt() > campoDeBatalla.size) {
                    contadorJugadores--
                }

            }
        }

        return contadorJugadores

    }

}

fun main() {

    //var path = "/home/aneli/Escritorio/test-2.in" //para Linux
    var path = "C:\\Users\\usarioT\\Desktop\\test-2.in.txt" //Para Windows
    var archivo = File(path)
    println(archivo.readText())

    var batalla1 = BattleRoyal()
    println(batalla1.listaAnumeros(archivo))

    var listaDatos = batalla1.listaAnumeros(archivo)

    //comprobacion de que funciona las dimensiones del campo
    /*var archivoAtexto = batalla1.listaAnumeros(archivo)
    var productoDimensiones = archivoAtexto[0].split(" ")
    println(productoDimensiones.get(0).toInt() * productoDimensiones.get(1).toInt())*/
}