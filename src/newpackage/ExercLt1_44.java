/*
 * nome do programa:ExercLt1_44
 * nome do programador:gustavo rodrigues paes
 * Objetivo:44.Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;
import javax.swing.JOptionPane;

public class ExercLt1_44 {
    public static void main (String args[]){
        double vp,b,ex,i;
        b=Double.parseDouble(JOptionPane.showInputDialog("escreva numero da base"));
        ex=Double.parseDouble(JOptionPane.showInputDialog("escreva o numero do expoente"));
        i=0;
        vp=1;
        if(ex==0){
            vp=1;
            System.out.println(vp);
        }
        if(ex==1){
            vp=b;
            System.out.println(vp);
        }
        if(ex>1){
            while(i<ex){
                vp=b*vp;
                i=i+1;
                System.out.println(vp);
            }
            
        }
        else{
            while(i>ex){
                vp=vp/b;
                i=i-1;
                System.out.println(vp);
            }
        }
    }
    
}
