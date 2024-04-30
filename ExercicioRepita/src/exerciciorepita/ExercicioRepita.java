/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Kayuan
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero:  <br><em>Valor 0 interrompe</em></html>"));
            s += n;
        }while (n != 0);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final <br>----------------" +
                 "<br>Total de Valores " + s + "</html>");
    }
    
}
