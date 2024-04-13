package galeria.acciones;
import galeria.sesion.ManejoSesion;
import galeria.usuarios.Cajero;
public class CajeroAcciones extends EmpleadoAcciones {
    public static void processPayments() {
        if (ManejoSesion.getCurrentEmployee() instanceof Cajero) {
            System.out.println("Procesando pagos...");
   
        } else {
            System.out.println("Acceso denegado. Solo los cajeros pueden procesar pagos.");
        }
    }
}