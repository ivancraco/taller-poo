import java.time.LocalDate;
import java.util.List;

public class Docente extends Lector{
    
    private List<String> carrera;

    public Docente(String nombre, String apellido, TipoLector tipoLector, int documento, String correo, String celular,
            LocalDate fechaNac, String sexo, String nacionalidad, Domicilio domicilio, List<String> carrera) {
        super(nombre, apellido, tipoLector, documento, correo, celular, fechaNac, sexo, nacionalidad, domicilio);
        this.carrera = carrera;
    }

    public List<String> getCarrera() {
        return carrera;
    }

    public void setCarrera(List<String> carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Docente [carrera=" + carrera + "]";
    }
}
