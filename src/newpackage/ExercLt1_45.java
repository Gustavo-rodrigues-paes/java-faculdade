/*
 * nome do programa:ExercLt1_45
 * nome do programador:gustavo rodrigues paes
 * Objetivo:45.Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_45 {
    public static void main (String args[]){
        int a,i;
        a=1;
        while(a<=15){
            
            i=a*a;
            if(a%2==0){
                System.out.println("-"+a+"/"+i);
            }
            else{
                System.out.println(a+"/"+i);
            }
            a=a+1;
        }
        
    }
    
}
