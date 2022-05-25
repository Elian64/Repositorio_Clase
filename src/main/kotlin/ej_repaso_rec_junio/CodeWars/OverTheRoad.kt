package ej_repaso_rec_junio.CodeWars

fun overTheRoad(address: Int, n: Int): MutableList<Int> {

    var numeroCasas=n*2
    var casasPares = mutableListOf<Int>()
    var casasImpares = mutableListOf<Int>()

    for(i in 0..numeroCasas) if(i%2==0) casasImpares.add(i)
    for (i in numeroCasas..0) if(i%2!=0) casasPares.add(i)


    // casasImpares(1,3) 3 casas---address=1 ->> casa opuesta = 6
    // casasPares(2)

    // casasImpares(1,3,5)
    // casasPares(2,4,6)

    return casasPares
}

fun main()
{
    println(overTheRoad(1,3))
/* 1, 3 --> 6

  /1        /6
  /3        /4
  /5        /2

  /1        /8
  /3        /6
  /5        /4
  /7        /2

 */
// 3, 3 --> 4
// 2, 3 --> 5
// 3, 5 --> 8
}