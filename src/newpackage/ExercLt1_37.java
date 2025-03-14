/*
 *nome do programa : ExercLt1_37
 *nome do programador :gustavo rodrigues paes
 *Objetivo:37.Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;


public class ExercLt1_37 {
    public static void main (String args[]){
        int n,a,b,c,s;
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar m numero da sequencia de fibonaci"));
        a=0;
        b=1;
        c=0;
        s=0; 
        while(s<=n){
            s=s+1;
            c=b+a;
            a=b;
            b=c;
            System.out.println(c);
        }
        
    }
    
}
