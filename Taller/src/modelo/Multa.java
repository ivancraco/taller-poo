package modelo;
import java.time.LocalDate;

public class Multa {
    
    private LocalDate plazo;
    private Devolucion devolucion;

    public Multa(LocalDate plazo) {
        this.plazo = plazo;
    }

    public Multa(LocalDate plazo, Devolucion devolucion) {
        this.plazo = plazo;
        this.devolucion = devolucion;
    }

    public LocalDate getPlazo() {
        return plazo;
    }

    public void setPlazo(LocalDate plazo) {
        this.plazo = plazo;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Multa [plazo=" + plazo + ", devolucion=" + devolucion + "]";
    }
    
}
