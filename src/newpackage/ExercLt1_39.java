/*
 *nome do programa: ExercLt1_39
 *nome do programador:gustavo rodrigues paes
 *Objetivo:39.Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;

public class ExercLt1_39 {
    public static void main (String args[]){
        int gt,c,q;
      gt=0;
        q=1;
        for(c=1;c<=64;c++){
       gt=q+gt;
       q=q*2;
       System.out.println(gt);
        
    }
    
}
}
