package Segundo_Trimestre.examenes

class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Musico() {


    var partitura: Array<Nota?> = unaCancion

    override fun interpretar() = piano.play()
}

class Violinista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Musico() {

    var partitura: Array<Nota?> = unaCancion

            set(value) {
                field = value
                violin.reset()
                value.forEach { nota ->
                    i("Violinista.setPartitura", "incorpora nota $nota de canción")
                    nota?.let { violin.incorporaNota(nota) }
                }
            }


    init {
        partitura = unaCancion
    }
    override fun interpretar() = violin.play()

}

 abstract class Musico(): Interprete {
      val piano = Piano()
      val violin = Violin()
      abstract override fun interpretar()

}

/*class AlumnoMusica(): Interprete {

    override fun interpretar() =



}*/

interface Interprete{
    fun interpretar()
}
