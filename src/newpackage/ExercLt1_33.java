/*
 * nome do programa:ExercLt1_33
 *nome do programador:gustavo rodrigues paes
 *Objetivo:33.Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_33 {
    public static void main (String args[]){
        
        int z, d, n;
         n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural"));
         z = 1;
         for (d = 1; d <= n; d ++){
           
           System.out.println("O resultado é: "+z+"/"+d);
         }
        
        
    }
    
}
