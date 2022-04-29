import java.util.*

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    /*var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)*/

    var prueba = Pila<String>()
    /*prueba.push("one")
    prueba.push("two")
    prueba.push("three")
    println(prueba.tope())
    prueba.pop()
    println(prueba.tope())
    println(prueba.vacia())
    prueba.pop()
    prueba.pop()
    println(prueba.vacia())*/
    println(prueba.reverse3(numbers))



}

class Pila<T>() { // eso igual va aquí o dentro de la clase pila

    private val pila = mutableListOf<T>()

    override fun toString(): String {
        return pila.toString()
    }

    fun tope(): T = pila.last() // Devuelve el elemento en la cabeza de la pila.

    fun push(elemento: T) = pila.add(elemento) // Insertar o apilar

    fun pop() = pila.remove(pila.last()) // Eliminar o desapilar

    fun vacia(): Boolean = pila.isEmpty() ?: false // Si está vacía (tope es nulo, o tamaño es 0) o si contiene algún elemento

    fun reverse() {

        try { //try_catch para evitar la excepción de lista vacía al borrar los últimos valores para que haga el reverse
            for (i in 0..pila.size) {

                println(pila.last())
                pila.remove(pila.last())
            }
        } catch (e: NoSuchElementException) {
            println("")
        }
    }

    fun reverse2(lista: List<T>):Pila<T> {

        val pilaIterator = pila.iterator()
        var lista2: Pila<T> = Pila()
        var ultimo = lista.size - 1


        for(i in 0..pila.size){
            lista2.push(lista[ultimo])
            ultimo--
        }

        return lista2
    }

    fun reverse3(lista: List<T>):Pila<T> {

        val pilaIterator = pila.listIterator()
        var lista2: Pila<T> = Pila()

        while(pilaIterator.hasNext()){
            lista2.push(pilaIterator.next())
        }

        for(i in 0..lista.size-1){
            println(lista.last())

        }
        
        return lista2
    }

}
