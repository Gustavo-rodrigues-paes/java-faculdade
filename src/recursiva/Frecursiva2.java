
package recursiva;

import javax.swing.JOptionPane;
public class Frecursiva2 {
   public static void main(String args[]){
    
    int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
        JOptionPane.showMessageDialog(null,Frecursivo2(num));
    }
    public static int Frecursivo2(int n){
        int fat;
        if(n>1){
            fat=(n)+Frecursivo2(n-1);
            
            
            return fat;
        }
        else{
            return n;
           
        }
    }
   
}
