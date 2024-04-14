package galeria.usuarios;

public class Administrador extends Empleado {
    public Administrador(String idEmpleado, String nombre, String username, String passwordHash, String role) {
        super(idEmpleado, nombre, username, passwordHash, role);
    }

    @Override
    public void realizarAccionesEspecificas() {
        System.out.println(this.nombre + " está administrando el sistema, ajustando configuraciones y gestionando el personal.");
        gestionarSistema();
    }

    private void gestionarSistema() {
        System.out.println("Actualizando configuraciones del sistema y gestionando derechos de acceso de usuarios.");
    
        manageUserAccess();
        updateSystemSettings();
    }

    private void manageUserAccess() {
   
        System.out.println("Acceso de usuarios actualizado.");
    }

    private void updateSystemSettings() {
    
        System.out.println("Configuraciones del sistema actualizadas.");
    }
}