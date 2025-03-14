/*
 *nome do programa: ExercLt1__19
 *nome do programador:Gustavo Rodrigues Paes
 *Objetivo:Receba 2 valores reais. Calcule e mostre o maior deles.
 *data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_19 {
    public static void main (String args[]){
        Double n1, n2, result;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor real: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor real: "));
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é de "+n1);
        } else {
            JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é de "+n2);
        }
        
    }
    
}
