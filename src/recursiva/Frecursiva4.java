
package recursiva;

import javax.swing.JOptionPane;
public class Frecursiva4 {
public static void main(String args[]){
    double num,k;
        k=1;
        num=Double.parseDouble(JOptionPane.showInputDialog("digitar um numero"));
        JOptionPane.showMessageDialog(null,Frecursiva04(num,k));
        
    }
    public static double Frecursiva04(double n,double k){
        double fat;
      
        if(n>1){
           
            fat=(n/k)+Frecursiva04(n-1,k+1);
          
            return fat;
            
        }
        else{
            return 1/k;
        }
    }
}
