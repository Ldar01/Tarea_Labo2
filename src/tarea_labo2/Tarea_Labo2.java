/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_labo2;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Tarea_Labo2 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        ListaFacturas facturas = new ListaFacturas();

        while (opcion != 3) {
            try {
                System.out.println("\n==== Bienvenido al menu ====\n"
                        + "1. Agregar\n"
                        + "2. Mostrar\n"
                        + "3. Salir");
                System.out.print("Opcion: ");
                opcion = leer.nextInt();
                System.out.println();

                switch (opcion) {
                    case 1:
                        facturas.agregar();
                        break;
                    case 2:
                        facturas.mostrar();
                        break;
                    case 3:
                        System.out.println("Bye bye\n");
                        break;
                    default:
                        System.out.println("Opcion no valida :l\n");
                        break;
                }
            } 
            catch (InputMismatchException e) {
                System.err.println("Opcion no valida :l, tiene que ser un numero\n");
                leer.nextLine();
            }
        }
    }
}
