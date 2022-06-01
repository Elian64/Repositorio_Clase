package Segundo_Trimestre.examenes

abstract class Musico()

interface Interprete {

    fun interpretar(){

    }

}
/*
class AlumnoMusica(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Interprete
{

    override fun interpretar() {

    }

}*/

class Pianista(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Musico(), Interprete {

    private val piano = Piano()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() = piano.play()
}

class Violinista(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Musico(), Interprete {

    private val violin = Violin()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            violin.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() = violin.play()
}
