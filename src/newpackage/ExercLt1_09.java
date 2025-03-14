/*
* nome do programa: ExercLt1_09 
* nome do programador: Gustavo Rodrigues Paes
* Objetivo:Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
* data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_09 {
    public static void main(String args[])
    {
        Double x,y;
        x=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR De x"));
        y=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR De y"));       
        x=(x*x);
        y=(y*y);
        JOptionPane.showMessageDialog(null,"quadrado de x: "+x);
        JOptionPane.showMessageDialog(null,"quadrado de y:"+y);
        
        
        
        
        
        
        
    }
    
}
