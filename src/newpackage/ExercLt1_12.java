/*
 *nome do programa:ExercLt1_12
 * nome do programador:Gustavo Rodrigues Paes
*Objetivo:12.Receba o ano de nascimento e o ano atual. 
Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_12 {
    public static void main (String args[]){
        double nascimento,anoatual,idade;
        nascimento=Double.parseDouble(JOptionPane.showInputDialog("digitar ano de nascimento"));
        anoatual=Double.parseDouble(JOptionPane.showInputDialog("digitar ano atual"));
        idade=((anoatual-nascimento)+17);
        JOptionPane.showMessageDialog(null,"a idade é"+idade);
        
        
    }
    
}
