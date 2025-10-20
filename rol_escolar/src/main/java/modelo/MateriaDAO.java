package modelo;

import java.sql.*;
import java.util.ArrayList;
import rol_escolar.Materia;

public class MateriaDAO extends ConexionBD{
    
    public boolean insertarMateria(Materia materia){
        PreparedStatement stmt = null;
        Connection con = obtenerConexion();
        String sql = "INSERT INTO Materia (cve_materia, nombreMateria, vigente) VALUES (?, ?, ?)";
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, materia.getCve_materia());
            stmt.setString(2, materia.getNombre_materia());
            stmt.setString(3, materia.getVigente());
            stmt.executeUpdate();
            return true;
        } catch(SQLException e){
            System.err.println("Error al insertar materia: " + e.getMessage());
            return false;
        }
        
        finally{
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    public boolean actualizarMateria(Materia materia){
        PreparedStatement stmt = null;
        Connection con = obtenerConexion();
        String sql = "UPDATE Materia SET nombreMateria = ?, vigente = ? WHERE cve_materia = ?";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, materia.getNombre_materia());
            stmt.setString(2, materia.getVigente());
            stmt.setInt(3, materia.getCve_materia());
            
            int filas_afectadas = stmt.executeUpdate();
            return filas_afectadas > 0;
        } catch(SQLException e){
            System.err.println("Error al actualziar materia: " + e.getMessage());
            return false;
        }
        
        finally{
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    public boolean eliminarMateria(int cve_materia){
        PreparedStatement stmt = null;
        Connection con = obtenerConexion();
        String sql = "DELETE FROM Materia WHERE cve_materia = ?";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, cve_materia);
            
            int filas_afectadas = stmt.executeUpdate();
            return filas_afectadas > 0;
        } catch(SQLException e){
            System.err.println("Error al eliminar materia: " + e.getMessage());
            return false;
        }
        
        finally{
            try{
                con.close();
                System.out.println("Conexion Cerrada.");
            } catch(SQLException e){
                System.err.println("Error: " + e);
            }
        }
    }
    
    public ArrayList<Materia> listarTodo(){
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT * FROM Materia";
        Connection con = obtenerConexion();
        
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int clave = rs.getInt("cve_materia");
                String nombre = rs.getString("nombreMateria");
                String vigente = rs.getString("vigente");

                Materia materia = new Materia(clave, nombre, vigente);
                lista.add(materia);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar materias: " + e.getMessage());
        }

        return lista;
        
    }
}
