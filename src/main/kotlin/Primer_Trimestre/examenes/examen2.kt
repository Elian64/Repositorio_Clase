import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    // (RA2.b,d,h) Resta de dos puntos (Uso del programa)

    var ej1 = Punto("a")
    var ej2 = Punto("b")

    ej1.x = 3
    ej1.y = 2

    ej2.x = 1
    ej2.y = 3

    //println(Punto.componenteDeVector(ej1,ej2))
    //

    // (RA6.a,c) (Uso del programa)

    var p1 = Punto("p1")
    var p2 = Punto("p2")
    var p3 = Punto("p3")
    var p4 = Punto("p4")
    var p5 = Punto("p5")
    var p6 = Punto("p6")
    var p7 = Punto("p7")
    var p8 = Punto("p8")
    var p9 = Punto("p9")

    p1.x = -1
    p1.y = 0

    p2.x = 3
    p2.y = -1

    p3.x = -4
    p3.y = 4

    p4.x = -3
    p4.y = 2

    p5.x = 6
    p5.y = -4

    p6.x = -5
    p6.y = 6

    p7.x = 10
    p7.y = -8

    p8.x = 1
    p8.y = 5

    p9.x = 6
    p9.y = -7

    var lista = listOf<Punto>(p1, p2, p3, p4, p5, p6, p7, p8, p9)
    println(Punto.localizacionGeograficaNs(lista))
//
}

class Punto(var id: String) {

    var x: Int = 0
    var y: Int = 0

    constructor(x: Int, y: Int) : this(id = "") {
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "punto <$id> -> [<$x>,<$y>]"
    }

    companion object {

        fun componenteDeVector(pa: Punto, pb: Punto): Pair<String, Pair<Int, Int>> {

            return Pair(pa.id + pb.id, Pair(pb.x - pa.x, pb.y - pa.y))

        }

        fun localizacionGeograficaNs(lista: List<Punto>): Map<String, List<Punto>> {


            var mapaNorte = lista.filter { it.y >= 0 }
            var mapaSur = lista.filter { it.y < 0 }

            var mapaF: Map<String, List<Punto>> = mapOf("Norte" to mapaNorte, "Sur" to mapaSur)

            return mapaF

        }

        fun distancia(pa: Punto, pb: Punto):Double{

            var d= sqrt((pb.x-pa.x).toDouble().pow(2)+(pb.y-pa.y).toDouble().pow(2))

            return d
        }

    }

    fun obtenerCoordenadas(): Pair<Int, Int> {

        return Pair(x, y)

    }

}
