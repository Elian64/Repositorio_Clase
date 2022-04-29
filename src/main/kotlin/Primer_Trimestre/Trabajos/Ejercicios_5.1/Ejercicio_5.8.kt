/*Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos, sólo hora y minuto o
sólo la hora (si no se indica, el valor de minuto o segundo será 0). Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los segundos o los
minutos (y segundos, claro) e instancie la clase Tiempo mostrando su valor.*/

class Tiempo(var hora:String, var minuto:String, var segundo:String) //se puede poner var minuto:Int=0 (para marcar 0 como valor por defecto)
{
    init {
        if(minuto==""){minuto="0"}
        if(segundo==""){segundo="0"}

    }
    override fun toString(): String {
        return "$hora h $minuto m $segundo s"
    }


}

fun main(){

    var hora1 = Tiempo(readLine()!!, readLine()!!, readLine()!!)

    println(hora1)
}
