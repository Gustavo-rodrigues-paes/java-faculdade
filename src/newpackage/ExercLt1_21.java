/*
 * nome do programa:ExercLt1_21
 * nome do programador:gustavo rodrigues paes
 * Objetivo:21.Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.Se a média for >= 6,0 exibir “APROVADO”;
b.Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.Se a média for < 3,0 exibir “RETIDO”.
 * data de desenvolvimento:
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_21 {
    public static void main(String args[])
    {
         double nota1,nota2,nota3,nota4,media;
         nota1=Double.parseDouble(JOptionPane.showInputDialog("digitar a nota do primeiro bimestre"));
         nota2=Double.parseDouble(JOptionPane.showInputDialog("digite a nota do segundo bimestre"));
         nota3=Double.parseDouble(JOptionPane.showInputDialog("digite a nota do terceiro bimestre"));
         nota4=Double.parseDouble(JOptionPane.showInputDialog("digite a nota do quarto bimestre"));
         media=((nota1+nota2+nota3+nota4)/4);
         
         if(media>=6){
             JOptionPane.showMessageDialog(null,"aprovado");
             
         }
         else{
             if(media>=3){
                 JOptionPane.showMessageDialog(null,"exame");
             }
             else{
                 JOptionPane.showMessageDialog(null,"retido");
                 
             }
             
         }
         
        
    }
    
}
