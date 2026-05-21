package Tarea6ED;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ainhoa Garcia
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     
        double total;
        if(numProductos>3){
            precioProducto-=5;
        }
        
        double descuento;
        if (numProductos!=0){
            descuento = 0.8;
        }else {
            descuento = 0.95;
        }            
        calcularyMostrarTotal(precioProducto, descuento);
    }

    private void calcularyMostrarTotal(double precioProducto, double descuento) {
        double total;
        total = precioProducto*descuento;
        System.out.println("El total a pagar es: "+total);
        System.out.println("Enviado");
    }
}