/*
 *nome do programa:ExercLt1_40
 *nome do programador:gustavo rodrigues paes
 *Objetivo:40.Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;


public class ExercLt1_40 {
    public static void main (String args[]){
        int i1,i2;
        i1=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero inteiro"));
        i2=Integer.parseInt(JOptionPane.showInputDialog("digitar outro numero inteiro"));
      
        if(i1<i2){
            while(i1<=i2){
                if(i1==2){
                
                System.out.println(i1);
            }
                if(i1==3){
                    System.out.println(i1);
                }
                if(i1==5){
                    System.out.println(i1);
                }
               
                if(i1%2!=0){
                    if(i1%3!=0){
                        if(i1%5!=0){
                            System.out.println(i1);
                        }
                    }
                    
                }
                i1=i1+1;
            }
        }
        else{
            while(i2<=i1){
                if(i2==2){
                    System.out.println(i2);
                }
                if(i2==3){
                    System.out.print(i2);
                }
                if(i2==5){
                    System.out.println(i2);
                }
                
                
                
                if(i2%2!=0){
                    if(i2%3!=0){
                        if(i2%5!=0){
                            System.out.println(i2);
                            
                        }
                    }
                }
                i2=i2+1;
            }
            
        }
        
    }
    
}
