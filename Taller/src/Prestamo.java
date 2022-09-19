import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private LocalDate fechaYHoraPrestamo;
    private String funcionario;
    private LocalDate fechaDevolucion;
    private int plazoDevolucion;
    private LugarPrestamo lugarPrestamo;
    private List<Ejemplar> listaEjemplar;
    private List<Lector> listaLector;

    public Prestamo(LocalDate fechaYHoraPrestamo, String funcionario, LocalDate fechaDevolucion, int plazoDevolucion,
            LugarPrestamo lugarPrestamo, List<Ejemplar> listaEjemplar, List<Lector> listaLector) {
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
        this.funcionario = funcionario;
        this.fechaDevolucion = fechaDevolucion;
        this.plazoDevolucion = plazoDevolucion;
        this.lugarPrestamo = lugarPrestamo;
        this.listaEjemplar = listaEjemplar;
        this.listaLector = listaLector;
    }

    public LocalDate getFechaYHoraPrestamo() {
        return fechaYHoraPrestamo;
    }

    public void setFechaYHoraPrestamo(LocalDate fechaYHoraPrestamo) {
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

    public LugarPrestamo getLugarPrestamo() {
        return lugarPrestamo;
    }

    public void setLugarPrestamo(LugarPrestamo lugarPrestamo) {
        this.lugarPrestamo = lugarPrestamo;
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
        return "Prestamo [fechaDevolucion=" + fechaDevolucion + ", fechaYHoraPrestamo=" + fechaYHoraPrestamo
                + ", funcionario=" + funcionario + ", listaEjemplar=" + listaEjemplar + ", listaLector=" + listaLector
                + ", lugarPrestamo=" + lugarPrestamo + ", plazoDevolucion=" + plazoDevolucion + "]";
    }

}
