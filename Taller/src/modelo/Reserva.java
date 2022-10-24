package modelo;

public class Reserva {
    
    private String fechaReserva;
    private Ejemplar ejemplar;
    private Lector lector;

    public Reserva(){}
    
    public Reserva(String fechaReserva, Ejemplar ejemplar, Lector lector) {
        this.fechaReserva = fechaReserva;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Reserva [fechaReserva=" + fechaReserva + ", ejemplar=" + ejemplar + ", lector=" + lector + "]";
    }
}
