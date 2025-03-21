/*
 *nome do programa : ExercLt1_37
 *nome do programador :gustavo rodrigues paes
 *Objetivo:37.Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * data de desenvolvimento:29/08/2024
 */
package javaapplication1;
import javax.swing.JOptionPane;


public class ExercLt1_37 {
    public static void main (String args[]){
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("digitar m numero da sequencia de fibonaci"));
        JOptionPane.showMessageDialog(null,serieFibonaci(n));
      
        }
    static String serieFibonaci(int n){
        String mostraSerie="";
        String aux="";
        int a,b,c,s;  
        a=0;
        b=1;
        c=0;
         
        for(s=0;s<=n;s++){
            c=b+a;
            a=b;
            b=c;
            System.out.println(c);
            aux=" "+c;
      mostraSerie +=aux;
    }
        return   mostraSerie;
    }
    
        
    }
    

