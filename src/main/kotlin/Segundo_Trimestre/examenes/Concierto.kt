package Segundo_Trimestre.examenes

fun main() {
    val pianista = Pianista()
    val cancion = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    pianista.partitura = cancion
    pianista.interpretar()
}