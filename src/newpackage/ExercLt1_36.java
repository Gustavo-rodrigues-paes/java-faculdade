/*
 *nome do programa: ExercLt1_36
 *nome do programador:gustavo rodrigues paes
 *Objetivo:36.Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;


public class ExercLt1_36 {
    public static void main (String args[]){
        int q,c,n,f;
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero "));
        f=1;
        q=1;
        c=0;
       
       while(f<=n){
            q=q*f;
            f=f+1;
            System.out.println("1/"+q);
        }
        
    }
    
}
