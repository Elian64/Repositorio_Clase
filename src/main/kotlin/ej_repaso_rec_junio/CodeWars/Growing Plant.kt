package ej_repaso_rec_junio.CodeWars

// Cada día crece una planta por upSpeedmetros. Cada noche la altura de esa planta disminuye en downSpeedmetros
// debido a la falta de calor del sol. Inicialmente, la planta mide 0 metros de altura. Plantamos la semilla al
// comienzo de un día. Queremos saber cuándo la altura de la planta alcanzará cierto nivel.

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {

    var dias = 0
    var alturaInicial = 0

    while (alturaInicial < desiredHeight) {
        alturaInicial += upSpeed
        if (alturaInicial >= desiredHeight) {
            dias++
            break
        }
        else {
            continue
            alturaInicial -= downSpeed
        }
    }

    return dias
}

fun main() {
    println(growingPlant(100, 10, 910))
}