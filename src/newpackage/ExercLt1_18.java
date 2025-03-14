/*
 *nome do programa:ExercLt1_18
 *nome do programador:Gustavo Rodrigues Paes
 *Objetivo:18.Receba 2 valores inteiros. 
Calcule e mostre o resultado da diferença do maior pelo menos valor.
 *data do desenvolvimento:19/08/2024
 * 
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_18 {
    public static void main (String args[]){
        int n1, n2, result;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor inteiro: "));
        if (n1 > n2){
            result = n1 - n2;
        } else {
            result = n2 - n1;
        }
        JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é de "+result);
    }
    
}
