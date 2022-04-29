fun main() { //es necesario si o si usar un array bidimensional (mirar)

    JuegoBarcos().inicio()

}

class JuegoBarcos() {

    fun inicio() {

        println("Elige la posición de tus barcos")
        println(RecursosInGame().mapaJuego())
    }

}

class RecursosInGame() {

    companion object {

        var mensaje = readLine()?.toInt()

    }

    fun mapaJuego() {

        println("& A B C D E F G H I J")
        println("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n")

    }

    fun posicionBarcos(){
        

    }

}
