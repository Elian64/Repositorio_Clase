package Primer_Trimestre.Trabajos.Ejercicios_6.`1`

fun main() {
// b) crear un ejemplo de cada herencia (falta por hacer)
}

//Herencia de especialización

open class Automovil(var n_ruedas: Int, var matricula: String, var peso: Double) {

}

class Camion(n_ruedas: Int = 8, matricula: String, peso: Double, tipo_camion: String) :
        Automovil(n_ruedas, matricula, peso) {

}

//Herencia de especificación

open class Pila() {

    open fun apilar() {}

    open fun desapilar() {}

    open fun tope() {}
}

class PilaDeEnteros() : Pila() {

}

//Ejercicios de Teoría
/*
c) Di que tipo de herencia es: (Especialización, Extensión, Especificación, Construcción).
- Especialización: Herencia por la cual designamos una clase base, en la cual otra clase hija se basará en ella para aportar una clase personalizada
- Extensión: Herencia basada en heredar propiedades de la base, sin tener porque aportar una gran diferencia frente a esta
- Especificación: Herencia en donde definimos una interfaz, que definnirá las aptitudes de varias clases hijas que aplicarán la herencia
- Construcción: Herencia en la que no necesariamente tenga algo que ver con la base, heredando propiedades del padre, pero sin necesidad de tener alguna relación con este
d) ¿Quién es la superclase y subclase?
La superclase, es la clase base o clase padre, la cual define los atributos y/o funciones que deben heredar las clases hijas. Mientras que la subclase, es la
clase que hereda de esta clase padre, heredando todo lo que tenga esta.
e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
Podríamos implementarlo creando clases individuales para cada uno, pero sería poco eficiente ya que estaríamos repitiendo código y perdiendo tiempo
f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.
La herencia aporta grandes ventajas a la hora de crear código, ya que, en un contexto similar, podemos heredar código para no repetirlo, cosa que nos acorta
bastante el trabajo.
*/