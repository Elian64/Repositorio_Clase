package Tercer_Trimestre.Ejs_repaso_examen

import java.io.File
import kotlin.math.pow
import kotlin.math.sqrt


class SkinCancer() { //no olvidar meter el tema de los exception!

    fun leeArchivo(archivo: File): String = archivo.readText()

    fun calculaMedia(listaDouble: MutableList<Double>): Double = listaDouble.average()


    fun FileAlistaDouble(archivo: File): MutableList<Double> {

        var archivoLeido = archivo.readText()
        var listaValores = mutableListOf<Double>()
        var valoresSeparados = archivoLeido.split(" ")

        valoresSeparados.forEach { listaValores.add(it.toDouble()) }

        return listaValores
    }

    fun stdev(promedio: Double, listaValores: MutableList<Double>): Double {

        var sumaDesviaciones = 0.0

        for (i in 0 until listaValores.size) {

            sumaDesviaciones += (listaValores[i] - promedio).pow(2)

        }

        var divisionSumastdev = sumaDesviaciones / (listaValores.size - 1)

        var raizResultado = sqrt(divisionSumastdev)

        return raizResultado
    }

    fun diagCancer(valorProm: Double, stdev: Double): String {

        when {

            valorProm in 40.0..80.0 && stdev >= 10.0 -> return "Skin Cancer"
            valorProm in 40.0..80.0 && stdev < 10.0 -> return "Benign skin mole"
            valorProm in 80.0..230.0 -> return "Benign skin mole"
            valorProm < 40.0 || valorProm > 230.0 -> return "Recalibrate microscope"

        }
        return ""
    }
}

fun main() {

    //datos de nuestro archivo
    val rutaArchivoValores = "/home/aneli/Escritorio/test-1.in"
    val archivoValores = File(rutaArchivoValores)

    //creamos el objeto del primer caso de ejemplo
    var casoCancer1 = SkinCancer()
    //mostramos el contenido del File
    println(casoCancer1.leeArchivo(archivoValores))

    //promedio
    var valoresDubleParaPromedio = casoCancer1.FileAlistaDouble(archivoValores)
    println(casoCancer1.calculaMedia(valoresDubleParaPromedio))

    //stdev (prueba)
    var promedio = casoCancer1.calculaMedia(valoresDubleParaPromedio)
    println(casoCancer1.stdev(promedio, valoresDubleParaPromedio))

    var stdev = casoCancer1.stdev(promedio, valoresDubleParaPromedio)
    println(casoCancer1.diagCancer(promedio, stdev))
}
