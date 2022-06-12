package ej_repaso_rec_junio.REPASO.masEjercicios_Herencia

/*Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo. Definir las propiedades y métodos comunes entre una caja
de ahorro y un plazo fijo y agruparlos en la clase Cuenta. Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto.
Un plazo fijo añade un plazo de imposición en días y una tasa de interés. Hacer que la caja de ahorro no genera intereses.
En la función main del programa definir un objeto de la clase CajaAhorro y otro de la clase PlazoFijo.*/

abstract class Cuenta(var nombre: String, var monto: Int)

class CajaAhorra(nombre: String, monto: Int) : Cuenta(nombre, monto)

class PlazoFijo(nombre: String, monto: Int, plazoImp: Int, tasaInteres: Double) : Cuenta(nombre, monto)

fun main()
{
    var ejCaja = CajaAhorra("Pepe", 34)
    var ejPlaz = PlazoFijo("María", 46, 4, 34.5)

}