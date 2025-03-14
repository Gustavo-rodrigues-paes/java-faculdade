/*
 *nome do programa:ExercLt1_32
 *nome do programador:gustavo rodrigues paes
 * Objetivo:32.Receba um número inteiro. Calcule e mostre o seu fatorial.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_32 {
    public static void main (String args[]){
        int z,n;
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero inteiro"));
        z=1;
        for(int f = 1; f <= n; f++) {
            z=(f*z);
            
        }
        System.out.println("O FATORIAL DE "+n+" é:"+z);
    }
        
    }
    


