/*
 *nome do programa: ExercLt1_29
 *nome do programador:gustavo rodrigues paes
 *Objetivo:29.Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_29 {
    public static void main (String args[]){
        double tp,vi,vt;
        tp=Double.parseDouble(JOptionPane.showInputDialog("digitar numero 1 ou 2"));
       
        vi=Double.parseDouble(JOptionPane.showInputDialog("digitar o valor inicial do deposito"));
        if(tp==1){
            vt=vi*1.03;
           JOptionPane.showMessageDialog(null,"valor total depois de 1 més rendendo na poupança é :"+vt);
        }
        else{
            if (tp==2){
                vt=vi*1.05;
                JOptionPane.showMessageDialog(null,"valor total depois de 1 mes rendendo na renda fixa é :"+vt);
                
            }
            else
                JOptionPane.showMessageDialog(null,"numero inserido invalido");
        }
    }
}
