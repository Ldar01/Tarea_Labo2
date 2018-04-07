/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea_labo2;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Inventario {
    
    private String nombre_producto;
    private int cantidad;
    
    public Inventario(){}
    
    public Inventario(String nombre_producto, String proveedor, int cantidad){
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    

}
