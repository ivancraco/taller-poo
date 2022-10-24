package modelo;

public class Multa {
    
    private int plazo;
    private Integer cantidad;
    private boolean multado;
    private String multadoHasta;
    private Devolucion devolucion;

    public Multa(int plazo) {
        this.plazo = plazo;
    }

    public Multa() {
       cantidad = 0;
    }

    public Multa(int plazo, Devolucion devolucion) {
        this.plazo = plazo;
        this.devolucion = devolucion;
        this.multado = true;
        cantidad = 0;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMultadoHasta() {
        return multadoHasta;
    }

    public void setMultadoHasta(String multadoHasta) {
        this.multadoHasta = multadoHasta;
    }

    public boolean isMultado() {
        return multado;
    }

    public void setMultado(boolean multado) {
        this.multado = multado;
    }

    @Override
    public String toString() {
        return "Multa [plazo=" + plazo + ", cantidad=" + cantidad + ", multado=" + multado + ", multadoHasta="
                + multadoHasta + ", devolucion=" + devolucion + "]";
    }

}
