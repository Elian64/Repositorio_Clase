package `Colecciones-4`

/* Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:

data class Fecha(val dia: Int, val mes: Int, val año: Int)

Como valor en el mapa almacenar un String. Implementar las siguientes funciones:

    Carga de datos en la agenda.
    Listado completo de la agenda.
    Consulta de una fecha.
*/

fun main() {

    fun cargarDato(agenda: MutableMap<Fecha, String>) {

        println("Introduzca una fecha")
        println("día: ")
        val dia = readLine()!!.toInt()
        print("mes: ")
        val mes = readLine()!!.toInt()
        print("año: ")
        val año = readLine()!!.toInt()
        print("Evento para ese día: ")
        val evento = readLine()!!

        agenda[Fecha(dia, mes, año)] = evento

    }

    fun consultaFecha(agenda: MutableMap<Fecha, String>) {

        println("Ingrese una fecha a consultar")
        print("día: ")
        val dia = readLine()!!.toInt()
        print("mes: ")
        val mes = readLine()!!.toInt()
        print("año: ")
        val año = readLine()!!.toInt()
        val fecha = Fecha(dia, mes, año)
        if (fecha in agenda)
            println("Evento: ${agenda[fecha]}")
        else
            println("No existen eventos en esa fecha")
    }

    fun listado(agenda: MutableMap<Fecha, String>) {
        for ((fecha, evento) in agenda) {
            println("Fecha ${fecha.dia} de ${fecha.mes} del ${fecha.año}")
            println("Eventos: $evento")
        }
    }

    var agenda: MutableMap<Fecha, String> = mutableMapOf()


    cargarDato(agenda)
    listado(agenda)

    consultaFecha(agenda)


}

data class Fecha(val dia: Int, val mes: Int, val año: Int)
