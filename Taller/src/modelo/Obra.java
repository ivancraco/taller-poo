package modelo;
import java.util.List;

/**
 * Clase que representa una obra dentro de la biblioteca
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Obra{

    private String areaTematica;
    private String areaDeReferencia;
    private String titulo;
    private String subTitulo;
    private String primerAutor;
    private String segundoAutor;
    private String tercerAutor;
    private Genero genero;
    private String caracteristica;
    private String ISBN;
    private List<String> indices;
    private Edicion edicion;
    private List<Ejemplar> ejemplares;
    private Integer solicitadasAlumnosDocentes;
    private Integer solicitadasPublicoGeneral;
    
    /**
     * Constructor parametrizado
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
     * @param ejemplares
     */
    public Obra(String areaTematica, String areaDeReferencia, String titulo, String subTitulo, String primerAutor, String segundoAutor,
            String tercerAutor, Genero genero, String caracteristica, String iSBN, List<String> indices,
            Edicion edicion, List<Ejemplar> ejemplares) {
        this.areaTematica = areaTematica;
        this.areaDeReferencia = areaDeReferencia;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.primerAutor = primerAutor;
        this.segundoAutor = segundoAutor;
        this.tercerAutor = tercerAutor;
        this.genero = genero;
        this.caracteristica = caracteristica;
        ISBN = iSBN;
        this.indices = indices;
        this.edicion = edicion;
        this.ejemplares = ejemplares;
        this.solicitadasAlumnosDocentes = 0;
        this.solicitadasPublicoGeneral = 0;

    }

    /**
     * @return String area tematica de la obra
     */
    public String getAreaTematica() {
        return areaTematica;
    }

    /**
     * 
     * @param areaTematica establece un nuevo valor
     * de tipo String para el area tematica
     */
    public void setAreaTematica(String areaTematica) {
        this.areaTematica = areaTematica;
    }

    /**
     * 
     * @return String titulo de la obra
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @param titulo establece un nuevo titulo
     * de tipo String para la obra
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * 
     * @return String sub titulo de la obra
     */
    public String getSubTitulo() {
        return subTitulo;
    }

    /**
     * 
     * @param subTitulo establece un nuevo sub titulo
     * de tipo String para la obra
     */
    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    /**
     * 
     * @return String primer autor de la obra
     */
    public String getPrimerAutor() {
        return primerAutor;
    }

    /**
     * 
     * @param primerAutor establece un nuevo primer autor
     * de tipo String para la obra
     */
    public void setPrimerAutor(String primerAutor) {
        this.primerAutor = primerAutor;
    }

    /**
     * 
     * @return String segundo autor de la obra
     */
    public String getSegundoAutor() {
        return segundoAutor;
    }

    /**
     * 
     * @param segundoAutor establece un segundo autor
     * de tipo String para la obra
     */
    public void setSegundoAutor(String segundoAutor) {
        this.segundoAutor = segundoAutor;
    }

    /**
     * 
     * @return String tercer autor de la obra
     */
    public String getTercerAutor() {
        return tercerAutor;
    }

    /**
     * 
     * @param tercerAutor establece un nuevo tercer autor
     * de tipo String para la obra
     */
    public void setTercerAutor(String tercerAutor) {
        this.tercerAutor = tercerAutor;
    }

    /**
     * 
     * @return enum Genero de la obra
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * 
     * @param genero establece un nuevo genero
     * de tipo enum para la obra
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * 
     * @return String caracteristica de la obra
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * 
     * @param caracteristica establece una nueva caracteristica
     * de tipo String para la obra
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    /**
     * 
     * @return String ISBN de la obra
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * 
     * @param iSBN establece un nuevo ISBN
     * de tipo String para la obra
     */
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    /**
     * 
     * @return lista de String que identifica los indices
     * de la obra
     */
    public List<String> getIndice() {
        return indices;
    }

    /**
     * 
     * @param indices establece una nueva lista de String
     * para los indices
     */
    public void setIndice(List<String> indices) {
        this.indices = indices;
    }

    /**
     * 
     * @return Edicion de la obra
     */
    public Edicion getEdicion() {
        return edicion;
    }

    /**
     * 
     * @param edicion establece una nueva edicion para la obra
     */
    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }

    /**
     * 
     * @return listado de ejemplares pertenecientes 
     * a la obra
     */
    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    /**
     * 
     * @param ejemplares establece una nueva lista de
     * ejemplares para la obra
     */
    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * 
     * @return String area de referencia de la obra
     */
    public String getAreaDeReferencia() {
        return areaDeReferencia;
    }

    /**
     * 
     * @param areaDeReferencia establece una nueva referencia
     * de tipo String para la obra
     */
    public void setAreaDeReferencia(String areaDeReferencia) {
        this.areaDeReferencia = areaDeReferencia;
    }

    /**
     * 
     * @return Integer cantidad de veces que la obra fue solicitada
     * por alumnos y docentes
     */
    public Integer getSolicitadasAlumnosDocentes() {
        return solicitadasAlumnosDocentes;
    }

    /**
     * 
     * @param solicitadasAlumnosDocentes establece una nueva cantidad
     * de tipo Integer de las veces que la obra fue solicitada por
     * alumnos y docentes 
     */
    public void setSolicitadasAlumnosDocentes(Integer solicitadasAlumnosDocentes) {
        this.solicitadasAlumnosDocentes = solicitadasAlumnosDocentes;
    }

    /**
     * 
     * @return Integer cantidad de veces que la obra fue solicitad
     * por publico en general
     */
    public Integer getSolicitadasPublicoGeneral() {
        return solicitadasPublicoGeneral;
    }

    /**
     * 
     * @param solicitadasPublicoGeneral establece una nueva cantidad
     * de tipo Integer de las veces que la obra fue solicitada por
     * publico en general
     */
    public void setSolicitadasPublicoGeneral(Integer solicitadasPublicoGeneral) {
        this.solicitadasPublicoGeneral = solicitadasPublicoGeneral;
    }

    @Override
    public String toString() {
        return "Obra [areaTematica=" + areaTematica + ", areaDeReferencia=" + areaDeReferencia + ", titulo=" + titulo
                + ", subTitulo=" + subTitulo + ", primerAutor=" + primerAutor + ", segundoAutor=" + segundoAutor
                + ", tercerAutor=" + tercerAutor + ", genero=" + genero + ", caracteristica=" + caracteristica
                + ", ISBN=" + ISBN + ", indices=" + indices + ", edicion=" + edicion + ", ejemplares=" + ejemplares
                + ", solicitadasAlumnosDocentes=" + solicitadasAlumnosDocentes + ", solicitadasPublicoGeneral="
                + solicitadasPublicoGeneral + "]";
    }

    
}
