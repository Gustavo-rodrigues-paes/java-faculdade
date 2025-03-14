
package função;

import javax.swing.JOptionPane;
public class ExercLt1_35função {
    
    public static void main (String args[]){
        int i1,i2;
        i1=Integer.parseInt(JOptionPane.showInputDialog("digitar um numero inteiro"));
        i2=Integer.parseInt(JOptionPane.showInputDialog("digitar outro numero inteiro"));
    
        
            JOptionPane.showMessageDialog(null,"A quantidade de impares entre os numeros " +i1+" e "+i2+" é " +FunçãoImpar(i1,i2));
   }
    
        
    static int FunçãoImpar (int i1 , int i2) {
        int k,c;
        k=0;
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
        
        
          return c;
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
            return c;
        }
        
        
    
    }
}

    

