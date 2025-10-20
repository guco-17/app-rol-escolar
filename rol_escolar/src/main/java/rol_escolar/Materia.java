package rol_escolar;

public class Materia {
    private int cve_materia;
    private String nombre_materia;
    private String vigente;

    public Materia(int cve_materia, String nombre_materia, String vigente) {
        this.cve_materia = cve_materia;
        this.nombre_materia = nombre_materia;
        this.vigente = vigente;
    }

    public int getCve_materia() {
        return cve_materia;
    }

    public void setCve_materia(int cve_materia) {
        this.cve_materia = cve_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }
    
    public String mostrarMateria(){
        return "Materia: " + nombre_materia +", Vigente: " + vigente;
    }
}
