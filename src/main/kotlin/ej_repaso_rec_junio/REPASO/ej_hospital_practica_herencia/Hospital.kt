package ej_repaso_rec_junio.REPASO.ej_hospital_practica_herencia

class Hospital {

    /*Para solicitar una cita, el paciente es atendido por un empleado.
    El paciente indica el servicio en el cual quiere pasar consulta y el empleado le indica el nombre del médico, la fecha y la hora de la cita.*/

    fun cita(empleado: Medico, paciente: Paciente) :String
    {

// https://www.youtube.com/watch?v=hQ-X0Eop9us
        return "${empleado.nombre}"
    }
}