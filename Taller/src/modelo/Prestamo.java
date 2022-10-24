package modelo;

import java.time.LocalDate;

public class Prestamo {

    private String fechaYHoraPrestamo;
    private String funcionario;
    private LocalDate fechaDevolucion;
    private int plazoDevolucion;
    private String lugarPrestamo;
    private Ejemplar ejemplar;
    private Lector lector;
    private Devolucion devolucion;

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

    public String getFechaYHoraPrestamo() {
        return fechaYHoraPrestamo;
    }

    public void setFechaYHoraPrestamo(String fechaYHoraPrestamo) {
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPlazoDevolucion() {
        return plazoDevolucion;
    }

    public void setPlazoDevolucion(int plazoDevolucion) {
        this.plazoDevolucion = plazoDevolucion;
    }

    public String getLugarPrestamo() {
        return lugarPrestamo;
    }

    public void setLugarPrestamo(String lugarPrestamo) {
        this.lugarPrestamo = lugarPrestamo;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar listaEjemplar) {
        this.ejemplar = listaEjemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector listaLector) {
        this.lector = listaLector;
    }

    @Override
    public String toString() {
        return "Prestamo [fechaDevolucion=" + fechaDevolucion + ", fechaYHoraPrestamo=" + fechaYHoraPrestamo
                + ", funcionario=" + funcionario + ", listaEjemplar=" + ejemplar + ", listaLector=" + lector
                + ", lugarPrestamo=" + lugarPrestamo + ", plazoDevolucion=" + plazoDevolucion + "]";
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

}
