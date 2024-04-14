package galeria.usuarios;

public class Operador extends Empleado {
    public Operador(String idEmpleado, String nombre, String username, String passwordHash, String role) {
        super(idEmpleado, nombre, username, passwordHash, role);
    }

    @Override
    public void realizarAccionesEspecificas() {
        System.out.println(this.nombre + " está coordinando eventos y supervisando las operaciones diarias de la galería.");
        coordinarEventos();
    }

    public void coordinarEventos() {
        System.out.println("Organizando nuevos eventos y supervisando la programación de exposiciones.");
  
        System.out.println("Detalles del evento ajustados y recursos asignados.");
    }

    public void programarEventos() {
        System.out.println("Configurando el calendario de eventos para la galería.");
       
        System.out.println("Calendario actualizado con nuevos eventos.");
    }
}