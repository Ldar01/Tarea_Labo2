/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea_labo2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class ListaFacturas {
    
    private ArrayList<Factura> facturas;
    
    public ListaFacturas(){
        facturas = new ArrayList<>();
    }
    
    public void agregar(){
        Factura factura = new Factura();
        
        facturas.add(factura);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del proveedor: ");
        factura.setProveedor(input.nextLine());
        
        System.out.println("Ingrese el nombre del producto: ");
        factura.setNombre_producto(input.nextLine());
        
        System.out.println("Ingrese la cantidad que se compro: ");
        factura.setCantidad(input.nextInt());
        
    }

    
    public void mostrar(){
        for ( Factura f : facturas){
            System.out.println(f.toString());
        }
    }
}
