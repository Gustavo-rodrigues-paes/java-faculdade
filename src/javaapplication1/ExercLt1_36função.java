/*
 *nome do programa: ExercLt1_36
 *nome do programador:gustavo rodrigues paes
 *Objetivo:36.Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * data de desenvolvimento:29/08/2024
 */
package javaapplication1;

import javax.swing.JOptionPane;


public class ExercLt1_36função {
     public static void main (String args[]){
       int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero "));
        JOptionPane.showMessageDialog(null,funçãoSerie(n));
  
       
      
}     
    
     static String funçãoSerie(int n) {
         int i;
         String k="";
         
      
         String mostra="";
         for(i=1;i<=n;i++){
            
      recursivaFatorial(i);
            k="1/"+ recursivaFatorial(i)+"  ";       
             mostra += k;

             }

         return mostra;
     }
          public  static int  recursivaFatorial(int i){
              int fat;
              if(i>1){
                  fat=i*recursivaFatorial(i-1);
                  return fat;
              }
              else{
           return i;
              }
}
    
    
}
