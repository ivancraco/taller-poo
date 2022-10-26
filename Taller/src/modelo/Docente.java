package modelo;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase que hereda de la clase Lector y representa
 * un tipo de lector por parte de la biblioteca.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Docente extends Lector{
    
    private List<String> carrera;

    public Docente(String nombre, String apellido, TipoLector tipoLector, String documento, String correo, String celular,
            LocalDate fechaNac, String sexo, String nacionalidad, Domicilio domicilio, List<String> carrera) {
        super(nombre, apellido, tipoLector, documento, correo, celular, fechaNac, sexo, nacionalidad, domicilio);
        this.carrera = carrera;
    }

    /**
     * 
     * @return lista de objeto String con las carreras
     * del docente
     */
    public List<String> getCarrera() {
        return carrera;
    }

    /**
     * 
     * @param carrera establece una nueva lista
     * de carreras
     */
    public void setCarrera(List<String> carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Docente [carrera=" + carrera + "]";
    }
}
