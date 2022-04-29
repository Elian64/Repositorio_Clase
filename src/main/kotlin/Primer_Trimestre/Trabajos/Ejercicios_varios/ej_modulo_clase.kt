package Primer_Trimestre.Trabajos

/* Módulo, que tendrá
un array de los alumnos matriculados, al listarse quedarán ordenados por el identificador del alumno.
un array bidimensional, 3 evaluaciones + uno final, que almacena un array de notas de alumnos ordenadas según el orden de los alumnos.
(Guarda la información de la nota el mismo valor del índice en el que se encuentra el alumno. Es decir, si por ejemplo el estudiante
Pedro está en la posición 2 del array de estudiantes del módulo, su nota estaría en la posición 2 del array de notas.)
Alumnos
identificador numérico en el instituto.
nombre y apellidos.
Crea las clases y métodos que creas conveniente para realizar las operaciones que se listan a continuación.
*Crea un programa con 1 módulo de 15 alumnos, matricular 10 alumnos. Rellena las notas de la 1, 2 y 3 Evaluación.
*Calcula la nota final de los módulos como la media de las 3 Evaluaciones.
*Obtener lista de alumnos, nota con las notas por evaluación, por defecto final.
*Para un módulo, calcular cuantos alumnos han aprobado por evaluación, por defecto final.
Para un módulo, calcular la nota más baja por evaluación, por defecto final.
Para un módulo, calcular la nota más alta por evaluación, por defecto final.
Para un módulo, calcular la nota media entre todos los alumnos por evaluación, por defecto final.
Para un módulo, calcular si alguno tiene un 10 por evaluación, por defecto final.
Para un módulo, calcular si hay alumnos aprobados por evaluación, por defecto final.
Para un módulo, calcular la primera nota que no ha superado el 5 por evaluación, por defecto final.
Obtener una lista con los alumnos ordenados ascendiente según su nota por evaluación, por defecto final.
*Poder matricular alumnos siempre que no se llegue al máximo de alumnos.
*Dar de baja alumnos.*/

class Modulo(var numeroAlumnos: Int = 15) {

    //array de notas
    var alumnos = arrayOfNulls<Alumno>(numeroAlumnos)

    //array bidimensional
    var notas = Array(4) { FloatArray(numeroAlumnos) { -1.0F } }

    fun establecerNota(idAlumno: String, evaluacion: String, nota: Float): Boolean {

        notas[evaluacion.toInt()][idAlumno.toInt()] = nota

        return true
    }

    fun matriculaAlumno(alumno: Alumno): Boolean {

        if (alumno !in alumnos && alumnos.contains(null)) {

            alumnos[alumnos.indexOf(null)] = alumno

            return true
        }
        return false
    }

    fun bajaAlumno(idAlumno:String): Boolean{

        var i=0
        while (idAlumno.toInt() != alumnos[i]?.id?.toInt()){
            i++
        }
        alumnos[i]=null
        return true
    }

    fun calculaEvaluacionFinal(ID: String) {

        var evFinal = (notas[0][ID.toInt()] + notas[1][ID.toInt()] + notas[2][ID.toInt()]) / 3
        println(evFinal)
    }

    fun hayAlumnosAprobados(evaluacion:String): Boolean {


        var aprobados = notas[evaluacion.toInt()].count { it >= 5 }
        if (aprobados > 0) {
            return true
        }
        return false
    }

    fun numeroAprobados(evaluacion:String): Int{

        var aprobados = notas.count { it[evaluacion.toInt()] >= 5 }
        return aprobados

    }

    fun hayAlumnosConDiez(evaluacion: String): Boolean {

        var alumnoDiez = notas[evaluacion.toInt()].count { it.equals(10.0F) }
        if (alumnoDiez > 0) {
            return true
        }
        return false
    }

    fun primeraNotaNoAprobada(evaluacion:String): Float{ //porque no funciona?? devuelve -1 (nota vacía)

        var primerNoAprobado= notas.filter { !it[evaluacion.toInt()].equals(-1.0F) }.indexOfFirst { it[evaluacion.toInt()] <5 }.toFloat()
        return primerNoAprobado

    }

    fun notaMasBaja(evaluacion: String): Float {

        var notaMasBaja = notas.filter { !it[evaluacion.toInt()].equals(-1.0F) }.minOf { it[evaluacion.toInt()] }
        return notaMasBaja
    }

    fun notaMasAlta(evaluacion: String): Float { //comprobar pq no funciona correctamente

        var notaMasAlta = notas.filter { !it[evaluacion.toInt()].equals(-1.0F) }.maxOf { it[evaluacion.toInt()] }
        return notaMasAlta

    }

    fun notaMedia(evaluacion: String): Float { //Lo hace bien si todas las notas estan introducidas

        var notaMedia = notas[evaluacion.toInt()].average().toFloat()
        return notaMedia
    }

    fun listaNotasOrdenados(evaluacion:String)/*: List<Alumno> */{ //tendría que ser al revés (Pair)

        var lista = notas[evaluacion.toInt()].sorted()


        // return lista
        println(lista)
    }


}

data class Alumno(var id: String, var nombre: String, var ap1: String, var ap2: String) {


}


fun main() {

    var alumno1 = Alumno("0", "Pedro", "Pérez", "Alonso")
    var alumno2 = Alumno("1", "Lucas", "Pastor", "Romero")
    var alumno3 = Alumno("2", "Maria", "López", "Gil")
    var alumno4 = Alumno("3", "Fernanda", "Soria", "Navarro")
    var alumno5 = Alumno("4", "Adrian", "Méndez", "Serrano")
    var alumno6 = Alumno("5", "Fernando", "García", "Blanco")
    var alumno7 = Alumno("6", "Germán", "Sánchez", "Ortega")
    var alumno8 = Alumno("7", "Sofía", "Martín", "Delgado")
    var alumno9 = Alumno("8", "Andrés", "Jimenez", "Rubio")
    var alumno10 = Alumno("9", "Miguel", "Hernandez", "Marín")

    var modulo1 = Modulo()

    modulo1.matriculaAlumno(alumno1)
    modulo1.matriculaAlumno(alumno2)
    modulo1.matriculaAlumno(alumno3)

    modulo1.establecerNota("0", "0", 0.5F)
    modulo1.establecerNota("0", "1", 4.0F)
    modulo1.establecerNota("0", "2", 6.0F)

    modulo1.establecerNota("1", "0", 3.0F)
    modulo1.establecerNota("1", "1", 0.8F)
    modulo1.establecerNota("1", "2", 2.0F)

    // println(listOf(modulo1))

    // modulo1.calculaEvaluacionFinal("0")
    // println(modulo1.numeroAprobados("1"))
    // println(modulo1.notaMasAlta("0"))
    // println(modulo1.notaMasBaja("1"))
    // println(modulo1)
    // println(modulo1.notaMedia("1"))
    // println(modulo1.hayAlumnosConDiez("1"))
    // println(modulo1.primeraNotaNoAprobada("1"))
    // println(modulo1)
    // println(modulo1.bajaAlumno("0"))
    // println(modulo1)
    // println(modulo1.listaNotasOrdenados("0"))

}