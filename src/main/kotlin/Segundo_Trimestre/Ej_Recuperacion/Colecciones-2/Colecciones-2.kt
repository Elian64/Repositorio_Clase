package `Colecciones-2`

import java.awt.List

/*Problemas propuestos

    Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20. contar cuantos hay comprendidos
    entre 1 y 4, 5 y 8 y cuantos entre 10 y 13. Imprimir si el valor 20 está presente en la lista.*/

/*fun main(){

    var lista100elementos:MutableList<Int> = MutableList(100) { (0..20).random() }

    for(element in lista100elementos)
       println(element)

    var contador1y4=0
    var contador5y8=0
    var contador10y13=0
    var contador20=0

    for(i in 0 until lista100elementos.size) {
        if (lista100elementos[i] in (5..8))
            contador1y4++
    }
    for(i in 0 until lista100elementos.size) {
        if (lista100elementos[i] in (5..8))
            contador5y8++
    }
    for(i in 0 until lista100elementos.size) {
        if (lista100elementos[i] in (10..13))
            contador10y13++
    }
    for(i in 0 until lista100elementos.size) {
        if (lista100elementos[i] in (10..13))
            contador10y13++
    }
    for(i in 0 until lista100elementos.size) {
        if (lista100elementos[i]==20)
            contador20++
    }
    println("Hay $contador1y4 numeros entre el 1 y el 4")
    println("Hay $contador5y8 numeros entre el 5 y el 8")
    println("Hay $contador10y13 numeros entre el 10 y el 13")
    println("Hay $contador20 numeros iguales a 20")

}*/


/* Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo. Definir una lista mutable con tres empleados.
   Imprimir los datos de los empleados. Calcular cuanto gasta la empresa en sueldos. Agregar un nuevo empleado a la lista y calcular
   nuevamente el gasto en sueldos.*/

/*fun main() {

    var listaEmpleados = mutableListOf<Empleado>(
        Empleado("Rodolfo", 1200.0),
        Empleado("Rafaela", 1150.0), Empleado("Ricardo", 980.0)
    )

    var dineroGastadoSueldos=0.0

    for(element in listaEmpleados)
        println(element)

    for(i in 0 until listaEmpleados.size)
    dineroGastadoSueldos+= listaEmpleados[i].sueldo

    println("El dinero gastado en sueldos es $dineroGastadoSueldos")
}


data class Empleado(var nombre: String, var sueldo: Double) {

}*/

/* Cargar por teclado y almacenar en una lista inmutable las alturas de 5 personas (valores Float) Obtener el promedio de las mismas.
Contar cuántas personas son más altas que el promedio y cuántas más bajas.*/

data class Persona(var nombre: String, var altura: Float)

fun main() {

    var listaAlturas = mutableListOf<Float>()


    for (i in 0..4) {
        println("Introduzca una altura")
        var entrada = readLine()!!.toFloat()
        listaAlturas.add(entrada)
    }

    var promedio = listaAlturas.average().toFloat()
    println(promedio)

    var masAltaPromedio = listaAlturas.filter { it > listaAlturas.average() }
    var masBajaPromedio = listaAlturas.filter { it < listaAlturas.average() }

    var masAltos = masAltaPromedio.count()
    var masBajos = masBajaPromedio.count()

    println("Hay $masAltos personas mas altas que el promedio")
    println("Hay $masBajos personas mas bajas que el promedio")
}













