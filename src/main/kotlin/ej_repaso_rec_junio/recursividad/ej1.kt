package ej_repaso_rec_junio.recursividad

// Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.


fun sumaRecursiva(numero: Int): Int {
    val res: Int
    res = if (numero == 1) {
        //Se termina la recursion
        return 1
    } else {
        //Se llama a si misma la función con el parametro numero menos 1
        numero + sumaRecursiva(numero - 1)
    }

    //Devuelve el resultado
    return res
}

fun main() {

    println(sumaRecursiva(8))

}