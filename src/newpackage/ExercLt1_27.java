/*
 * nome do programa:ExercLt1_27
 * nome do programador:gustavo rodrigues paes
 * Objetivo:Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h
 * data de desenvolvimento:21/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_27 {
    public static void main(String args[]){
        int h,v,e,m;
        double km;
        v=Integer.parseInt(JOptionPane.showInputDialog("quantidade de voltas"));
        e=Integer.parseInt(JOptionPane.showInputDialog("digitar a extensão em metros da pista"));
        m=Integer.parseInt(JOptionPane.showInputDialog("tempo de duração em minutos"));
        km=((v*e)/1000)/(m/60);
        JOptionPane.showMessageDialog(null,"a velocidade media em km/h é :" +km);
    }
    
}
