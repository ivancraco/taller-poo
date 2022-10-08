import java.util.List;

public class Edicion {
    
    private String editorial;
    private String paisEdicion;
    private int numeroEdicion;
    private int anio;
    private int volumenes;
    private int paginas;
    private String idioma;
    private String formato;
    private List<Obra> obra;
    
    public Edicion(String editorial, String paisEdicion, int numeroEdicion, int anio, int volumenes, int paginas,
            String idioma, String formato, List<Obra> obra) {
        this.editorial = editorial;
        this.paisEdicion = paisEdicion;
        this.numeroEdicion = numeroEdicion;
        this.anio = anio;
        this.volumenes = volumenes;
        this.paginas = paginas;
        this.idioma = idioma;
        this.formato = formato;
        this.obra = obra;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPaisEdicion() {
        return paisEdicion;
    }

    public void setPaisEdicion(String paisEdicion) {
        this.paisEdicion = paisEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVolumenes() {
        return volumenes;
    }

    public void setVolumenes(int volumenes) {
        this.volumenes = volumenes;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public List<Obra> getObra() {
        return obra;
    }

    public void setObra(List<Obra> obra) {
        this.obra = obra;
    }

    @Override
    public String toString() {
        return "Edicion [editorial=" + editorial + ", paisEdicion=" + paisEdicion + ", numeroEdicion=" + numeroEdicion
                + ", anio=" + anio + ", volumenes=" + volumenes + ", paginas=" + paginas + ", idioma=" + idioma
                + ", formato=" + formato + ", obra=" + obra + "]";
    }

}
