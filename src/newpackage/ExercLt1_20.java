/*
 *nome do programa: ExercLt1_21
 *nome do programador:Gustavo Rodrigues Paes
 *objetivo:20.Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmulaAX²+BX+C=0
. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 *data de desenvolvimento:
 */
package newpackage;
import javax.swing.JOptionPane;
public class ExercLt1_20 {
    public static void main (String args[]){
    double a,b,c,delta,raiz1,raiz2;
    a=Double.parseDouble(JOptionPane.showInputDialog("digite o coeficiente a"));
    b=Double.parseDouble(JOptionPane.showInputDialog("digite coeficiente de b"));
    c=Double.parseDouble(JOptionPane.showInputDialog("digite coeficiente de c"));
    delta=((b*b)-(4*a*c));
    if(delta>0){
        delta=Math.sqrt(delta);
        raiz1=(-b-delta)/(2*a);
        raiz2=(-b+delta)/(2*a);
        JOptionPane.showMessageDialog(null,"raiz1 igual a"+raiz1);
        JOptionPane.showMessageDialog(null,"raiz2 igual a"+raiz2);
         }
    else {
        if(delta==0)
    {
            raiz1=(-b/(2*a));
            JOptionPane.showMessageDialog(null,"raiz1"+raiz1);
        }
        else{
            JOptionPane.showMessageDialog(null,"não á raiz");
        }
        
    }
        
        
    }
    
    
}
