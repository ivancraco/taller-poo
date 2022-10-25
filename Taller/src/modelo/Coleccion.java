package modelo;

import java.util.List;

/**
 * Clase que extiende de Obra y que representa una
 * colección de la misma con su nombre e ISBN propio.
 * 
 * @author Ivan Craco
 */
public class Coleccion extends Obra{
    
    private String nombre;

    /**
     * Constructor parametrizado que rellena los valores
     * con el constructor de la clase padre.
     * 
     * @param areaTematica
     * @param areaDeReferencia
     * @param titulo
     * @param subTitulo
     * @param primerAutor
     * @param segundoAutor
     * @param tercerAutor
     * @param genero
     * @param caracteristica
     * @param iSBN
     * @param indices
     * @param edicion
     * @param ejemplar
     * @param nombre
     */
    public Coleccion(String areaTematica, String areaDeReferencia, String titulo, String subTitulo, String primerAutor, String segundoAutor,
            String tercerAutor, Genero genero, String caracteristica, String iSBN, List<String> indices,
            Edicion edicion, List<Ejemplar> ejemplar, String nombre) {
        super(areaTematica, areaDeReferencia, titulo, subTitulo, primerAutor, segundoAutor, tercerAutor, genero, caracteristica, iSBN,
                indices, edicion, ejemplar);
        this.nombre = nombre;
    }

    /**
     * 
     * @return nombre de la colección
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre establece un nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coleccion [nombre=" + nombre + "]";
    }
}
