package modelo;
public class Domicilio {
    
    private String direccion;
    private int codigoPostal;
    private String departamento;
    private String localidad;
    
    public Domicilio(String direccion, int codigoPostal, String departamento, String localidad) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Domicilio [direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", departamento=" + departamento
                + ", localidad=" + localidad + "]";
    }

}
