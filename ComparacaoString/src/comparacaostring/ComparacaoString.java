/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Kayuan
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Kayuan";
        String nome2 = "Kayuan";
        String nome3 = new String("Kayuan");
        String res;
        
        res = (nome1.equals(nome3))?"igual":"diferente";
        
        System.out.println(res);
    }
    
}
