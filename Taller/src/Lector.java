import java.time.LocalDate;

public class Lector {
    private String nombre;
    private String apellido;
    private TipoLector tipoLector;
    private int documento;
    private String correo;
    private int celular;
    private LocalDate fechaNac;
    private String sexo;
    private String nacionalidad;
    private Prestamo prestamoLector;
    private Reserva reservaLector;

    public Lector(String nombre, String apellido, TipoLector tipoLector, int documento, String correo, int celular,
            LocalDate fechaNac, String sexo, String nacionalidad, Prestamo prestamoLector, Reserva reservaLector) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoLector = tipoLector;
        this.documento = documento;
        this.correo = correo;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.prestamoLector = prestamoLector;
        this.reservaLector = reservaLector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoLector getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(TipoLector tipoLector) {
        this.tipoLector = tipoLector;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Prestamo getPrestamoLector() {
        return prestamoLector;
    }

    public void setPrestamoLector(Prestamo prestamoLector) {
        this.prestamoLector = prestamoLector;
    }

    public Reserva getReservaLector() {
        return reservaLector;
    }

    public void setReservaLector(Reserva reservaLector) {
        this.reservaLector = reservaLector;
    }

    @Override
    public String toString() {
        return "Lector [apellido=" + apellido + ", celular=" + celular + ", correo=" + correo + ", documento="
                + documento + ", fechaNac=" + fechaNac + ", nacionalidad=" + nacionalidad + ", nombre=" + nombre
                + ", prestamoLector=" + prestamoLector + ", reservaLector=" + reservaLector + ", sexo=" + sexo
                + ", tipoLector=" + tipoLector + "]";
    } 
  
    
}
