/*
 *nome do programa:ExercLt1_13
 * nome do programador:gustavo rodrigues paes
*Objetivo:13.Receba a quantidade de alimento em quilos.
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_13 {
    public static void main (String args[])
    {
        double dia,comida;
        comida=Double.parseDouble(JOptionPane.showInputDialog("digite quantos kilos de comida"));
        dia=((comida*1000)/50);
        JOptionPane.showMessageDialog(null,"a comida dura "+dia+"dias");
        
    }
}
