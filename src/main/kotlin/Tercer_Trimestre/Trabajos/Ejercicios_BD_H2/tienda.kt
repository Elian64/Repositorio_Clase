package Tercer_Trimestre.Trabajos.Ejercicios_BD_H2

//CREATE TABLE TIENDAS (ID_TIENDA NUMBER(10,0) CONSTRAINT PK_ID_TIENDA PRIMARY KEY, NOMBRE_TIENDA VARCHAR2(40), DIRECCION_TIENDA VARCHAR2(200) );
data class miTienda(var ID_TIENDA: Int, var PK_ID_TIENDA: Int, var NOMBRE_TIENDA:String, var DIRECCION_TIENDA:String)