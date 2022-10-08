import java.time.LocalDate;

public class Devolucion {

    private LocalDate fechaYHoraDevolucion;
    private String recibidoPor;
    private Multa multa;
    private Prestamo prestamo;

    public Devolucion(LocalDate fechaYHoraDevolucion, String recibidoPor) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
    }

    public Devolucion(LocalDate fechaYHoraDevolucion, String recibidoPor, Multa multa, Prestamo prestamo) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.multa = multa;
        this.prestamo = prestamo;
    }

    public Devolucion(LocalDate fechaYHoraDevolucion, String recibidoPor, Multa multa) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.multa = multa;
    }

    public Devolucion(LocalDate fechaYHoraDevolucion, String recibidoPor, Prestamo prestamo) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.recibidoPor = recibidoPor;
        this.prestamo = prestamo;
    }

    public LocalDate getFechaYHoraDevolucion() {
        return fechaYHoraDevolucion;
    }

    public void setFechaYHoraDevolucion(LocalDate fechaYHoraDevolucion) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
    }

    public String getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Devolucion [fechaYHoraDevolucion=" + fechaYHoraDevolucion + ", recibidoPor=" + recibidoPor + ", multa="
                + multa + ", prestamo=" + prestamo + "]";
    }

}
