import java.util.List;

public class Coleccion extends Obra{
    
    private String nombre;

    public Coleccion(String areaTematica, String titulo, String subTitulo, String primerAutor, String segundoAutor,
            String tercerAutor, Genero genero, String caracteristica, String iSBN, String indice, String idUbicacion,
            Edicion edicion, List<Ejemplar> ejemplar, String nombre) {
        super(areaTematica, titulo, subTitulo, primerAutor, segundoAutor, tercerAutor, genero, caracteristica, iSBN,
                indice, idUbicacion, edicion, ejemplar);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coleccion [nombre=" + nombre + "]";
    }
}
