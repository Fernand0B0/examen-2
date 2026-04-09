/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

 import java.util.Scanner;
/**
 *
 * @author fboga
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);

       //nombre=Estado
       
       Gestion gestion= new Gestion ();
       
       
        gestion.cargarHabitacion();

        int opcion;

        do {
            System.out.println("\n====== Hotel Reyes ======");
            System.out.println("1. modificar informacion de una habitacion");
            System.out.println("2. mostrar la lista de habitaciones");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                gestion.editarHabitacion();
            } else if (opcion == 2) {
                gestion.mostrarHabitaciones();
           
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        teclado.close();
        
        
        
        
    }
    
}
