/*Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos,
el número de puertas y la matrícula. Crear el constructor del coche, así como los métodos estándar: ¿getters, setters? y toString.
En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.*/

class coche(
    var color: String, var marca: String, var modelo: String, var num_caballos: Int,
    var num_puertas: Int, var matricula: String
) {
    override fun toString(): String {
        return "color=$color, marca=$marca, modelo=$modelo, numero de caballos=$num_caballos, numero de puertas=$num_puertas, matricula$matricula."
    }

    fun cambioColor(color: String) {

        this.color = color
    }


}

fun main() {

    //var coche1 = Coche("Rojo", "Ford", "Fiesta", 100, 4, "567890FD")
    //var coche2 = Coche("Verde", "Ferrari", "Portofino", 200, 2, "734936RN")


    /*println(coche1.cambioColor("Naranja"))
    println(coche1)*/

    /*println(coche2.cambioColor("Gris"))
    println(coche2)*/

}
