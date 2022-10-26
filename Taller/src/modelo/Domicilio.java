package modelo;

/**
 * Clase que hace referencia al domicilio del lector.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Domicilio {
    
    private String direccion;
    private int codigoPostal;
    private String departamento;
    private String localidad;
    
    /**
     * Constructor parametrizado
     * @param direccion
     * @param codigoPostal
     * @param departamento
     * @param localidad
     */
    public Domicilio(String direccion, int codigoPostal, String departamento, String localidad) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.localidad = localidad;
    }

    /**
     * 
     * @return objeto String de la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion establece una nueva direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return codigo postal de tipo int
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * 
     * @param codigoPostal establece un nuevo codigo
     * postal de tipo int
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * 
     * @return departamento de tipo String
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * 
     * @param departamento establece un nuevo
     * departamento de tipo String
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * 
     * @return localidad de tipo String
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * 
     * @param localidad establece una nueva localidad
     * de tipo String
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Domicilio [direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", departamento=" + departamento
                + ", localidad=" + localidad + "]";
    }

}
