package rol_escolar;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Persona{
    private String becado;
    private String carrera;
    private double promedio_actual;

    public Estudiante(String becado, String carrera, double promedio_actual, int codigoMatricula, String nombre, String paterno, String materno, String telefono, String email, Date fecha_nacimiento, Date fecha_ingreso) {
        super(codigoMatricula, nombre, paterno, materno, telefono, email, fecha_nacimiento, fecha_ingreso);
        this.becado = becado;
        this.carrera = carrera;
        this.promedio_actual = promedio_actual;
    }

    public String getBecado() {
        return becado;
    }

    public void setBecado(String becado) {
        this.becado = becado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio_actual() {
        return promedio_actual;
    }

    public void setPromedio_actual(double promedio_actual) {
        this.promedio_actual = promedio_actual;
    }
    
   public String getStringMaterias(){
       ArrayList<Materia> listaM = this.getMateria();
       
       if (listaM == null || listaM.isEmpty()) {
            return "N/A";
        }
       ArrayList<String> nombresMaterias = new ArrayList<>();
        for (Materia m : listaM) {
            
            nombresMaterias.add(m.getNombre_materia()); 
        }
        
        return String.join(", ", nombresMaterias);
   }

    public void mostrarEstudiante() {
        System.out.println("===== Datos del Estudiante =====");
        System.out.println("Nombre: " + super.getNombre() + " " + super.getPaterno() + " " + super.getMaterno());
        System.out.println("Contacto: " + super.getTelefono() + " - " + super.getEmail());
        System.out.println("Domicilio: " + super.getDomicilio());
        System.out.println("Beca: " + becado);
        System.out.println("Carrera" + carrera);
        System.out.println("Promedio actual: " + promedio_actual);
    }
    
}
