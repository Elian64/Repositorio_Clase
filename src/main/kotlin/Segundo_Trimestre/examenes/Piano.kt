package Segundo_Trimestre.examenes//Un piano es un instrumento que interpreta las notas con un timbre muy característico

//Un piano es un instrumento que interpreta las notas con un timbre muy característico

abstract class Instrumento {
    abstract fun incorporaCancion(cancion: Array<Nota?>)
    abstract fun play()
    abstract fun incorporaNota(nota: Nota)
    abstract fun reset()

}

class Piano : Instrumento() {

    //tabla que almacena las notas a interpretar
    private var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()
    override fun incorporaCancion(cancion: Array<Nota?>) {

    }

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("Tocando piano")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miiii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
            }
        }
        println("")
    }
}

class Violin : Instrumento() {

    //tabla que almacena las notas a interpretar
    private var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()
    override fun incorporaCancion(cancion: Array<Nota?>) {
    }

    //Recorreremos las notas y las interpretaremos de la forma específica del violin.
    override fun play() {
        println("Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooouuuuuuuuuuuuuuuuuu ")
                Nota.RE -> print("reeeuuuuuuuuuuuuuuuu ")
                Nota.MI -> print("miiiiuuuuuuuuuuuuuuuu ")
                Nota.FA -> print("faaauuuuuuuuuuuuuuu ")
                Nota.SOL -> print("soooluuuuuuuuuuuuuuuu ")
                Nota.LA -> print("laaauuuuuuuuuuuuuuuuuu ")
                Nota.SI -> print("siiiiuuuuuuuuuuuuuuuu ")
            }
        }
        println("")
    }
}


