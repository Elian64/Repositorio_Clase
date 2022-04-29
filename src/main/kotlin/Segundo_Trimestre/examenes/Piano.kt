package Segundo_Trimestre.examenes//Un piano es un instrumento que interpreta las notas con un timbre muy característico

/**
 * La clase instrumento, define nuestra molde
 * en el que se basan ambos instrumentos existentes
 *
 * fun incorporaNota(nota:Nota) -> nos añade una nota a melodía
 * fun play() -> toca nuestro instrumento
 * fun reset() -> limpia nuestra melodía de notas existentes
 * fun incorporaCancion(array: Array<Nota?>) -> añade una nueva lista de notas personalizada
 */
 abstract class Instrumento(){
    private var melodia = mutableListOf<Nota>()
    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }
    fun reset() = melodia.clear()
     abstract fun play()
    abstract fun incorporaCancion(array: Array<Nota?>)


}

class Piano(): Instrumento(){
    private var melodia = mutableListOf<Nota>()
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
    override fun incorporaCancion(array: Array<Nota?>) {
        for(i in 0 until melodia.size) {
            melodia.add(array[i]!!)
        }
    }

}

class Violin(): Instrumento(){
    private var melodia = mutableListOf<Nota>()
    override fun play() {
        println("Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doooooooouuuuuuuu ")
                Nota.RE -> print("reeeooooouuuuuuuu ")
                Nota.MI -> print("miiiiooooouuuuuuuu ")
                Nota.FA -> print("faaaooooouuuuuuuu ")
                Nota.SOL -> print("sooolooooouuuuuuuu ")
                Nota.LA -> print("laaaooooouuuuuuuu ")
                Nota.SI -> print("siiiiooooouuuuuuuu ")
            }
        }
        println("")
    }
    override fun incorporaCancion(array: Array<Nota?>) {
        for(i in 0 until melodia.size) {
            melodia.add(array[i]!!)
        }
    }

}




