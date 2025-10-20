package rol_escolar;

import java.util.Date;

public class Profesor extends Persona{
    private double salarioHora;
    private String ultimoGradoAcademico;
    private int horasImparte;

    public Profesor(double salarioHora, String ultimoGradoAcademico, int horasImparte, int codigoMatricula, String nombre, String paterno, String materno, String telefono, String email, Date fecha_nacimiento, Date fecha_ingreso) {
        super(codigoMatricula, nombre, paterno, materno, telefono, email, fecha_nacimiento, fecha_ingreso);
        this.salarioHora = salarioHora;
        this.ultimoGradoAcademico = ultimoGradoAcademico;
        this.horasImparte = horasImparte;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public String getUltimoGradoAcademico() {
        return ultimoGradoAcademico;
    }

    public void setUltimoGradoAcademico(String ultimoGradoAcademico) {
        this.ultimoGradoAcademico = ultimoGradoAcademico;
    }

    public int getHorasImparte() {
        return horasImparte;
    }

    public void setHorasImparte(int horasImparte) {
        this.horasImparte = horasImparte;
    }
    
    public double calcularSalario(){
        return horasImparte * salarioHora;
    }

    public void mostrarProfesor() {
        System.out.println("===== Datos del Profesor =====");
        System.out.println("Nombre: " + super.getNombre() + " " + super.getPaterno() + " " + super.getMaterno());
        System.out.println("Contacto: " + super.getTelefono() + " - " + super.getEmail());
        System.out.println("Domicilio: " + super.getDomicilio());
        System.out.println("Último grado académico: " + ultimoGradoAcademico);
        System.out.println("Salario por hora: $" + salarioHora);
        System.out.println("Horas impartidas: " + horasImparte);
        System.out.println("Salario total: $" + calcularSalario());
    }

    
    
}
