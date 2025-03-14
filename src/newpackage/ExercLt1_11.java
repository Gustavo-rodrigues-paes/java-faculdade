/*
 * nome do programa:ExercLt1_11
 * nome do programador:Gustavo Rodrigues Paes
* Objetivo:11.Receba o raio de uma circunferência.
Calcule e mostre o comprimento da circunferência.
*data de desenvolvimento=19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_11 {
    public static void main (String args[])
    {
        double raio,circunferencia;
        raio=Double.parseDouble(JOptionPane.showInputDialog("digite o raio"));
        circunferencia=(raio*3.14*2);
        JOptionPane.showMessageDialog(null,"comprimento da circunferencia:"+circunferencia);
        
        
        
    }
    
    
}
