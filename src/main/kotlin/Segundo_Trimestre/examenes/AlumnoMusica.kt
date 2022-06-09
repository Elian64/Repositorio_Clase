package Segundo_Trimestre.examenes

//Clase que utiliza un instrumento, pero no como músico.
/*
class AlumnoMusica(instrumento: Instrumento, unaCancion: Array<Nota?>) : Interprete {
    override val instrumento = instrumento

    //Utilizo el setter para incorporar la canción al instrumento
    override var partitura = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Alumno.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    //Utilizo un init para llamar al setter de partitura.
    init {
        partitura = unaCancion
    }

    override fun interpretar() {
        i("Alumno.Interpretar", "se ejecuta fun interpretar")
        println("####### - SOY ALUMNO DE MUSICA")
        instrumento.play()
        println("")
        i("Alumno.Interpretar", "se termina la ejecución de fun interpretar")
    }

}*/