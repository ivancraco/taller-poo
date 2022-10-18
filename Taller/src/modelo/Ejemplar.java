package modelo;
import java.time.LocalDate;

public class Ejemplar {
    
    private LocalDate fechaAdquisicion;
    private String formaAdquisicion;
    private String areaDeReferencia;
    private int IDUbicacion;
    private String item;
    private LocalDate fechaBaja;
    private String motivoBaja;
    private String ubicacionBaja;
    private String codigoDeBarra;
    private Prestamo prestamoEjemplar;
    private Reserva reservaEjemplar;

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String areaDeReferencia, int iDUbicacion,
            String item, LocalDate fechaBaja, String motivoBaja, String ubicacionBaja, String codigoDeBarra,
            Prestamo prestamoEjemplar, Reserva reservaEjemplar) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.areaDeReferencia = areaDeReferencia;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.ubicacionBaja = ubicacionBaja;
        this.codigoDeBarra = codigoDeBarra;
        this.prestamoEjemplar = prestamoEjemplar;
        this.reservaEjemplar = reservaEjemplar;
    }

    

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String areaDeReferencia, int iDUbicacion,
            String item, LocalDate fechaBaja, String motivoBaja, String ubicacionBaja, String codigoDeBarra) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.areaDeReferencia = areaDeReferencia;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.fechaBaja = fechaBaja;
        this.motivoBaja = motivoBaja;
        this.ubicacionBaja = ubicacionBaja;
        this.codigoDeBarra = codigoDeBarra;
    }

    public Ejemplar(LocalDate fechaAdquisicion, String formaAdquisicion, String areaDeReferencia, int iDUbicacion,
            String item, String codigoDeBarra) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaAdquisicion = formaAdquisicion;
        this.areaDeReferencia = areaDeReferencia;
        IDUbicacion = iDUbicacion;
        this.item = item;
        this.codigoDeBarra = codigoDeBarra;
    }



    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getFormaAdquisicion() {
        return formaAdquisicion;
    }

    public void setFormaAdquisicion(String formaAdquisicion) {
        this.formaAdquisicion = formaAdquisicion;
    }

    public String getAreaDeReferencia() {
        return areaDeReferencia;
    }

    public void setAreaDeReferencia(String areaDeReferencia) {
        this.areaDeReferencia = areaDeReferencia;
    }

    public int getIDUbicacion() {
        return IDUbicacion;
    }

    public void setIDUbicacion(int iDUbicacion) {
        IDUbicacion = iDUbicacion;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public String getUbicacionBaja() {
        return ubicacionBaja;
    }

    public void setUbicacionBaja(String ubicacionBaja) {
        this.ubicacionBaja = ubicacionBaja;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public Prestamo getPrestamoEjemplar() {
        return prestamoEjemplar;
    }

    public void setPrestamoEjemplar(Prestamo prestamoEjemplar) {
        this.prestamoEjemplar = prestamoEjemplar;
    }

    public Reserva getReservaEjemplar() {
        return reservaEjemplar;
    }

    public void setReservaEjemplar(Reserva reservaEjemplar) {
        this.reservaEjemplar = reservaEjemplar;
    }

    @Override
    public String toString() {
        return "Ejemplar [IDUbicacion=" + IDUbicacion + ", areaDeReferencia=" + areaDeReferencia + ", codigoDeBarra="
                + codigoDeBarra + ", fechaAdquisicion=" + fechaAdquisicion + ", fechaBaja=" + fechaBaja
                + ", formaAdquisicion=" + formaAdquisicion + ", item=" + item + ", motivoBaja=" + motivoBaja
                + ", prestamoEjemplar=" + prestamoEjemplar + ", reservaEjemplar=" + reservaEjemplar + ", ubicacionBaja="
                + ubicacionBaja + "]";
    }

    
    

}
