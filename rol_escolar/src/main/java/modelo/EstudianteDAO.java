package modelo;

import java.sql.*;
import rol_escolar.Estudiante;
import java.util.Date;
import java.util.ArrayList;
import rol_escolar.Materia;

public class EstudianteDAO extends ConexionBD{
    /*
    PARA PODER HACER EL CRUD PARA ESTUDIANTES DE MANERA CORRECTA HAY QUE INSERTAR UN ELEMENTO EN LA TABLA
    'PERSONA' YA QUE LA CLASE 'ESTUDIANTE' HEREDA DIRECTAMENTE DE LA CLASE 'PERSONA'.
    */
    
    private int obtenerIdPersona(int codigoMatricula) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = obtenerConexion();
        int idPersona = -1;
        
        String sql = "SELECT idPersona FROM persona WHERE codigoMatricula = ?";
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, codigoMatricula);
        rs = stmt.executeQuery();
        
        if (rs.next()) {
            idPersona = rs.getInt("idPersona");
        }
        
        return idPersona;
    }
    
    //MÉTODO PARA REGISTRAR UN ESTUDIANTE EN LA BASE DE DATOS
    public boolean registrarEstudiante(Estudiante est){
        PreparedStatement PSpersona = null;
        PreparedStatement PSestudiante = null;
        Connection con = obtenerConexion();
        
        try{
            con.setAutoCommit(false);
            //INSERTAR PERSONA EN LA TABLA PERSONA
            String sqlPersona = "INSERT INTO persona (codigoMatricula, nombre, paterno, materno, telefono, email, fecha_nacimiento, fecha_ingreso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PSpersona = con.prepareStatement(sqlPersona, Statement.RETURN_GENERATED_KEYS);
            
            PSpersona.setInt(1, est.getCodigoMatricula());
            PSpersona.setString(2, est.getNombre());
            PSpersona.setString(3, est.getPaterno());
            PSpersona.setString(4, est.getMaterno());
            PSpersona.setString(5, est.getTelefono());
            PSpersona.setString(6, est.getEmail());
            PSpersona.setDate(7, new java.sql.Date(est.getFecha_nacimiento().getTime()));
            PSpersona.setDate(8, new java.sql.Date(est.getFecha_ingreso().getTime()));
            PSpersona.executeUpdate();
            
            //INSERTAR ESTUDIANTE EN LA TABLA ESTUDIANTE
            // OBTENER EL IDPERSONA PARA PODER RELACIONAR PERSONA Y ESTUDIANTE CON LLAVE FORÁNEA
            int idPersona = -1;
            ResultSet rs = PSpersona.getGeneratedKeys();
            if (rs.next()) {
                idPersona= rs.getInt(1); 
            } else {
                con.rollback();
                return false;
            }
            
            String sqlEstudiante = "INSERT INTO estudiante (idEstudiante, becado, carrera, promedio_Actual) VALUES (?, ?, ?, ?)";
            PSestudiante = con.prepareStatement(sqlEstudiante);
            
            PSestudiante.setInt(1, idPersona);
            PSestudiante.setString(2, est.getBecado());
            PSestudiante.setString(3, est.getCarrera());
            PSestudiante.setDouble(4, est.getPromedio_actual());
            PSestudiante.executeUpdate();
            
            con.commit();
            
            return true;
        } catch (SQLException e){
            System.err.println("Error: " + e);
            return false;
        } finally {
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    //ACTUALIZAR LOS DATOS DE UN ESTUDIANTE YA EXISTENTE
    public boolean actualizarEstudiante(Estudiante est){
       PreparedStatement PSpersona = null;
       PreparedStatement PSestudiante = null;
       Connection con = obtenerConexion();
       int idPersona = -1;
       
       try{
           con.setAutoCommit(false);
           String sqlPersona = "UPDATE persona SET nombre=?, paterno=?, materno=?, telefono=?, email=?, fecha_nacimiento=?, fecha_ingreso=? WHERE codigoMatricula=?";
           PSpersona = con.prepareStatement(sqlPersona);
           
           PSpersona.setString(1, est.getNombre());
           PSpersona.setString(2, est.getPaterno());
           PSpersona.setString(3, est.getMaterno());
           PSpersona.setString(4, est.getTelefono());
           PSpersona.setString(5, est.getEmail());
           PSpersona.setDate(6, new java.sql.Date(est.getFecha_nacimiento().getTime()));
           PSpersona.setDate(7, new java.sql.Date(est.getFecha_ingreso().getTime()));
           PSpersona.setInt(8, est.getCodigoMatricula());
           PSpersona.executeUpdate();
           
           //OBTENER EL ID DE LA PERSONA QUE TAMBIÉN ES ESTUDIANTE
           idPersona = obtenerIdPersona(est.getCodigoMatricula());
           
           //DESHACER LOS CAMBIOS SI IDPERSONA NO SE ENCUENTRA
           if (idPersona == -1) {
                con.rollback();
                System.err.println("Error: No se encontró el idPersona con la matrícula: " + est.getCodigoMatricula());
                return false;
            }
           
           //ACTUALIZAR ESTUDIANTE CON MISMO IDPERSONA E IDESTUDIANTE
           String sqlEstudiante = "UPDATE estudiante SET becado=?, carrera=?, promedio_Actual=? WHERE idEstudiante=?";
           PSestudiante = con.prepareStatement(sqlEstudiante);
           
           PSestudiante.setString(1, est.getBecado());
           PSestudiante.setString(2, est.getCarrera());
           PSestudiante.setDouble(3, est.getPromedio_actual());
           PSestudiante.setInt(4, idPersona);
           PSestudiante.executeUpdate();
           
           con.commit();
           
           return true;
       } catch (SQLException e){
           System.err.println("Error: " + e);
           return false;
       } finally {
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    /*
    EN LOS MÉTODOS ANTERIORES PRIMERO SI INSERTA EL OBJETO EN LA TABLA 'PERSONA' Y DESPUÉS EN LA TABLA
    'ESTUDIANTE', PARA EL MÉTODO DE ELIMINAR, PRIMERO SE ELIMINA DE LA TABLA 'ESTUDIANTE' Y DESPÚES EN LA
    TABLA 'PERSONA' PORQUE NO SE PUEDEN ELIMINAR ELEMENTOS DE UNA TABLA PADRE QUE TENGA ELEMENTOS EN UNA TABLA HIJA,
    POR EJEMPLO ELIMINAR PERSONA CON ID 1 Y DESPUÉS ESTUDIANTE CON ID 1.
    */
    
    public boolean eliminarEstudiante(int codigoMatricula){
        PreparedStatement PSselect = null;
        PreparedStatement PSpersona = null;
        PreparedStatement PSestudiante = null;
        Connection con = obtenerConexion();
        int idEstudiante = -1;
        
        try {
            con.setAutoCommit(false);
            
            //OBTENER LA IDPERSONA (QUE ES LA IDESTUDIANTE) PARA PODER ELIMINAR EL ESTUDIANTE
            //OBTENER EL ID DE LA PERSONA QUE TAMBIÉN ES ESTUDIANTE
            idEstudiante = obtenerIdPersona(codigoMatricula);
           
            //DESHACER LOS CAMBIOS SI IDPERSONA NO SE ENCUENTRA
            if (idEstudiante == -1) {
                 con.rollback();
                 System.err.println("Error: No se encontró el idPersona con la matrícula: " + codigoMatricula);
                 return false;
            }
            
            //ELIMINAR ESTUDIANTE USANDO EL ID RECUPERADO DE 'PERSONA'
            String sqlEstudiante = "DELETE FROM estudiante WHERE idEstudiante=?";
            PSestudiante = con.prepareStatement(sqlEstudiante);
            
            PSestudiante.setInt(1, idEstudiante);
            PSestudiante.executeUpdate();
            
            String sqlPersona = "DELETE FROM persona WHERE codigoMatricula=?";
            PSpersona = con.prepareStatement(sqlPersona);
            
            PSpersona.setInt(1, codigoMatricula);
            PSpersona.executeUpdate();
            
            con.commit();
            
            return true;
        } catch(SQLException e){
           System.err.println("Error: " + e);
           return false;
        } finally {
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    //AÑADIRLE MATERIAS A UNA PERSONA.
    /*
    PARA AÑADIR MATERIAS A UNA PERSONA, SE DEBERÍAN USAR LAS LLAVES PRIMARIAS DE LAS TABLAS 'MATERIA' Y 'PERSONA', PERO
    DEBIDO A QUE ESTAS LLAVES SON INNACCESIBLES PARA EL USUARIO, SE DECICIÓ QUE SE USARÁN LOS ATRUBUTOS 'CVE_MATERIA' DE
    LA CLASE 'MATERIA' Y 'CODIGOMATRICULA' DE LA CLASE 'PERSONA' YA QUE ESTOS ATRIBUTOS SI SON ACCESIBLES PARA EL USUARIO.
    */
    
    private int obtenerIdMateria(String cveMateria) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = obtenerConexion();
        int idMateria = -1;

        String sql = "SELECT idMateria FROM materia WHERE cve_materia = ?"; 

        stmt = con.prepareStatement(sql);
        stmt.setString(1, cveMateria);
        rs = stmt.executeQuery();

        if (rs.next()) {
            idMateria = rs.getInt("idMateria");
        }
        return idMateria;
    }
    
    public boolean agregarMateria(int codigoMatricula, String cveMateria){
        PreparedStatement stmt = null;
        Connection con = obtenerConexion();
        
        try{
            con.setAutoCommit(false);
            
            //OBTENER LA ID DE LA MATERIA
            int idMateria = obtenerIdMateria(cveMateria);
            
            if (idMateria == -1) {
                System.err.println("Error: Clave de materia (" + cveMateria + ") no encontrada.");
                con.rollback();
                return false;
            }
            
            //OBTENER LA ID DE LA FOKIN PERSONA
            int idPersona = obtenerIdPersona(codigoMatricula);
            
            if (idPersona == -1) {
                System.err.println("Error: Matrícula de estudiante (" + idPersona + ") no encontrada.");
                con.rollback();
                return false;
            }
            
            //INSERTAR MATERIAS
            String sql = "INSERT INTO personamateria (idPersona, idMateria) VALUES (?, ?)";
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, idPersona);
            stmt.setInt(2, idMateria);
            
            stmt.executeUpdate();
            con.commit();
            return true;
        } catch (SQLException e){
           System.err.println("Error: " + e);
           return false;
        }finally {
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    public boolean quitarMateria(int codigoMatricula, String cveMateria){
        PreparedStatement stmt = null;
        Connection con = obtenerConexion();
        
        try{
            con.setAutoCommit(false);
            
            int idPersona = obtenerIdPersona(codigoMatricula); 
        
            if (idPersona == -1) {
                System.err.println("Error: Estudiante con matrícula (" + codigoMatricula + ") no encontrado.");
                con.rollback();
                return false;
            }
            
            int idMateria = obtenerIdMateria(cveMateria);
            
            if (idMateria == -1) {
                System.err.println("Error: Clave de materia (" + cveMateria + ") no encontrada.");
                con.rollback();
                return false;
            }
            
            String sql = "DELETE FROM personamateria WHERE idPersona = ? AND idMateria = ?";
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, idPersona);
            stmt.setInt(2, idMateria);
            
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                con.commit();
                return true;
            } else {
                con.rollback();
                System.err.println("Advertencia: La relación entre el estudiante y la materia no existía.");
                return false;
        }
        } catch (SQLException e){
           System.err.println("Error: " + e);
           return false;
        }finally {
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    public ArrayList<Materia> obtenerMateriasPorEstudiante(int codigoMatricula, Connection con){
        ArrayList<Materia> materias = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            int idPersona = obtenerIdPersona(codigoMatricula);
        
            if (idPersona == -1) {
                System.err.println("ERROR: No se encontró idPersona para la matrícula " + codigoMatricula);
                return materias; // Devuelve lista vacía
            }
            
            String sql = "SELECT M.cve_materia, M.nombreMateria, M.vigente " +
                     "FROM Materia M " +
                     "JOIN PersonaMateria PM ON M.idMateria = PM.idMateria " + 
                     "WHERE PM.idPersona = ?";

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, idPersona);

            rs = stmt.executeQuery();
            
            int count = 0;
            while (rs.next()) {
                int cveMateria = rs.getInt("cve_materia");
                String nombreMateria = rs.getString("nombreMateria");
                String vigencia = rs.getString("vigente");
                
                Materia m = new Materia(cveMateria, nombreMateria, vigencia); 
                materias.add(m);
                count ++;
            }
            System.out.println("DEBUG DAO: Se encontraron " + count + " materias para la matricula " + codigoMatricula);
        
        } catch (SQLException e) {
            System.err.println("ERROR SQL en obtenerMateriasPorEstudiante: " + e.getMessage());
            e.printStackTrace();;
        }
        return materias;
    }
    
    public ArrayList<Estudiante> obtenerEstudiantes(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Connection con = obtenerConexion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT " +
                     "P.codigoMatricula, P.nombre, P.paterno, P.materno, P.telefono, P.email, P.fecha_nacimiento, P.fecha_ingreso, " +
                     "E.becado, E.carrera, E.promedio_Actual " +
                     "FROM Persona P JOIN Estudiante E ON P.idPersona = E.idEstudiante";
            
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                //OBTENER CAMPOS DE PERSONA
                int codigoMatricula = rs.getInt("codigoMatricula");
                String nombre = rs.getString("nombre");
                String paterno = rs.getString("paterno");
                String materno = rs.getString("materno");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                //CONVERTIR A FECHA DE SQL A FECHA DE JAVA
                java.util.Date fecha_nacimiento = new java.util.Date(rs.getDate("fecha_nacimiento").getTime());
                java.util.Date fecha_ingreso = new java.util.Date(rs.getDate("fecha_ingreso").getTime());

                //OBTENER CAMPOS DE ESTUDIANTE
                String becado = rs.getString("becado");
                String carrera = rs.getString("carrera");
                double promedio_actual = rs.getDouble("promedio_Actual");

                // CREAR EL OBJETOS
                Estudiante est = new Estudiante(
                    becado, carrera, promedio_actual,
                    codigoMatricula, nombre, paterno, materno, telefono, email,
                    fecha_nacimiento, fecha_ingreso
                );
                
                ArrayList<Materia> listaMaterias = obtenerMateriasPorEstudiante(codigoMatricula, con);
                est.setMateria(listaMaterias);

               estudiantes.add(est);
            }
            
        } catch (SQLException e){
           System.err.println("Error: " + e);
        } finally {
            try{
                if (con != null) con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
        return estudiantes;
    }
}
