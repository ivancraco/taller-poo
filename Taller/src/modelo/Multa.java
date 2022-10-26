package modelo;

/**
 * Clase para generar una multa a un lector cuando realiza
 * una devolucion de un ejemplar fuera del plazo de devolucion.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Multa {
    
    private int plazo;
    private Integer cantidad;
    private boolean multado;
    private String multadoHasta;
    private Devolucion devolucion;

    /**
     * Constructor parametrizado
     * @param plazo plazo de multa
     */
    public Multa(int plazo) {
        this.plazo = plazo;
    }

    /**
     * Constructor por defecto
     */
    public Multa() {
       cantidad = 0;
    }

    /**
     * Constructor parametrizado
     * @param plazo cantidad de dias de plazo
     * @param devolucion objeto Devolucion que representa una devolucion
     * de un ejemplar por parte de un lector
     */
    public Multa(int plazo, Devolucion devolucion) {
        this.plazo = plazo;
        this.devolucion = devolucion;
        this.multado = true;
        cantidad = 0;
    }

    /**
     * @return int plazo de multa
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo establece un nuevo plazo de tipo int
     * para el plazo de multa
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * @return objeto Devolucion que representa la devolucion
     * de un ejemplar
     */
    public Devolucion getDevolucion() {
        return devolucion;
    }

    /**
     * @param devolucion establece un nuevo objeto Devolucion
     */
    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    /**
     * @return Integer contador de multas
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad establece el contador
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return String fecha limite de la multa
     */
    public String getMultadoHasta() {
        return multadoHasta;
    }

    /**
     * @param multadoHasta establece una nueva fecha limite
     */
    public void setMultadoHasta(String multadoHasta) {
        this.multadoHasta = multadoHasta;
    }

    /**
     * @return boolean lector multado
     */
    public boolean isMultado() {
        return multado;
    }

    /**
     * @param multado establece un nuevo boolean
     */
    public void setMultado(boolean multado) {
        this.multado = multado;
    }

    @Override
    public String toString() {
        return "Multa [plazo=" + plazo + ", cantidad=" + cantidad + ", multado=" + multado + ", multadoHasta="
                + multadoHasta + ", devolucion=" + devolucion + "]";
    }
}
