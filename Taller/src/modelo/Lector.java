package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lector {
    
    private String nombre;
    private String apellido;
    private TipoLector tipoLector;
    private String documento;
    private String correo;
    private String celular;
    private LocalDate fechaNac;
    private String sexo;
    private String nacionalidad;
    private Domicilio domicilio;
    private List<Prestamo> prestamoLector;
    private List<Reserva> reservaLector;
    private Multa multa;


    public Lector(String nombre, String apellido, TipoLector tipoLector, String documento, String correo, String celular,
            LocalDate fechaNac, String sexo, String nacionalidad, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoLector = tipoLector;
        this.documento = documento;
        this.correo = correo;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
        prestamoLector = new ArrayList<Prestamo>();
        reservaLector = new ArrayList<Reserva>();
    }

    /**
     * 
     * @return String nombre del lector
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre establece un nuevo nombre 
     * de tipo String para el lector
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return String apellido del lector
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * 
     * @param apellido establece un nuevo apellido
     * de tipo String para el lector
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * 
     * @return TipoLector enumaracion para identificar
     * el tipo de lector
     */
    public TipoLector getTipoLector() {
        return tipoLector;
    }

    /**
     * 
     * @param tipoLector establece una nueva enumeracion
     * de TipoLector
     */
    public void setTipoLector(TipoLector tipoLector) {
        this.tipoLector = tipoLector;
    }

    /**
     * 
     * @return String documento del lector
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * 
     * @param documento establece un nuevo documento
     * de tipo String
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * 
     * @return String correo del lector
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * 
     * @param correo establece un nuevo correo
     * de tipo String
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * 
     * @return String numero telefono del lector
     */
    public String getCelular() {
        return celular;
    }

    /**
     * 
     * @param celular establece un nuevo nuemro
     * de telefono de tipo String
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * 
     * @return LocalDate fecha nacimiento del lector
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    /**
     * 
     * @param fechaNac establece una nueva fecha
     * de nacimiento de tipo Localdate
     */
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * 
     * @return String sexo del lector
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * 
     * @param sexo establece un nuevo sexo de
     * tipo String
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return String nacionalidad del lector
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * 
     * @param nacionalidad establece una nueva nacionalidad
     * de tipo String
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * 
     * @return Domcilio del lector
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * 
     * @param domicilio establece un nuevo domicilio
     * de tipo Domicilio
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    } 

    /**
     * 
     * @return lista de prestamos asociados al lector
     */
    public List<Prestamo> getPrestamoLector() {
        return prestamoLector;
    }

    /**
     * 
     * @param prestamoLector establece una nueva lista
     * de prestamo 
     */
    public void setPrestamoLector(List<Prestamo> prestamoLector) {
        this.prestamoLector = prestamoLector;
    }

    /**
     * 
     * @return lista de reservas asociadas al lector
     */
    public List<Reserva> getReservaLector() {
        return reservaLector;
    }

    /**
     * 
     * @param reservaLector establece una nueva lista
     * de reserva
     */
    public void setReservaLector(List<Reserva> reservaLector) {
        this.reservaLector = reservaLector;
    }

    /**
     * 
     * @return Multa asociada al lector
     */
    public Multa getMulta() {
        return multa;
    }

    /**
     * 
     * @param multa establece ua nueva multa
     * de tipo Multa
     */
    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Lector [nombre=" + nombre + ", apellido=" + apellido + ", tipoLector=" + tipoLector + ", documento="
                + documento + ", correo=" + correo + ", celular=" + celular + ", fechaNac=" + fechaNac + ", sexo="
                + sexo + ", nacionalidad=" + nacionalidad + ", domicilio=" + domicilio + ", prestamoLector="
                + prestamoLector + ", reservaLector=" + reservaLector + ", multa=" + multa + "]";
    }

    
}
