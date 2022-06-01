package ej_repaso_rec_junio.REPASO.masEjercicios_Herencia

abstract class vehiculo()
{
    abstract fun conducir(): String
}

class Coche() : vehiculo()
{
   override fun conducir(): String
   {
       return "brum brum"
   }

}

class Moto() : vehiculo()
{
    override fun conducir(): String {
        return "brim brim"
    }
}


fun main()
{


}