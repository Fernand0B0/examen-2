/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fboga
 */
public class Habitacion {
    
    private String Habitaciones;
    private int Precio;
    private String Capacidad;
    private Estado Estado;
    private String Habitacion;
    
    public Habitacion(int Precio, String Capacidad, Estado Estado) {
        this.Precio              = Precio;
        this.Capacidad           = Capacidad;
        this.Estado              = Estado;
    }


    public int getPrecio() {
        return Precio;
    }

    public String getCapacidad() {
        return Capacidad;
    
    }

    public Estado getEstado() {
        return Estado;
    }

    
    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public void setPrecio(int Precio) {
    
        if (Precio >= 30 && Precio <= 100) {
            this.Precio = Precio;
        } else {
            
        }
    }

    public void setEstado(Estado Estado) {
        this.Estado = Estado;
    }
}
