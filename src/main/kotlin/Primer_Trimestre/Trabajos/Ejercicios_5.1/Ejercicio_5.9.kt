import java.awt.List
import java.lang.reflect.Array

/*Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible. Además,
se puede consultar el saldo disponible,
recibir abonos y realizar pagos.Crear además una clase Persona, que se caracteriza por un DNI y un vector
(Preguntar al profesor si tienes dudas sobre vector) de cuentas
bancarias. La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 que es el máximo).
También debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo).
En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta,
una sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta,
pero tiene que pagar elalquiler de 750 euros con la segunda. Imprimir por pantalla si la persona es morosa.
Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y
mostrar por pantalla el estado de la persona.*/

class Cuenta(var numeroCuenta: Int, var saldo: Double) {

    fun consultarSaldo(): String {

        return "Su saldo es $saldo"

    }

    fun recibirAbono(abono: Double) {

        this.saldo = this.saldo + abono

    }

    fun realizarPago(pago: Double) {

        this.saldo = this.saldo - pago

    }

    fun cuentaNegativa(): String {
        return if (saldo < 0) {
            "Cuenta con impagos pendientes"
        } else "Cuenta sin impagos"

    }
}

class Persona(var DNI: String) {


    var cuentasBancarias: MutableList<Cuenta> = ArrayList(3)

    fun addCuenta(numeroCuenta: Cuenta) { //mirar porque no funciona el bucle
        var contador = 3
            for (i in 1..contador) {
                this.cuentasBancarias.add(numeroCuenta)
            }
            println("No es posible tener mas de 3 cuentas en propiedad")

    }


}


fun main() {

    var Persona1 = Persona("99456713T")
    var Cuenta1 = Cuenta(12345678, 0.0)
    var Cuenta2 = Cuenta(87654321, 700.0)
    var Cuenta3 = Cuenta(87654321, 700.0)
    var Cuenta4 = Cuenta(87654321, 700.0)

    println(Persona1.addCuenta(Cuenta1))
    println(Persona1.addCuenta(Cuenta2))
    println(Persona1.addCuenta(Cuenta3))
    println(Persona1.addCuenta(Cuenta4))

    println(Cuenta1.recibirAbono(1100.0))
    println(Cuenta2.realizarPago(750.0))
    println(Cuenta1.cuentaNegativa())
    println(Cuenta2.cuentaNegativa())


}
