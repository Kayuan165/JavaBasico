/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciohomensmulheres;

import java.util.Scanner;

/**
 *
 * @author Kayuan
 */
public class ExercicioHomensMulheres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sexo,qtMulheres = 0,qtHomens = 0;
        float  altura = 0, somaH = 0, mediaHomens = 0, maior = 0, menor = 10;
        
        Scanner teclado = new Scanner(System.in);
        
        try{
        for(int i = 0; i < 10; i++){
            
            System.out.println("Esolha um sexo: 1-Homem / 2-Mulher");
            sexo = teclado.nextInt();
            
            System.out.println("Digite a altura");
            altura = teclado.nextFloat();
            
            if( sexo == 1){
                qtHomens++;
                somaH += altura;
            }else if (sexo == 2){
                qtMulheres++;
            }else{
                System.out.println("Opção de sexo inválida");
            }
            if(altura > maior ){
                maior = altura;
            }else if(altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;
        
        System.out.println("A maior altura do grupo é " + maior);
        System.out.println("A média de altura dos homens é: " + mediaHomens);
        System.out.println("A quantidade de mulheres é: " + qtMulheres);
        
        teclado.close();
        }catch(java.util.InputMismatchException nexc){
            System.out.println("Utilize o caracter ',' ");
        }
    }
}
