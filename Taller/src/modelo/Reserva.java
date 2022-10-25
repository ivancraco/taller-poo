package modelo;

/**
 * Clase que permite registrar una reserva por parte
 * de un lector respecto a un ejemplar.
 * 
 * @author Ivan Craco
 */
public class Reserva {
    
    private String fechaReserva;
    private Ejemplar ejemplar;
    private Lector lector;

    public Reserva(){}

    /**
     * Constructor parametrizado
     * @param fechaReserva String fecha reserva
     * @param ejemplar objeto Ejemplar a reservar
     * @param lector objeto Lector que reserva el ejemplar
     */
    public Reserva(String fechaReserva, Ejemplar ejemplar, Lector lector) {
        this.fechaReserva = fechaReserva;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    /**
     * 
     * @return String fecha de reserva del ejemplar
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * 
     * @param fechaReserva establece una nueva fecha de
     * reserva
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * 
     * @return Ejemplar que se reserva
     */
    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    /**
     * 
     * @param ejemplar establece un nuevo ejemplar
     * a la reserva
     */
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    /**
     * 
     * @return Lector que reserva el ejemplar
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * 
     * @param lector establece un nuevo Lector
     */
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Reserva [fechaReserva=" + fechaReserva + ", ejemplar=" + ejemplar + ", lector=" + lector + "]";
    }
}
