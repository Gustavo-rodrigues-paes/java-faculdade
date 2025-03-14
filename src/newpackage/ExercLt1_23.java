/*
 *nome do programa: ExercLt1_23
 *nome do programador:gustavo rodrigues paes
 *Objetivo:Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente.
 *data de desenvolvimento:20/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_23 {
    public static void main(String args[]){
        int v1,v2,v3,v4;
        
        v1=Integer.parseInt(JOptionPane.showInputDialog("digitar primeiro valor"));
        v2=Integer.parseInt(JOptionPane.showInputDialog("DIGITE SEGUNDO VALOR"));
        v3=Integer.parseInt(JOptionPane.showInputDialog("digitar terceiro valor"));
        v4=Integer.parseInt(JOptionPane.showInputDialog("digite o quarto valor "));
        if (v4>v3){
            JOptionPane.showMessageDialog(null,"a sequencia é"+v1+","+v2+","+v3+","+v4);  
        }
        else{
            if(v4>v2){
                JOptionPane.showMessageDialog(null,"a sequencia é"+v1+","+v2+","+v4+","+v3);  
            }
            else{
                if(v4>v1){
                   JOptionPane.showMessageDialog(null,"a sequencia é"+v1+","+v4+","+v2+","+v3);   
                }
                else{
                    JOptionPane.showMessageDialog(null,"a sequencia é"+v4+","+v1+","+v2+","+v3);  
                }
            }
        }
    }
    
}
