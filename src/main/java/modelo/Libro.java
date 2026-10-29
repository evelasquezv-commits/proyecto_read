
package modelo;

public class Libro {
    private String idLibro;
    private String titulo;
    private String autor;
    private String rutaArchivo;
    private String formato;

    // Constructor
    public Libro(String idLibro, String titulo, String autor, String rutaArchivo, String formato) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.rutaArchivo = rutaArchivo;
        this.formato = formato;
    }

    // Constructor secundario (por si el formato no se especifica inmediatamente)
    public Libro(String idLibro, String titulo, String autor, String rutaArchivo) {
        this(idLibro, titulo, autor, rutaArchivo, "EPUB");
    }

    // Métodos Getters y Setters
    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
