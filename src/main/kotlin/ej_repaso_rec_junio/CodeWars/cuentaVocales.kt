package ej_repaso_rec_junio.CodeWars

fun getCount(str : String) : Int {

    var voc1 = 'a'
    var voc2 = 'e'
    var voc3 = 'i'
    var voc4 = 'o'
    var voc5 = 'u'
    var cont = 0

    for(i in str.indices) if(str[i] == voc1 || str[i] == voc2 || str[i] == voc3 || str[i] == voc4 || str[i] == voc5) cont++

    return cont

}

//fun getCount(str : String) : Int = str.count { it in "aeiou" }

fun main(){

    print(getCount("aloha"))
}