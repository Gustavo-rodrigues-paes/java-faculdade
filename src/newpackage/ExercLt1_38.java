/*
 *nome do programa: ExercLt1_38
 *nome do programador:gustavo rodrigues paes
 *Objetivo:38.Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_38 {
    public static void main (String args[]){
        double x,i,ma,me;
        x=Double.parseDouble(JOptionPane.showInputDialog("digitar um valor inteiro"));
        ma=x;
        me=x;
       for(i=2;i<=5;i++){
           x=Integer.parseInt(JOptionPane.showInputDialog("digitar um valor inteiro"));
           if(x<0){
               i=i-1;
               JOptionPane.showMessageDialog(null, "numero negativo não é permitido escreva novamente");
           }
           else{
           if(x>ma){
               ma=x;
           }
           else{
               if(x<me){
                   me=x;
                   
               }
           }
         
           
       } 
       }
        System.out.println(ma);
        System.out.println(me);
        
    }
    
}
