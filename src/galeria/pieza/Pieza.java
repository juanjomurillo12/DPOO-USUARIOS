package galeria.pieza;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa una pieza de arte en la galería.
 */
public class Pieza {
    private String idPieza;
    private String titulo;
    private int anioCreacion;
    private String lugarCreacion;
    private String estadoPieza;
    private boolean estaExhibida;
    private boolean disponibilidadVenta;
    private List<String> autor;
    private double valorFijo;
    private Date fechaDeIngreso;
    private boolean esVigente;
    private String descripcion;

    public Pieza(String idPieza, String titulo, int anioCreacion, String lugarCreacion, 
                 String estadoPieza, boolean estaExhibida, boolean disponibilidadVenta, 
                 List<String> autor, double valorFijo, Date fechaDeIngreso, 
                 boolean esVigente, String descripcion) {
        this.idPieza = idPieza;
        this.titulo = titulo;
        this.anioCreacion = anioCreacion;
        this.lugarCreacion = lugarCreacion;
        this.estadoPieza = estadoPieza;
        this.estaExhibida = estaExhibida;
        this.disponibilidadVenta = disponibilidadVenta;
        this.autor = autor;
        this.valorFijo = valorFijo;
        this.fechaDeIngreso = fechaDeIngreso;
        this.esVigente = esVigente;
        this.descripcion = descripcion;
    }

  
    public String getIdPieza() {
        return idPieza;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public String getEstadoPieza() {
        return estadoPieza;
    }

    public boolean isEstaExhibida() {
        return estaExhibida;
    }

    public boolean isDisponibilidadVenta() {
        return disponibilidadVenta;
    }

    public List<String> getAutor() {
        return autor;
    }

    public double getValorFijo() {
        return valorFijo;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public boolean isEsVigente() {
        return esVigente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setAnioCreacion(int anioCreacion) {
        if (anioCreacion > 1000 && anioCreacion <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.anioCreacion = anioCreacion;
        } else {
            throw new IllegalArgumentException("Año de creación inválido.");
        }
    }

    public void actualizarEstadoExhibicion(boolean estaExhibida) {
        this.estaExhibida = estaExhibida;
        System.out.println("Estado de exhibición actualizado para la pieza: " + titulo);
    }
}