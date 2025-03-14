/*
 * nome do programa:ExercLt1_17
 * nome do programador:Gustavo Rodrigues Paes
 *Objetivo:17.Calcule a quantidade de litros gastos em uma viagem,sabendo que 
o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 *data de desenvolvimento:19/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_17 {
    public static void main (String args[]){
        double gasolina,velocidademedia,tempodepercurso;
        velocidademedia=Double.parseDouble(JOptionPane.showInputDialog("digitar velocidade media"));
        tempodepercurso=Double.parseDouble(JOptionPane.showInputDialog("digitar tempo de percurso"));
        gasolina=((velocidademedia*tempodepercurso)/12);
        JOptionPane.showMessageDialog(null,"a quantidade de gasolina em  litros usado é "+gasolina);
        
        
        
    }
    
}
