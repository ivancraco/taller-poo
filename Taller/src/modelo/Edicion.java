package modelo;

/**
 * Clase que representa la edicion de una obra en particular
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Edicion {
    
    private String editorial;
    private String paisEdicion;
    private int numeroEdicion;
    private int anio;
    private int volumenes;
    private int paginas;
    private String idioma;
    private String formato;

    public Edicion(String editorial, String paisEdicion, int numeroEdicion, int anio, int volumenes, int paginas,
            String idioma, String formato) {
        this.editorial = editorial;
        this.paisEdicion = paisEdicion;
        this.numeroEdicion = numeroEdicion;
        this.anio = anio;
        this.volumenes = volumenes;
        this.paginas = paginas;
        this.idioma = idioma;
        this.formato = formato;
    }

    /**
     * 
     * @return editorial de tipo String
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * 
     * @param editorial establece una nueva editorial
     * de tipo String
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * 
     * @return pais de edicion de tipo String
     */
    public String getPaisEdicion() {
        return paisEdicion;
    }

    /**
     * 
     * @param paisEdicion establece un nuevo pais 
     * de tipo String
     */
    public void setPaisEdicion(String paisEdicion) {
        this.paisEdicion = paisEdicion;
    }

    /**
     * 
     * @return numero de edicion de tipo int
     */
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    /**
     * 
     * @param numeroEdicion establece un nuevo
     * numero de edicion de tipo int
     */
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    /**
     * 
     * @return anio de edicion de tipo int
     */
    public int getAnio() {
        return anio;
    }

    /**
     * 
     * @param anio establece un nuevo anio
     * de tipo int
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * 
     * @return volumenes de una edicion de tipo int
     */
    public int getVolumenes() {
        return volumenes;
    }

    /**
     * 
     * @param volumenes establece un nuevo valor
     * para los volumenes de tipo int
     */
    public void setVolumenes(int volumenes) {
        this.volumenes = volumenes;
    }

    /**
     * 
     * @return cantidad de paginas de tipo int
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * 
     * @param paginas establece un nuevo valor
     * para las paginas de tipo int
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * 
     * @return idioma de tipo String de la edicion 
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * 
     * @param idioma establece un nuevo idioma 
     * de tipo String para la edicion 
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * 
     * @return formato de tipo String
     */
    public String getFormato() {
        return formato;
    }

    /**
     * 
     * @param formato establece un nuevo formato
     * de tipo String para la edicion
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Edicion [editorial=" + editorial + ", paisEdicion=" + paisEdicion + ", numeroEdicion=" + numeroEdicion
                + ", anio=" + anio + ", volumenes=" + volumenes + ", paginas=" + paginas + ", idioma=" + idioma
                + ", formato=" + formato + "]";
    }

}
