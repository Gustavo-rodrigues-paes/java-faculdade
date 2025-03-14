/*
 * nome do programa: ExercLt1_35
 *nome do programador:gustavo rodrigues paes
 *Objetivo:35.Receba 2 números inteiros, verifique qual o maior entre eles. 
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;

public class ExercLt1_35 {
    public static void main (String args[]){
        int c,i1,i2,k;
        i1=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero inteiro"));
        i2=Integer.parseInt(JOptionPane.showInputDialog("digitar outro numero inteiro"));
       
        c=0;
        if(i1>i2){
            for(k=12;k>=i1;k++){
                System.out.println(k);
                if(i2%2==0){
                    
                }
                else{
                    c=c+i2;
                   System.out.println(k); 
                }
            }
        
        
          
            }
        else{
            for(k=i2;k>=i1;k++){
                System.out.println(k);
                if(i2%2==0){
                    
                }
                else{
                    c=c+i2;
                    System.out.println(k);
                }
            }
            
        }
        
        
    
    
}}
