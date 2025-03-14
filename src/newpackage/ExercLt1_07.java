/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Micro
 */
import javax.swing.JOptionPane;
public class ExercLt1_07 { public static void main(String args[])
    {
        double comprimento,largura,altura,area;
        comprimento=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO COMPRIMENTO"));
        largura=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA LARGURA"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA"));
        area=(comprimento*largura*altura);
        JOptionPane.showMessageDialog(null,"VALOR DA AREA É"+area);
        
    }
    
}
