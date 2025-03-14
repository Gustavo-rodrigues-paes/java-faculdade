/*
 *nome do programa: ExercLt1_34
 * nome do programador:gustavo rodrigues paes
 *Objetivo:34.Receba um número. Calcule e mostre os resultados da tabuada desse número.
 *data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;
public class ExercLt1_34 {
    public static void main (String args[]){
        int t,r,n;
        n=Integer.parseInt(JOptionPane.showInputDialog("escreva um numero para saber sua tabuada"));
        for (t=1;t<=10;t++){
        r=t*n;
        System.out.println("8"+"X"+t+"="+ r);
        
    }
    
    }}
