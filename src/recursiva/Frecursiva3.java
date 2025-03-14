
package recursiva;

import javax.swing.JOptionPane;
public class Frecursiva3 {
    public static void main(String args[]){
    
    double num;
        num=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero"));
        JOptionPane.showMessageDialog(null,Frecursivo3(num));
    }
    
    public static double Frecursivo3(double n){
        double fat;
        if(n>1){
            fat=(1/n)+(Frecursivo3(n-1));
            return fat;
        }
        else{
            return n;
        }
    }
}
