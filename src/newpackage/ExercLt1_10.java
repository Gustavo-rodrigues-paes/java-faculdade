/*
 * nome do programador: gustavo rodrigues paes
 * nome do programa: ExercLt1_10
*data de desenvolvimento:19/08/2024
*Objetivo:Receba 2 números reais. Calcule e mostre a diferença desses valores.
 */
package newpackage;


    import javax.swing.JOptionPane;
public class ExercLt1_10 {
    public static void main (String args []){
        double n1, n2, result;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor inteiro: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor inteiro: "));
        if (n1 > n2){
            result = n1 - n2;
        } else {
            result = n2 - n1;
        }
        JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é de "+result);
    }
}
