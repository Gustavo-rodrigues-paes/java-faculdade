/*
 * nome do programa:ExercLt1_24
 * nome do programador:gustavo rodrigues paes
 * Objetivo:Receba um valor inteiro.Verifique e mostre se é divisível por 2 e 3.
 * data de  desenvolvimento:20/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;
public class ExercLt1_24 {
    public static void main (String args[]){
        int int1,x,y,z;
        int1=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
      
        if(int1%2==0){
            if(int1%3==0){
                JOptionPane.showMessageDialog(null,"divisivel por 2 e 3");
                
            }
            else{
                JOptionPane.showMessageDialog(null,"divisivel por 2");
            }
            
            
            
        }
        else{
            if(int1%3==0){
                JOptionPane.showMessageDialog(null,"divisivel por 3");
            }
            
            else{
                
         
            
            JOptionPane.showMessageDialog(null,"não é divisivel nem por 2 e nem por 3");
            
            
            }
        }
    }
    
}
