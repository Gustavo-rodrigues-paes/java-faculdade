/*
 *nome do programa:ExercLt1_25 
 *nome do programador:Gustavo Rodrigues Paes
 *Objetivo:Receba a hora de início e de final de um jogo (HH,MM), 
calcular o tempo do jogo em horas e minutos, sabendo que 
o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro
 * data de desenvolvimento:
 */
package newpackage;
import javax.swing.JOptionPane;
public class ExercLt1_25 {
    public static void main(String args[]){
        double hora,minuto,horainicial,horafinal,minutoinicial,minutofinal;
        horainicial=Double.parseDouble(JOptionPane.showInputDialog("digitar hora inicial"));
        horafinal=Double.parseDouble(JOptionPane.showInputDialog("digitar hora final"));
        minutoinicial=Double.parseDouble(JOptionPane.showInputDialog("digitar minuto inicial"));
        minutofinal=Double.parseDouble(JOptionPane.showInputDialog("digitar minuto final")); 
        if(horainicial>horafinal){
            hora=((24-horainicial)+horafinal);
            if(minutoinicial>minutofinal){
                minuto=((60-minutoinicial)+minutofinal);
                hora=(hora-1);
                JOptionPane.showMessageDialog(null,hora+"horas"+ minuto+"minutos");
            }
            else{
                minuto=(minutofinal-minutoinicial);
                
                JOptionPane.showMessageDialog(null,hora+"horas"+ minuto+"minutos");
            }
        }
        else{
            hora=(horafinal-horainicial);
            if(minutoinicial>minutofinal){
                minuto=((60-minutoinicial)+minutofinal);
                hora=(hora-1);
                JOptionPane.showMessageDialog(null,hora+"horas"+ minuto+"minutos");
            }
            else{
                minuto=(minutofinal-minutoinicial);
                
                JOptionPane.showMessageDialog(null,hora+"horas"+ minuto+"minutos");
            }
           
        }
   
        
    }
    
}
