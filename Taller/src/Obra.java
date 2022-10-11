import java.util.List;

public class Obra{

    private String areaTematica;
    private String titulo;
    private String subTitulo;
    private String primerAutor;
    private String segundoAutor;
    private String tercerAutor;
    private Genero genero;
    private String caracteristica;
    private String ISBN;
    private String indice;
    private String idUbicacion;
    private Edicion edicion;
    private List<Ejemplar> ejemplar;
    
    public Obra(String areaTematica, String titulo, String subTitulo, String primerAutor, String segundoAutor,
            String tercerAutor, Genero genero, String caracteristica, String iSBN, String indice, String idUbicacion,
            Edicion edicion, List<Ejemplar> ejemplar) {
        this.areaTematica = areaTematica;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.primerAutor = primerAutor;
        this.segundoAutor = segundoAutor;
        this.tercerAutor = tercerAutor;
        this.genero = genero;
        this.caracteristica = caracteristica;
        ISBN = iSBN;
        this.indice = indice;
        this.idUbicacion = idUbicacion;
        this.edicion = edicion;
        this.ejemplar = ejemplar;
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public void setAreaTematica(String areaTematica) {
        this.areaTematica = areaTematica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getPrimerAutor() {
        return primerAutor;
    }

    public void setPrimerAutor(String primerAutor) {
        this.primerAutor = primerAutor;
    }

    public String getSegundoAutor() {
        return segundoAutor;
    }

    public void setSegundoAutor(String segundoAutor) {
        this.segundoAutor = segundoAutor;
    }

    public String getTercerAutor() {
        return tercerAutor;
    }

    public void setTercerAutor(String tercerAutor) {
        this.tercerAutor = tercerAutor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Edicion getEdicion() {
        return edicion;
    }

    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(List<Ejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "Obra [areaTematica=" + areaTematica + ", titulo=" + titulo + ", subTitulo=" + subTitulo
                + ", primerAutor=" + primerAutor + ", segundoAutor=" + segundoAutor + ", tercerAutor=" + tercerAutor
                + ", genero=" + genero + ", caracteristica=" + caracteristica + ", ISBN=" + ISBN + ", indice=" + indice
                + ", idUbicacion=" + idUbicacion + ", edicion=" + edicion + ", ejemplar=" + ejemplar + "]";
    }

}
