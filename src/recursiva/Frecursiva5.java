/*
Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
*/
package recursiva;

import javax.swing.JOptionPane;
public class Frecursiva5 {
    public static void main(String args[]){
         int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero"));
        JOptionPane.showMessageDialog(null,Frecursivo5(n));
        
    }
    
     public static int Frecursivo5(int n){
        int fat;
        if(n>1){
            fat=FrecursivoX(n)+Frecursivo5(n-1);
            
            
            return fat;
        }
        else{
            return n;
           
        }
    }
    public static int FrecursivoX(int n){
        int fat;
        if(n>1){
            fat=n*FrecursivoX(n-1);
            
            System.out.println("o valor de n é : "+n);
            return fat;
        }
        else{
            return n;
        }
    }
}
    
    
    
    