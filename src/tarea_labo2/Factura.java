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
public class Factura {

    private String proveedor;
    public String nombre_producto;
    public int cantidad;
    private int numero_de_telefono;
    private float precio;

    public Factura() {}

    public Factura(String proveedor, String producto, int cantidad, float precio,int numero) {
        this.proveedor = proveedor;
        this.nombre_producto = producto;
        this.cantidad = cantidad;
        this.numero_de_telefono =numero;
        this.precio = precio;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    public String getNombre_producto() {
        return nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProveedor() {
        return proveedor;
    } 

    @Override
    public String toString() {
        return "Factura{"+"Proveedor: "+ proveedor + ",Nombre del Producto: "+ nombre_producto +" Cantidad: " + cantidad + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumero_de_telefono(int numero_de_telefono) {
        this.numero_de_telefono = numero_de_telefono;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumero_de_telefono() {
        return numero_de_telefono;
    }

    public float getPrecio() {
        return precio;
    }
        
}
