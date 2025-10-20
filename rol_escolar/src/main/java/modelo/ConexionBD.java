package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection conexion = null;
    private static final String BD = "rol_escolar";
    private static final String user = "root";
    private static final String contrasena = "12345678";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    public static Connection obtenerConexion(){
        try{
            if (conexion == null || conexion.isClosed()){
                System.out.println("Intentando conectar a la base de datos...");
                conexion = DriverManager.getConnection(URL, user, contrasena);
                System.out.println("Conexión exitosa!");
            }
        }catch(SQLException e){
            System.err.println("Error al conectar la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
