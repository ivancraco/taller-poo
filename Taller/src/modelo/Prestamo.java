package modelo;

import java.time.LocalDate;

/**
 * Clase que se utiliza cuando un lector se lleva un libro
 * de la biblioteca y permite almacenar informacion consisa.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Prestamo {

    private String fechaYHoraPrestamo;
    private String funcionario;
    private LocalDate fechaDevolucion;
    private int plazoDevolucion;
    private String lugarPrestamo;
    private Ejemplar ejemplar;
    private Lector lector;
    private Devolucion devolucion;
    public static final int PLAZOMAXIMO = 4;

    public Prestamo() {
    }

    public Prestamo(String fechaYHoraPrestamo, String funcionario, LocalDate fechaDevolucion, int plazoDevolucion,
            String lugarPrestamo, Ejemplar listaEjemplar, Lector listaLector) {
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
        this.funcionario = funcionario;
        this.fechaDevolucion = fechaDevolucion;
        this.plazoDevolucion = plazoDevolucion;
        this.lugarPrestamo = lugarPrestamo;
        this.ejemplar = listaEjemplar;
        this.lector = listaLector;
    }

    public Prestamo(String fechaYHoraPrestamo, String funcionario, LocalDate fechaDevolucion,
            String lugarPrestamo, Ejemplar listaEjemplar, Lector listaLector) {
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
        this.funcionario = funcionario;
        this.fechaDevolucion = fechaDevolucion;
        this.lugarPrestamo = lugarPrestamo;
        this.ejemplar = listaEjemplar;
        this.lector = listaLector;
    }

    /**
     * 
     * @return String fecha y hora de devolucion del libro
     */
    public String getFechaYHoraPrestamo() {
        return fechaYHoraPrestamo;
    }

    /**
     * 
     * @param fechaYHoraPrestamo establece una nueva fecha
     * de tipo String para la devolucion del libro
     * 
     */
    public void setFechaYHoraPrestamo(String fechaYHoraPrestamo) {
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
    }

    /**
     * 
     * @return String funcionario que registra el prestamo
     */
    public String getFuncionario() {
        return funcionario;
    }

    /**
     * 
     * @param funcionario establece un nuevo funcionario
     * para el registro
     */
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * 
     * @return Localdate fecha de devolucion de la obra
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * 
     * @param fechaDevolucion establece una nueva fecha 
     * de devolucion Localdate para la obra
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * 
     * @return int plazo de devolucion del libra
     */
    public int getPlazoDevolucion() {
        return plazoDevolucion;
    }

    /**
     * 
     * @param plazoDevolucion establece un nuevo plazo 
     * de devolucion de libro
     */
    public void setPlazoDevolucion(int plazoDevolucion) {
        this.plazoDevolucion = plazoDevolucion;
    }

    /**
     * 
     * @return String lugar de prestamo del libro
     */
    public String getLugarPrestamo() {
        return lugarPrestamo;
    }

    /**
     * 
     * @param lugarPrestamo establece un nuevo lugar
     * de tipo String del prestamo
     */
    public void setLugarPrestamo(String lugarPrestamo) {
        this.lugarPrestamo = lugarPrestamo;
    }

    /**
     * 
     * @return Ejemplar que se va a prestar
     */
    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    /**
     * 
     * @param listaEjemplar establece un nuevo ejemplar
     * al prestamo
     */
    public void setEjemplar(Ejemplar listaEjemplar) {
        this.ejemplar = listaEjemplar;
    }

    /**
     * 
     * @return Lector que se lleva el libro
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * 
     * @param listaLector establece un nuevo lector
     * al prestamo 
     */
    public void setLector(Lector listaLector) {
        this.lector = listaLector;
    }

    /**
     * 
     * @return Devolucion del libro
     */
    public Devolucion getDevolucion() {
        return devolucion;
    }

    /**
     * 
     * @param devolucion establece una nueva Devolucion
     */
    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Prestamo [fechaDevolucion=" + fechaDevolucion + ", fechaYHoraPrestamo=" + fechaYHoraPrestamo
                + ", funcionario=" + funcionario + ", listaEjemplar=" + ejemplar + ", listaLector=" + lector
                + ", lugarPrestamo=" + lugarPrestamo + ", plazoDevolucion=" + plazoDevolucion + "]";
    }

}
