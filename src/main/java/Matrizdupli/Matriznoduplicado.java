/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrizdupli;


import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Usuario
 */
public class Matriznoduplicado {
    
    private static final Logger logger = LoggerFactory.getLogger(Matriznoduplicado.class);
    public static void main(String args[]) {
        
        int[][] test = new int[][]{
            {3, 5, 5, 1, 4, 3, 5},
            {4, 4, 4, 4, 4, 4, 4},
            {7, 6, 5, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3},};

      for (int[] input : test) {
            System.out.println("Cuando esta duplicado : " + Arrays.toString(input));
            System.out.println("sin duplicar :          " + Arrays.toString(removeDuplicates(input)));
            System.out.println("\n");
        }
    }


    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

     
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }

    }
    
    

