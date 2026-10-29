package modelo;
import java.time.LocalDateTime;

public class Nota {
    private String idNota;
    private String idLibro;
    private String fragmentoOrigen;
    private String contenidoTexto;
    private String categoriaTema;
    private  LocalDateTime fechaCreacion;


    // Constructor: este va a crar el objeto Nota

    public Nota(String idNota, String idLibro,String fragmentsOrigen,String contenidoTexto,String categoriaTema ){
        this.idNota = idNota;
        this.idLibro = idLibro;
        this.fragmentoOrigen = fragmentoOrigen;
        this.contenidoTexto = contenidoTexto;
        this.fechaCreacion = LocalDateTime.now();

    }

    // Metodos para leer  y modificar valores (getters y setters)


    public String getIdNota() { return idNota;}
    public String getIdLibro() {return idLibro;}
    public String getFragmentoOrigen() { return fragmentoOrigen;}
    public String getContenidoTexto() {return contenidoTexto;}
    public void setContenidoTexto(String contenidoTexto) { this.contenidoTexto = contenidoTexto;}
    public String getCategoriaTema() {return categoriaTema;}
    public LocalDateTime getFechaCreacion() {return fechaCreacion;}

}

