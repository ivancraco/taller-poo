package modelo;
import java.time.LocalDate;

/**
 * Clase que representa un ejemplar de una obra
 * en particular
 * 
 * @author Ivan Craco
 */
public class Ejemplar {
    
    private LocalDate fechaAdquisicion;
    private String formaAdquisicion;
    private String IDUbicacion;
    private String item;
    private LocalDate fechaBaja;
    private String motivoBaja;
    private String ubicacionBaja;
    private String codigoDeBarra;
    private Prestamo prestamoEjemplar;
    private Reserva reservaEjemplar;
    private Obra obra;


    public Ejemplar(){}

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String iDUbicacion,
            String item, LocalDate fechaBaja, String motivoBaja, String ubicacionBaja, String codigoDeBarra,
            Prestamo prestamoEjemplar, Reserva reservaEjemplar) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.ubicacionBaja = ubicacionBaja;
        this.codigoDeBarra = codigoDeBarra;
        this.prestamoEjemplar = prestamoEjemplar;
        this.reservaEjemplar = reservaEjemplar;
    }

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String iDUbicacion,
            String item, LocalDate fechaBaja, String motivoBaja, String ubicacionBaja, String codigoDeBarra) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.ubicacionBaja = ubicacionBaja;
        this.codigoDeBarra = codigoDeBarra;
    }

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String iDUbicacion,
            String item, String codigoDeBarra) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.codigoDeBarra = codigoDeBarra;
        this.prestamoEjemplar = null;
        this.reservaEjemplar = null;
    }



    /**
     * 
     * @return fecha de adquisicion de tipo LocalDate
     * del ejemplar
     */
    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    /**
     * 
     * @param fechaAdquisicion establece una nueva fecha
     * de tipo LocalDate para la fecha de adquisicion
     */
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    /**
     * 
     * @return forma de adquisicion de tipo String
     * del ejemplar
     */
    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    /**
     * 
     * @param formaAdquisicion establece una nueva 
     * forma de adquisicion de tipo String
     */
    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    /**
     * 
     * @return id ubicacion de tipo String
     * del ejemplar
     */
    public String getIDUbicacion() {
        return IDUbicacion;
    }

    /**
     * 
     * @param iDUbicacion establece un nuevo
     * id ubicacion de tipo String
     */
    public void setIDUbicacion(String iDUbicacion) {
        IDUbicacion = iDUbicacion;
    }

    /**
     * 
     * @return item de tipo String del ejemplar
     */
    public String getItem() {
        return item;
    }

    /**
     * 
     * @param item establece un nuevo item
     * de tipo String
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * 
     * @return fecha de tipo LocalDate cuando
     * se da de baja un ejemplar
     */
    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    /**
     * 
     * @param fechaBaja establece una nueva fecha
     * de tipo LocalDate para la baja del ejemplar
     */
    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    /**
     * 
     * @return motivo de baja de tipo String
     */
    public String getMotivoBaja() {
        return motivoBaja;
    }

    /**
     * 
     * @param motivoBaja establece un nuevo
     * motivo de baja de tipo String
     */
    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    /**
     * 
     * @return ubicacion de tipo String de donde
     * se dejo el ejemplar al darlo de baja
     */
    public String getUbicacionBaja() {
        return ubicacionBaja;
    }

    /**
     * 
     * @param ubicacionBaja establece una nuevaubicacion 
     *  de tipo String para la ubicacion de baja del ejemplar
     */
    public void setUbicacionBaja(String ubicacionBaja) {
        this.ubicacionBaja = ubicacionBaja;
    }

    /**
     * 
     * @return codigo de barra de tipo String
     * del ejemplar
     */
    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    /**
     * 
     * @param codigoDeBarra establece un nuevo 
     * codigo de barra de tipo String
     */
    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    /**
     * 
     * @return objeto que representa el prestamo 
     * del ejemplar
     */
    public Prestamo getPrestamoEjemplar() {
        return prestamoEjemplar;
    }

    /**
     * 
     * @param prestamoEjemplar establece un nuevo prestamo
     * para el ejemplar
     */
    public void setPrestamoEjemplar(Prestamo prestamoEjemplar) {
        this.prestamoEjemplar = prestamoEjemplar;
    }

    /**
     * 
     * @return objeto que representa la reserva
     * del ejemplar
     */
    public Reserva getReservaEjemplar() {
        return reservaEjemplar;
    }

    /**
     * 
     * @param reservaEjemplar establece una nueva reserva
     * para el ejemplar
     */
    public void setReservaEjemplar(Reserva reservaEjemplar) {
        this.reservaEjemplar = reservaEjemplar;
    }

    /**
     * 
     * @return obra a la que está asociado el ejemplar
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * 
     * @param obra establece una nueva obra para el
     * ejemplar
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    @Override
    public String toString() {
        return "Ejemplar [fechaAdquisicion=" + fechaAdquisicion + ", formaAdquisicion=" + formaAdquisicion
                + ", IDUbicacion=" + IDUbicacion + ", item=" + item + ", fechaBaja=" + fechaBaja + ", motivoBaja="
                + motivoBaja + ", ubicacionBaja=" + ubicacionBaja + ", codigoDeBarra=" + codigoDeBarra
                + ", prestamoEjemplar=" + prestamoEjemplar + ", reservaEjemplar=" + reservaEjemplar + ", obra=" + obra
                + "]";
    }

    

    
    

}
