package modelo;

public class Multa {
    
    private int plazo;
    private int cantidad;
    private Devolucion devolucion;

    public Multa(int plazo) {
        this.plazo = plazo;
    }

    public Multa() {
    
    }

    public Multa(int plazo, Devolucion devolucion) {
        this.plazo = plazo;
        this.devolucion = devolucion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Multa [plazo=" + plazo + ", devolucion=" + devolucion + ", cantidad=" + cantidad + "]";
    }

    
    
}
