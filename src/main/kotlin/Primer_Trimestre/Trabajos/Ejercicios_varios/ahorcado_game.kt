

fun main (){

print(ahorcado())

}

fun ahorcado() {

//Variables
   var palabra: String
   var letra: String
   println("Introduce una palabra para adivinar")
   palabra = readLine()!!
   var contador = palabra.length
   var errores: Int = 5
   var aciertos: Int= 0
   var lista= mutableListOf<String>()

   for (i in 1..contador) {
       println("Introduce una letra")
       letra = readLine()!!

       if (letra.toString().length!=1 || !letra[0].toChar().isLetter()){

           println("Error, solo puede introducirse una letra")
           contador--
       }
       else {

           lista.add(letra)

           if (letra in lista) {

               println("letra correcta")
               aciertos++

               if (aciertos == palabra.length) {
                   println("PALABRA ADIVINADA")
               }
           } //cierre del if de letra in lista

           else {
               println("letra incorrecta")
               errores--
               println("Te quedan $errores vidas")
               if (errores == 0) { println("HAS PERDIDO") }
           }
       }
   }
}

