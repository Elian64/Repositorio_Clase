package Tercer_Trimestre.Trabajos.Ejercicios_BD_H2
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.text.SimpleDateFormat

fun main() {

    var conexion = ConnectionBuilder()
    println("haciendo conexion")

    //if (conexion.connection.isValid(10)) "conexion valida"

    conexion.connection.use {
        var tienda = Tienda(conexion.connection)

        tienda.prepareTable()
    }

}

class ConnectionBuilder {

    lateinit var connection: Connection
    private val jdbcURL = "jdbc:h2:mem:default"
    private val jdbcUsername = ""
    private val jdbcPassword = ""

    init {
        try {
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)
        } catch (e: SQLException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }

}
class Inventario(private val conexion: Connection)
{
    companion object {
        private const val SCHEMA = "default"
        private const val TABLE = "INVENTARIO"
        private const val UPDATE_PRECIO = "update INVENTARIO set PRECIO=?"

    }

    private fun cambiaPrecio15()
    {

    }

    /*fun updateBook(book: MyBook): Boolean {
        var rowUpdated = false
        val sqldate = java.sql.Date(book.publish_date.time)
        try {
            c.prepareStatement(UPDATE_BOOKS_SQL).use { st ->
                st.setString(1, book.author)
                st.setString(2, book.title)
                st.setString(3, book.genre)
                st.setFloat(4, book.price)
                st.setDate(5, sqldate)
                st.setString(6, book.description)
                st.setInt(7,book.id)
                rowUpdated = st.executeUpdate() > 0
            }
            //Commit the change to the database
            c.commit()
        } catch (e: SQLException) {
            printSQLException(e)
        }
        return rowUpdated
    }*/


}

class Tienda(private val conexion: Connection) {

    companion object {
        private const val SCHEMA = "default"
        private const val TABLE = "TIENDA"
        private const val TRUNCATE_TABLE_TIENDA_SQL = "TRUNCATE TABLE TIENDA"
        private const val CREATE_TABLE_CATALOG_SQL =
            "CREATE TABLE TIENDAS (ID_TIENDA NUMBER(10,0) CONSTRAINT PK_ID_TIENDA PRIMARY KEY, NOMBRE_TIENDA VARCHAR2(40), DIRECCION_TIENDA VARCHAR2(200)"
        private const val INSERT_ARTICULO_SQL =
            "INSERT INTO TIENDA" + "  (ID_TIENDA, PK_ID_TIENDA, NOMBRE_TIENDA, DIRECCION_TIENDA) VALUES " + " (?, ?, ?, ?);"
        private const val SELECT_TIENDA_BY_ID =
            "select  ID_TIENDA, PK_ID_TIENDA, NOMBRE_TIENDA, DIRECCION_TIENDA from TIENDA where ID_TIENDA =?"
        private const val SELECT_ALL_ARTICULOS = "select * from TIENDA"
        private const val DELETE_TIENDA_SQL = "delete from TIENDA where ID_TIENDA = ?;"
        private const val UPDATE_TIENDA_SQL =
            "update TIENDA set ID_TIENDA = ?,PK_ID_TIENDA = ?, NOMBRE_TIENDA =?, DIRECCION_TIENDA = ?"
    }


    fun prepareTable() {
        val metadatos = conexion.metaData
        val rs = metadatos.getTables(null, Tienda.SCHEMA, Tienda.TABLE, null)

        if (!rs.next()) createTable() else truncateTable()
    }

    private fun truncateTable() {
        println(Tienda.TRUNCATE_TABLE_TIENDA_SQL)
        // try-with-resource statement will auto close the connection.
        try {
            conexion.createStatement().use { it ->
                it.execute(Tienda.TRUNCATE_TABLE_TIENDA_SQL)
            }
            //Commit the change to the database
            conexion.commit()
        } catch (e: SQLException) {
            print(SQLException(e))
        }
    }

    private fun createTable() {
        println(Tienda.CREATE_TABLE_CATALOG_SQL)
        // try-with-resource statement will auto close the connection.
        try {
            //Get and instance of statement from the connection and use
            //the execute() method to execute the sql
            conexion.createStatement().use { st ->
                //SQL statement to create a table
                st.execute(Tienda.CREATE_TABLE_CATALOG_SQL)
            }
            //Commit the change to the database
            conexion.commit()
        } catch (e: SQLException) {
            print(SQLException(e))
        }
    }

}
