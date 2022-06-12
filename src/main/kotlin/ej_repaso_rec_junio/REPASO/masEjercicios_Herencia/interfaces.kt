package ej_repaso_rec_junio.REPASO.masEjercicios_Herencia

//Definir dos clases que representen un Cuadrado y un Rectángulo. Implementar la interface Figura en ambas clases.

interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado() : Figura
{
    override fun calcularSuperficie(): Int {
        TODO("Not yet implemented")
    }
    override fun calcularPerimetro(): Int {
        TODO("Not yet implemented")
    }

}

class Rectangulo() : Figura
{
    override fun calcularSuperficie(): Int {
        TODO("Not yet implemented")
    }
    override fun calcularPerimetro(): Int {
        TODO("Not yet implemented")
    }

}

