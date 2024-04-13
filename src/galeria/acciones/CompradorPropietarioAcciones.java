package galeria.acciones;
import galeria.pieza.Pieza;
import galeria.usuarios.CompradorPropietario;
import galeria.sesion.ManejoSesion;

public class CompradorPropietarioAcciones {
    public static void viewMyPieces() {
        CompradorPropietario current = ManejoSesion.getCurrentCompradorPropietario();
        if (current != null) {
            System.out.println("Mostrando piezas de " + current.getNombre() + ":");
            current.mostrarPiezas();
 
        } else {
            System.out.println("No hay comprador/propietario logueado para mostrar piezas.");
        }
    }

    public static void purchasePiece(Pieza pieza) {
        CompradorPropietario current = ManejoSesion.getCurrentCompradorPropietario();
        if (current != null && pieza != null) {
            current.addPieza(pieza);
            System.out.println("Pieza comprada y añadida a la colección: " + pieza.getTitulo());
        } else {
            System.out.println("Operación de compra no pudo ser completada.");
        }
    }
}