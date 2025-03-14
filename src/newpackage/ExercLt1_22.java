/*
 *nome do programa: ExercLt1_22
 * nome do programador:gustavo rodrigues paes
 *Objetivo:Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente
 *data:20/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_22 {
    public static void main (String args[]){
        int int1,int2;
        int1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
        int2=Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO"));
        if(int1>int2){
            JOptionPane.showMessageDialog(null,"a ordem é"+int2+"," +int1);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"a ordem é"+int1+ ","+int2);
            
        }
        
    }
    
}
