/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Kayuan
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas Pernas? ");
        int perna = teclado.nextInt();
        System.out.print("Isso eh um(a) ");
        
        String tipo;
        
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                        
        }
        
        System.out.println(tipo);
        
    }
    
}
