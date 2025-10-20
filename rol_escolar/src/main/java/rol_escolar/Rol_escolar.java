package rol_escolar;
import vista.Inicio;
import modelo.ConexionBD;
import java.sql.Connection;
public class Rol_escolar {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Inicio().setVisible(true);
        }
    });
    }
}
