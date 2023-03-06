/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Llamar {
    
    public static void main(String[] args) {
        String eleccion = "";
        Arbol arbol = null;
        Scanner sc = new Scanner(System.in);
        while (!eleccion.equals("5")) {
            System.out.println("1. Ingresar");
            System.out.println("2. Pre-Orden");
            System.out.println("3. Pos-Orden");
            System.out.println("4. In-Orden");
            System.out.println("5. Salir");
            System.out.println("Elige: ");
            eleccion = sc.nextLine();
            if (eleccion.equals("1")) {
                arbol = AyudanteDatos.obtenerArbol();
            } else if (eleccion.equals("2")) {
                if (arbol != null) {
                    arbol.preorden();
                    System.out.println("");
                } else {
                    System.out.println("No hay datos ingresa algo en la opcion 1");
                }
            } else if (eleccion.equals("3")) {
                if (arbol != null) {
                    arbol.postorden();
                    System.out.println("");
                } else {
                    System.out.println("No hay datos ingresa algo en la opcion 1");
                }
            } else if (eleccion.equals("4")) {
                if (arbol != null) {
                    arbol.inorden();
                    System.out.println("");
                } else {
                    System.out.println("No hay datos ingresa algo en la opcion 1");
                }
            }
        }

    }
    
}
