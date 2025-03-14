/*
 *nome do programa: ExercLt1_16
 * nome do programador:Gustavo Rodrigues Paes
 *Objetivo:16.Receba a quantidade de horas trabalhadas, o valor por hora, 
o percentual de desconto e o número de descendentes. 
Calcule o salário que serão as horas trabalhadas x o valor por hora. 
Calcule o salário líquido (= Salário Bruto – desconto). 
A cada dependente será acrescido R$ 100 no Salário Líquido.
Exiba o salário a receber.
 * data de desenvolvimento:19/08/2024
*/
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_16 {
    public static void main (String args[]){
        double salario,horasdetrabalho,valorporhora,desconto,descendentes;
        horasdetrabalho=Double.parseDouble(JOptionPane.showInputDialog("digite quantidade de horas trabalhadas"));
        valorporhora=Double.parseDouble(JOptionPane.showInputDialog("digite o valor por hroa de trabalho"));
        descendentes=Double.parseDouble(JOptionPane.showInputDialog("digite quantos filhos tem"));
        desconto=Double.parseDouble(JOptionPane.showInputDialog("digitar quanto sera o desconto"));
        salario=(((horasdetrabalho*valorporhora)-desconto)+100*descendentes);
        JOptionPane.showMessageDialog(null,"salario liquido é"+salario);
        
    }
    
}
