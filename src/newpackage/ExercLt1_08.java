/* 
   Nome do programa          : ExercLt1_08
   Objetivo:8.	Receba o valor de um depósito em poupança. Calcule e mostre 
o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
   Nome do Programador      : gustavo rodrigues paes
   Data de desenvolvimento : 15/08/2024
*/
package newpackage;


import javax.swing.JOptionPane;
public class ExercLt1_08 {
    public static void main(String args[])
    { 
        Double deposito,valortotal;
        deposito=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO DEPOSITO"));
        valortotal=(deposito*1.03);
        JOptionPane.showMessageDialog(null,"valor total"+valortotal);
        
        
    }
    
}
