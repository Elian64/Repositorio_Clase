package ej_repaso_rec_junio.REPASO.ej_hospital_practica_herencia

//Paciente: número de historia clínica, sexo, grupo sanguíneo, lista de medicamentos a los que es alérgico.

class Paciente(
    DNI: String,
    nombre: String,
    apellido: String,
    fech_nac: String,
    direccion: String,
    ciudad: String,
    var n_his: Int,
    var sexo: Char,
    var grup_sang: String,
    var alerg_med: List<String>
) :
    Persona(DNI, nombre, apellido, fech_nac, direccion, ciudad) {
}