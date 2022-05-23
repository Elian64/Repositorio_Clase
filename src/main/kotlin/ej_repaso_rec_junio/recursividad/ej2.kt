package ej_repaso_rec_junio.recursividad

// Factorial de un número.

fun factorial(n: Int):Int{

    var resultado =
        if(n==1) return 1
    else {
            n * factorial(n - 1)
        }
    return resultado

}


fun main()
{
println(factorial(4))

}