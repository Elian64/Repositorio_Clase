/*Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos haya gustado
más o menos al leerlo.Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación
que le damos entre 0 y 10. Crear los métodos para poder modificar y obtener los atributos (sólo si tienen sentido).Posteriormente,
crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo). Se pueden añadir libros
que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor y
menor calificación y, por último, mostrar un contenido de todo el conjunto. En el programa principal realizar las siguientes operaciones:
crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío, volver a
añadir un libro y mostrar el contenido final.*/

class libro(var titulo: String, var autor: String, var n_paginas: Int, var calificacion: Double) {

    init {
        if (calificacion > 10 || calificacion < -0) {
            println("Nota no válida")
        }
    }

    //funciones de modificar

    fun modificarCalificacion(calificacion: Double) {
        this.calificacion = calificacion
    }

    //funciones de mostrar

    fun mostrarTitulo(): String {
        return titulo
    }

    fun mostrarAutor(): String {
        return autor
    }

    fun mostrarN_paginas(): Int {
        return n_paginas
    }

    fun mostarCalificacion(): Double {
        return calificacion
    }

}

class ConjuntoLibros() {

    var libros: MutableList<libro> = ArrayList(4)

    fun addLibro(libro: libro) {

        libros.add(libro)
    }

    fun eliminarLibroPorTitulo(titulo: String) =   libros.removeIf{ titulo.equals(it.titulo) }

    fun eliminarLibroPorAutor(autor: String) = libros.removeIf{ autor.equals(it.autor) }

    fun mostrarLibroMayorCalif(): String {

        var maximo = libros.sortedBy { libro -> libro.calificacion }

        return "El libro con la calificacion mas alta es ${maximo.last().titulo}"
    }


    fun mostrarLibroMenorCalif(): String {

        var minimo = libros.sortedBy { libro -> libro.calificacion }

        return "El libro con la calificacion mas baja es ${minimo.first().titulo}"

    }


    override fun toString(): String {
        for (i in 0..libros.size - 1) {
            println(
                "titulo: ${libros.get(i).titulo}, autor: ${libros.get(i).autor}, numero de paginas: " +
                        "${libros.get(i).n_paginas}, calificacion: ${libros.get(i).calificacion} " + println("+-".repeat(50)))

        }
        return ""
    }

}


fun main() {

    var libro1 = libro("Crimen y castigo", "Fedor Dostoievski", 200, 9.6)
    var libro2 = libro("100 años de soledad", "Gabriel García Márquez", 160, 6.7)
    var conjunto1 = ConjuntoLibros()

    conjunto1.addLibro(libro1)
    conjunto1.addLibro(libro2)
    conjunto1.eliminarLibroPorTitulo("Crimen y castigo")
    conjunto1.eliminarLibroPorAutor("Fedor Dostoievski")
    conjunto1.eliminarLibroPorTitulo("100 años de soledad")
    conjunto1.eliminarLibroPorAutor("Gabriel García Márquez")
    conjunto1.addLibro(libro1)

    println(conjunto1)

}

