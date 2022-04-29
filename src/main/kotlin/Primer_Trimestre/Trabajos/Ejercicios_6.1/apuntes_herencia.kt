fun main(){

// var ejemplo= Child("nombre") error

}

interface MyInterface {
    fun bar(): String // abstract por defecto
    fun foo() = 1 + 1 //Cuerpo opcional
}

abstract class Child(var nombre:String) : MyInterface {

}

interface Named {
    val name: String
}
interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
): Person

interface A {
    fun foo() { print("A") }
    fun bar() // abstract
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

// la clase 'D' tiene que implementar tanto foo() como bar()
class D : A, B {
    override fun foo() {
        super<A>.foo()
    }
    override fun bar() {
        super<B>.bar()
    }
}

//Apuntes de Internet

fun main() {
    val box = Box()
    box.warning()
    box.explode()
    box.incinerate()
}

interface Explosive{
    fun explode()
    fun warning() = println("Explosivo")
}

interface Incinerable {
    fun incinerate()
    fun warning() = println("Incinerable")
}

class Box : Explosive, Incinerable {
    override fun explode() = println("¡Kaboom!")
    override fun incinerate() = println("¡Boosh!")
    override fun warning() {
        super<Incinerable>.warning()
        super<Explosive>.warning()
    }
}
