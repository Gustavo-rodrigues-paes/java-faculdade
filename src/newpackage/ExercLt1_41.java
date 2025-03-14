/*
 *nome do programa: ExercLt1_41
 * nome do programador:gustavo rodrigues paes
 *Objetivo:41.Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 *data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;

public class ExercLt1_41 {
    public static void main (String args[]){
        int d1,d2,p,pt;
     for(d1=1;d1<=6;d1++){
         for(d2=1;d2<=6;d2++){
             if(d1+d2==7){
                 System.out.println(d1+","+d2);
             }
         }
     }
        
    }
    
}
