package modelo;
import java.time.LocalDate;

public class Reserva {
    
    private LocalDate fechaReserva;
    private Ejemplar listaEjemplar;
    private Lector listaLector;
    
    public Reserva(LocalDate fechaReserva, Ejemplar listaEjemplar, Lector listaLector) {
        this.fechaReserva = fechaReserva;
        this.listaEjemplar = listaEjemplar;
        this.listaLector = listaLector;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Ejemplar getListaEjemplar() {
        return listaEjemplar;
    }

    public void setListaEjemplar(Ejemplar listaEjemplar) {
        this.listaEjemplar = listaEjemplar;
    }

    public Lector getListaLector() {
        return listaLector;
    }

    public void setListaLector(Lector listaLector) {
        this.listaLector = listaLector;
    }

    @Override
    public String toString() {
        return "Reserva [fechaReserva=" + fechaReserva + ", listaEjemplar=" + listaEjemplar + ", listaLector="
                + listaLector + "]";
    }
}
