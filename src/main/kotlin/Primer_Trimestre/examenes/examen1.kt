// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################
fun main() {
    // Declaración de variables
    // Aqui tienes que definir las variables que se utilizan
    var edad:Byte
    var mes:Byte
    var entrada:String
    var listaEntrada:List<String>
    var miNombre:String="Elian Deniz Saiz"


    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    listaEntrada = entrada.split(",")

    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")

    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    }
    else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {listaEntrada[0].trim().toByte()} catch (_: Exception) {-1}
        mes = try {listaEntrada[1].trim().toByte()} catch (_: Exception) {-1}

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        }
        //Condicional que me asegure que la edad introducida es válida (entre 6 y 12 incluidos)
        else if (edad<6 || edad>12){
            println("Edad:$edad. No se contempla esta edad.")
            println("_".repeat(80))
        }
        //Condicional que me asegure que el mes introducido es valido (entre 1 y 12 incluidos)
        else if (mes>12){

            println("Mes:$mes. El mes es erroneo.")
            println("_".repeat(80))

        }

        else //Sino, continuo
        {
            //TODO("Aquí el código de la cabecera")
            when {

                edad in 6..8 && mes%2==0 -> println("" + tablaMultiplicar(2) + tablaMultiplicar(4))
                edad in 6..8 && mes%2!=0 -> println("" + tablaMultiplicar(1) + tablaMultiplicar(3)+ tablaMultiplicar(5))
                edad in 9..10 && mes%2==0 -> println("" + tablaMultiplicar(6) + tablaMultiplicar(8) + tablaMultiplicar(10))
                edad in 9..10 && mes%2!=0 -> println("" + tablaMultiplicar(7) + tablaMultiplicar(9))
                edad in 11..12 && mes%2==0 -> println("" + tablaMultiplicar(11) + tablaMultiplicar(12) + tablaMultiplicar(13))
                edad in 11..12 && mes%2!=0 -> println("" + tablaMultiplicar(11) + tablaMultiplicar(12) + tablaMultiplicar(13))

            }

            //Edad: 8. El alumno está dentro del rango [6-8]
            //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
            println("La edad es $edad y el mes es $mes")

            // Linea final cabecera
            println("_".repeat(80))

            //Imprime las las tablas en función de
            //TODO("Aquí las tablas")

        }

    }
    // Linea final de programa
    println("*".repeat(80))

}

// Esta se trata de la función que nos crea la tabla de multiplicar que usar en nuestra funcion principal
fun tablaMultiplicar(n:Int){
    var asteriscos:String="*".repeat(11)
    println("TABLA DEL $n\n$asteriscos")
    for (i in 1..10) {
        val product = n * i
        println("$n * $i = $product")
    }
    println("\n")

}
