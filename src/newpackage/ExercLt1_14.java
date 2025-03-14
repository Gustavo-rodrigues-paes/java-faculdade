/*
 *nome do programa:ExercLt1_14
 *nome do programador: Gustavo Rodrigues Paes
 *Objetivo:Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_14 {
    public static void main(String args[]){
        double angulo1,angulo2,angulo3;
        angulo1=Double.parseDouble(JOptionPane.showInputDialog("digitar primeiro angulo do triangulo"));
        angulo2=Double.parseDouble(JOptionPane.showInputDialog("digitar o segundo angulo do triangulo"));
        angulo3=(180-angulo1-angulo2);
        JOptionPane.showMessageDialog(null,"o terceiro angulo do triangulo é"+angulo3);
        
    }
    
}
