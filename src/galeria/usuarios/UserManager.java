package galeria.usuarios;

import galeria.pieza.Pieza;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static Map<String, CompradorPropietario> compradoresPropietarios = new HashMap<>();
    private static Map<String, Empleado> empleados = new HashMap<>();


    public static void registerCompradorPropietario(String username, CompradorPropietario compradorPropietario) {
        compradoresPropietarios.put(username, compradorPropietario);
    }

    public static CompradorPropietario getCompradorPropietario(String username) {
        return compradoresPropietarios.get(username);
    }


    public static void registerEmpleado(String username, Empleado empleado) {
        empleados.put(username, empleado);
    }

    public static Empleado getEmpleado(String username) {
        return empleados.get(username);
    }


    public static void addPieceToCompradorPropietario(String username, Pieza pieza) {
        CompradorPropietario compradorPropietario = getCompradorPropietario(username);
        if (compradorPropietario != null) {
            compradorPropietario.addPieza(pieza);
        }
    }


    public static boolean isEmpleado(String username) {
        return empleados.containsKey(username);
    }
}