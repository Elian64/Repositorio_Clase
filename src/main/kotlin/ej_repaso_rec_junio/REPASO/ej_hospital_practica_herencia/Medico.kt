package ej_repaso_rec_junio.REPASO.ej_hospital_practica_herencia

//Médico: especialidad (cirujano, oftalmólogo, etc.), servicio (cirugía, oftalmología, etc.), número de consultorio.
class Medico(DNI: String, nombre: String, apellido:String, fech_nac: String, direccion: String, ciudad: String, cod: Int, num_horas_extras: Int,
             fech_ing: String, area: String, cargo: String, var especialidad: String, var servicio: String, var num_consult : Int)
    :
    Empleado(DNI, nombre, apellido, fech_nac, direccion, ciudad, cod, num_horas_extras, fech_ing, area, cargo){
}

