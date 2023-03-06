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
public class AyudanteDatos {
    
    public static Arbol obtenerArbol() {
        String palabra = AyudanteDatos.solicitarPalabra();
        Arbol arbol = new Arbol();
        for (int i = 0; i < palabra.length(); i++) {
            String letra = String.valueOf(palabra.charAt(i));
            if (!arbol.existe(letra)) {
                arbol.insertar(letra);
            }
        }
        return arbol;
    }

    private static String solicitarPalabra() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresa la palabra: ");
            String palabra = sc.nextLine();
            if (palabra.indexOf(" ") != -1) {
                System.out.println("No puedes ingresar palabras con espacios");
            } else if (palabra.length() < 10) {
                System.out.println("La longitud minima es de 10");
            } else {
                return palabra;
            }
        }
    }
    
}
