package rol_escolar;

public class Domicilio {
    private String calle;
    private String ciudad;
    private String estado;
    private int codigo_postal;
    private String pais;

    public Domicilio(String calle, String ciudad, String estado, int codigo_postal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String mostrarDomicilio() {
        return "Domicilio\n- Calle:" + calle + "\n- Ciudad:" + ciudad + "\n- Estado:" + estado + "\n- Codigo_postal:" + codigo_postal + "\n- Pais:" + pais;
    }
    
}
