package galeria.usuarios;

import galeria.pieza.Pieza;
import java.util.ArrayList;
import java.util.List;

public class CompradorPropietario {
    private String idUsuario;
    private String nombre;
    private String username;
    private String informacionContacto;
    private List<Pieza> piezas;
    private double limiteCompra;
    private boolean estaVerificado;

    // Constructor
    public CompradorPropietario(String idUsuario, String nombre, String username, String informacionContacto, double limiteCompra, boolean estaVerificado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.username = username;
        this.informacionContacto = informacionContacto;
        this.limiteCompra = limiteCompra;
        this.estaVerificado = estaVerificado;
        this.piezas = new ArrayList<>();
    }

    // Getters
    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public boolean isEstaVerificado() {
        return estaVerificado;
    }

    public List<Pieza> getPiezas() {
        return new ArrayList<>(piezas);
    }

    // Setters
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public void setEstaVerificado(boolean estaVerificado) {
        this.estaVerificado = estaVerificado;
    }

 // Método para añadir una pieza, verificando primero la verificación del comprador y el límite de compra
    public void addPieza(Pieza pieza) {
        if (!estaVerificado) {
            System.out.println("Operación denegada: El usuario no está verificado.");
            return;
        }
        if (pieza.getValorFijo() > limiteCompra) {
            System.out.println("Operación denegada: El precio de la pieza excede el límite de compra.");
            return;
        }
        this.piezas.add(pieza);
        System.out.println("Pieza añadida: " + pieza.getTitulo());
    }

    // Método para mostrar todas las piezas
    public void mostrarPiezas() {
        if (piezas.isEmpty()) {
            System.out.println("No tienes ninguna pieza.");
        } else {
            System.out.println("Listado de piezas:");
            for (Pieza pieza : piezas) {
                System.out.println(pieza.getTitulo() + " - " + pieza.getDescripcion());
            }
        }
    }
}