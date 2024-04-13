package galeria.acciones;
import galeria.sesion.ManejoSesion;
import galeria.usuarios.Administrador;
public class AdministradorAcciones extends EmpleadoAcciones {
    public static void manageUsers() {
        if (ManejoSesion.getCurrentEmployee() instanceof Administrador) {
            System.out.println("Administrando usuarios...");
       
        } else {
            System.out.println("Acceso denegado. Solo los administradores pueden gestionar usuarios.");
        }
    }

  
}
