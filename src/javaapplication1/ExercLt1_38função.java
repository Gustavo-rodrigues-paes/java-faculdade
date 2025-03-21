/*
 *nome do programa: ExercLt1_38
 *nome do programador:gustavo rodrigues paes
 *Objetivo:38.Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * data de desenvolvimento:29/08/2024
 */
package função;
import javax.swing.JOptionPane;
public class ExercLt1_38função {
    static double ma;
    static double me;
    
    
    public static void main (String args[]){
        me=0;
        ma=0;
        double x;
        int i;
        x=0;
        for(i=0;i<5;i++)
        {
       x=Double.parseDouble(JOptionPane.showInputDialog("digitar um valor inteiro"));
        
        
       FunçãoMa(x);
       FunçãoMe(x);
        }
        
    System.out.println(FunçãoMa(x));
     System.out.println(FunçãoMe(x));
    
    }
    

static double FunçãoMa(double x)
{
 
 
        if(x>ma){
        ma=x;
        }
      
       return ma;
}
static double FunçãoMe(double x){
    if(x<me){
        me=x;
    }
    return me;
}
       
}

