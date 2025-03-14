/*
 *nome do programa:ExercLt1_26 
 *nome do programador:Gustavo Rodrigues Paes
 *Objetivo:Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * data de desenvolvimento:21/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_26 {
    public static void main (String args[]){
        int int1,int2,int3;
        int1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
        int2=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
       if(int1>int2){
        int3=int1%int2;
       
       }
       else{
           int3=int2%int1;
           
       }
       if(int3==0){
           JOptionPane.showMessageDialog(null,"é divisivel");
       }
       else{
           JOptionPane.showMessageDialog(null,"não é divisivel");
       }
           
       
       
       
    }
    
}
