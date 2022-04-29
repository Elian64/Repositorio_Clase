package Arrays1

/* Problemas propuestos
Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe: El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36. Cantidad de valores mayores a 50. (Definir dos for, en el primero realizar la carga
y en el segundo proceder a analizar cada elemento)*/

/*fun main() {

    var arreglo8enteros = IntArray(8)
    var acumulado36 = 0
    var acumulado50 = 0

    for (i in 0..7) {
        println("Introduzca un entero")
        var entero = readLine()!!.toInt()
        arreglo8enteros[i] = entero

    }

    for (i in 0..7)
        println("Valor ${i+1} = ${arreglo8enteros[i]}")

    for (i in 0..7) {

        if (arreglo8enteros[i] > 36)
            acumulado36++

        if (arreglo8enteros[i] > 50)
            acumulado50++

    }

    println("El número de enteros acumulados mayores que 36 es $acumulado36")
    println("El número de enteros acumulados mayores que 50 es $acumulado50")
}*/


/*Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un
tercer arreglo del mismo tamaño.
 */

/*fun main() {

   var arreglo1:IntArray = IntArray(4)
   var arreglo2:IntArray = IntArray(4)

   for (i in 0..3) {
       println("Introduzca un entero para el arreglo 1")
       var entero = readLine()!!.toInt()
       arreglo1[i] = entero

   }

   for (i in 0..3) {
       println("Introduzca un entero para el arreglo 2")
       var entero1 = readLine()!!.toInt()
       arreglo2[i] = entero1

   }


   for (i in 0..3) {

       var arregloDeSuma:IntArray = IntArray(4)

       arregloDeSuma[i] = arreglo1[i]+arreglo2[i]
       println("El valor de la suma de la ${i + 1} operacion, es ${arregloDeSuma[i]}")

   }


}*/