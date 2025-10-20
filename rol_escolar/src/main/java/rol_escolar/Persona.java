package rol_escolar;

import java.util.ArrayList;
import java.util.Date;

public class Persona {
    private int codigoMatricula;
    private String nombre;
    private String paterno;
    private String materno;
    private String telefono;
    private String email;
    private Date fecha_nacimiento;
    private Date fecha_ingreso;
    
    private Domicilio domicilio;
    private ArrayList<Materia> materia;

    public Persona(int codigoMatricula, String nombre, String paterno, String materno, String telefono, String email, Date fecha_nacimiento, Date fecha_ingreso) {
        this.codigoMatricula = codigoMatricula;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.materia = new ArrayList<>();
    }

    public int getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(int codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }
    
    public void agregarMateria(Materia materia) {
        if (materia != null) {
            this.materia.add(materia);
        }
    }
    
    public void calculaEdadAntiguedad(String tipo) {
        Date hoy = new Date();
        long diff;

        if (tipo.equalsIgnoreCase("edad")) {
            diff = hoy.getTime() - fecha_nacimiento.getTime();
        } else {
            diff = hoy.getTime() - fecha_ingreso.getTime();
        }

        int años = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        System.out.println("La " + tipo + " es: " + años + " años.");
    }
    
}
