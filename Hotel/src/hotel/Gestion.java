package hotel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fboga
 */
public class Gestion {

    private  int opcionEstado;
    public Habitacion[] Habitaciones;
    /**
     *
     */
    public  void editarHabitacion() {

     Scanner teclado = new Scanner(System.in);

    }

    public Gestion() {
        this.Habitaciones = new Habitacion[3];
    }
    
//    public  void cargarHabitaciones() {
//        Habitaciones[0] = new Habitacion(1,  "34",  Estado.LIBRE);
//        Habitaciones[1] = new Habitacion(2, "15",  Estado.SUCIA);
//        Habitaciones[2] = new Habitacion(3,  "14",  Estado.OCUPADA);
//
//    
//    }

    public  void editarHabitaciones() {

        System.out.print("\nIngrese el numero de la habitacion que deseas cambiar ");
        int PrecioBuscado = teclado.nextInt();

        
        Habitacion encontrado = null;
        for (int i = 0; i < Habitaciones.length; i++) {
            if (Habitaciones[i].getPrecio() == PrecioBuscado) {
                encontrado = Habitaciones[i];
            }
        }


        System.out.println("\nHabitacion encontrado: " + encontrado.getHabitacion());
        System.out.println("¿Qué desea cambiar?");
        System.out.println("1. numero de habitacion");
        System.out.println("2. Piso");
        System.out.print("Elija: ");
        int opcionEditar = teclado.nextInt();

             

  

        
            System.out.println("Elija el estado de la habitacion:");
            System.out.println("1. Sucia");
            System.out.println("2. Libre");
            System.out.println("3. Ocupada");
            System.out.print("Elija: ");
            int opcionAfinidad = teclado.nextInt();

            if (opcionEstado == 1) {
                encontrado.setEstado(Estado.Sucia);
            } else if (opcionEstado == 2) {
                encontrado.setEstado(Estado.Libre);
            } else if (opcionEstado == 3) {
                encontrado.setEstado(Estado.Ocupa);
            } else if (opcionEstado == 4) {
           
                
            }
            System.out.println("Estado actualizada!");

       
    }

    public  void mostrarHabitaciones() {
        System.out.println("\n--- LISTA DE Habitaciones ---");
        System.out.println("Habitacion 1  | Habitacion 2   | habitacion 3 ");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < Habitaciones.length; i++) {
            String categoria = obtenerCategoria(Habitaciones[i]);
            System.out.println(
                Habitaciones[i].getPrecio()                 + "   | " +
                Habitaciones[i].getCapacidad()             + "   | " +
                Habitaciones[i].geEstado()   + "  | " +
                categoria
            );
        }
    }
}