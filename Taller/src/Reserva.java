import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private LocalDate fechaReserva;
    private List<Ejemplar> listaEjemplar;
    private List<Lector> listaLector;
    
    public Reserva(LocalDate fechaReserva, List<Ejemplar> listaEjemplar, List<Lector> listaLector) {
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

    public List<Ejemplar> getListaEjemplar() {
        return listaEjemplar;
    }

    public void setListaEjemplar(List<Ejemplar> listaEjemplar) {
        this.listaEjemplar = listaEjemplar;
    }

    public List<Lector> getListaLector() {
        return listaLector;
    }

    public void setListaLector(List<Lector> listaLector) {
        this.listaLector = listaLector;
    }

    @Override
    public String toString() {
        return "Reserva [fechaReserva=" + fechaReserva + ", listaEjemplar=" + listaEjemplar + ", listaLector="
                + listaLector + "]";
    }
}
