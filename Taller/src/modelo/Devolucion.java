package modelo;

/**
 * Clase asociada a la devolución de un ejemplar 
 * por parte de un lector.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Devolucion {

    private String fechaYHoraDevolucion;
    private String recibidoPor;
    private Multa multa;
    private Prestamo prestamo;

    public Devolucion(){}

    public Devolucion(String fechaYHoraDevolucion, String recibidoPor) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
    }

    public Devolucion(String fechaYHoraDevolucion, String recibidoPor, Multa multa, Prestamo prestamo) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.multa = multa;
        this.prestamo = prestamo;
    }

    public Devolucion(String fechaYHoraDevolucion, String recibidoPor, Multa multa) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.multa = multa;
    }

    public Devolucion(String fechaYHoraDevolucion, String recibidoPor, Prestamo prestamo) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.prestamo = prestamo;
    }

    /**
     * 
     * @return fecha de devolución de tipo String
     */
    public String getFechaYHoraDevolucion() {
        return fechaYHoraDevolucion;
    }

    /**
     * 
     * @param fechaYHoraDevolucion establece una nueva fecha
     */
    public void setFechaYHoraDevolucion(String fechaYHoraDevolucion) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
    }

    /**
     * 
     * @return funcionario que recibio la obra.
     */
    public String getRecibidoPor() {
        return recibidoPor;
    }

    /**
     * 
     * @param recibidoPor establece un nuevo funcionario.
     */
    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    /**
     * @return objeto multa asociada a la devolucion
     */
    public Multa getMulta() {
        return multa;
    }

    /**
     * 
     * @param multa establece una nueva multa.
     */
    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    /**
     * 
     * @return objeto prestamo asociado  a la devolucion.
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * 
     * @param prestamo establece un nuevo prestamo
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Devolucion [fechaYHoraDevolucion=" + fechaYHoraDevolucion + ", recibidoPor=" + recibidoPor + ", multa="
                + multa + ", prestamo=" + prestamo + "]";
    }

}
