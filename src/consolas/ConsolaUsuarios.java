package consolas;

import galeria.usuarios.*;
import galeria.pieza.Pieza;
import galeria.sesion.ManejoSesion;
import galeria.acciones.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ConsolaUsuarios {

    public static void main(String[] args) {
      
     
        ManejoSesion.loginEmpleado("adminUsername", "adminPassword");

     
        Empleado empleadoActual = ManejoSesion.getCurrentEmployee();
        if(empleadoActual instanceof Administrador) {
          
            Administrador admin = (Administrador) empleadoActual;
            admin.realizarAccionesEspecificas();
           
        }

     
        ManejoSesion.loginEmpleado("cashierUsername", "cashierPassword");
        empleadoActual = ManejoSesion.getCurrentEmployee();
        if(empleadoActual instanceof Cajero) {
         
            Cajero cajero = (Cajero) empleadoActual;
            cajero.realizarAccionesEspecificas();
        }

 
        ManejoSesion.loginCompradorPropietario("buyerOwnerUsername", "buyerOwnerPassword");
        CompradorPropietario compradorPropietarioActual = ManejoSesion.getCurrentCompradorPropietario();
        if(compradorPropietarioActual != null) {
       
            compradorPropietarioActual.mostrarPiezas();

       
            Pieza pieza = crearPiezaDemo();
            compradorPropietarioActual.addPieza(pieza);
            compradorPropietarioActual.removePieza(pieza);
        }

      
        empleadoActual = ManejoSesion.getCurrentEmployee();
        if(empleadoActual instanceof Operador) {
   
            Operador operador = (Operador) empleadoActual;
            operador.realizarAccionesEspecificas();
        }


        ManejoSesion.logout();
    }

    private static Pieza crearPiezaDemo() {
 
        String idPieza = "P001";
        String titulo = "La Gioconda";
        int anioCreacion = 1503;
        String lugarCreacion = "Italia";
        String estadoPieza = "Bodega";
        boolean estaExhibida = true;
        boolean disponibleVenta = true;
        List<String> autor = Arrays.asList("Leonardo da Vinci");
        double valorFijo = 8000000.0; 
        int valorMinimo = 7500000; 
        int valorInicial = 7000000; 
        Date fechaDeIngreso = new Date(); 
        boolean esVigente = true;
        String descripcion = "Una de las pinturas más reconocidas del mundo.";
        Propietario propietario = new Propietario("Owner001", new ArrayList<>()); 
       
        return new Pieza(idPieza, titulo, anioCreacion, lugarCreacion, estadoPieza, estaExhibida,
                         disponibleVenta, autor, valorFijo, valorMinimo, valorInicial,
                         fechaDeIngreso, esVigente, descripcion, propietario);
    }
}