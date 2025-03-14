
package recursiva;

import javax.swing.JOptionPane;
public class Frecursiva1 {
 public static void main (String args[]){
    
   int num;
        num=100;
        JOptionPane.showMessageDialog(null,Frecursivo1(num));
    }
    

     public static int Frecursivo1(int n)
     {
         int fat;
         if(n>1){
             fat=n+Frecursivo1(n-1);
             return fat;
         }
         else{
             return n;
         }

     }
}
