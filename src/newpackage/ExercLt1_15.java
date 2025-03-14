/*
 * nome do programa:ExercLt1_15
 * nome do programador:Gustavo Rodrigues Paes
 *objetivo:15.Receba os valores de 2 catetos de um triângulo retângulo. 
  Calcule e mostre a hipotenusa.
 *data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_15 {
    public static void main (String args[])
    {
         double cateto1,cateto2,hipotenusa;
        cateto1=Double.parseDouble(JOptionPane.showInputDialog("digitar cateto1"));
        cateto2=Double.parseDouble(JOptionPane.showInputDialog("digitar cateto2"));
        cateto1= (cateto1*cateto1);
        cateto2=(cateto2*cateto2);
        hipotenusa=Math.sqrt(cateto1+cateto2);
        JOptionPane.showMessageDialog(null,"a hipotenusa é"+hipotenusa);
        
        
         
    }
    
}
