package ej_repaso_rec_junio.CodeWars

/* Escriba una función que tome una cadena de una o más palabras y devuelva la misma cadena, pero con las
palabras de cinco o más letras invertidas (al igual que el nombre de este Kata).
Las cadenas pasadas consistirán solo en letras y espacios.
Los espacios se incluirán solo cuando haya más de una palabra presente.
Ejemplos:
- spinWords( "Hey fellow warriors" ) => devuelve "Hey wollef sroirraw"
- spinWords( "This is a test") => devuelve "This is a test"
- spinWords( "This is another test" )=> devuelve "This is rehtona test"
 */

fun spinWords(sentence: String): String {
    var resultado = ""
    var array = sentence.split(" ")
    var excep = "1234567890qwertyuiopasdfghjklñzxcvbnm"

    for (i in array) {
        if (!i.isNullOrBlank() && !i.chars().equals(excep)) //revisar la excepcion de caracteres ya que no furula
            if (i.length >= 5) resultado += "${i.reversed()} "
            else resultado += "$i "
    }

    return resultado
}

fun main() {
    println(spinWords("emocl[eW"))

}