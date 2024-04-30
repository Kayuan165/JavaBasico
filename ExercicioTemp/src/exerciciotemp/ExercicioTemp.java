/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciotemp;

import java.util.Scanner;

/**
 *
 * @author Kayuan
 */
public class ExercicioTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double C,F,K,Re,Ra;
        
        C = 2.43;
        
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C *1.8 + 32 + 459.67;
        
        System.out.println("O valor de Fahrenheit é: " + F);
        System.out.println("O valor de Kelvin é: " + K);
        System.out.println("O valor de Reaumur é: " + Re);
        System.out.println("O valor de Rankine é: " + Ra);
    }
    
}
