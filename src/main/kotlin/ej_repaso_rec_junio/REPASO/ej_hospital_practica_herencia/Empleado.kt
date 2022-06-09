package ej_repaso_rec_junio.REPASO.ej_hospital_practica_herencia

//Empleado: código de Empleado, número de horas extras, fecha de ingreso, área, cargo.

open class Empleado(
    DNI: String,
    nombre: String,
    apellido: String,
    fech_nac: String,
    direccion: String,
    ciudad: String,
    var cod: Int,
    var num_horas_extras: Int,
    var fech_ing: String,
    var area: String,
    var cargo: String
) : Persona(DNI, nombre, apellido, fech_nac, direccion, ciudad) {
}

//Empleado por Planilla: salario mensual, porcentaje adicional por hora extra.
class Empleado_plantilla(
    DNI: String,
    nombre: String,
    apellido: String,
    fech_nac: String,
    direccion: String,
    ciudad: String,
    cod: Int,
    num_horas_extras: Int,
    fech_ing: String,
    area: String,
    cargo: String,
    salario: Double,
    porc_hor_ext: Double
) :
    Empleado(DNI, nombre, apellido, fech_nac, direccion, ciudad, cod, num_horas_extras, fech_ing, area, cargo)

//Empleado Eventual: honorarios por hora, número de horas totales (normales + extras) trabajadas, fecha de término del contrato.
class Empleado_eventual(
    DNI: String,
    nombre: String,
    apellido: String,
    fech_nac: String,
    direccion: String,
    ciudad: String,
    cod: Int,
    num_horas_extras: Int,
    fech_ing: String, area: String,
    cargo: String, honor_hora: Double,
    num_horas_totales: Int,
    fech_fin_cont: Int
) :
    Empleado(DNI, nombre, apellido, fech_nac, direccion, ciudad, cod, num_horas_extras, fech_ing, area, cargo)
