/*
 * nome do programa:ExercLt1_28
 *nome do programador:gustavo rodrigues paes
 *Objetivo:Receba o preço atual e a média mensal de um produto.
Calcule e mostre o novo preço
 *data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_28 {
    public static void main (String args[]){
        double pa,mm,pn;
       mm=Double.parseDouble(JOptionPane.showInputDialog("digitar media mensal"));
       pa=Double.parseDouble(JOptionPane.showInputDialog("digitar preço atual"));
       if(mm<500){
           if(pa<30){
               pa=(pa*1.1);
               
           }
           else{
               pa=pa;
           }
       }
       else{
           if(mm<1000 ){
               if(pa<80){
                   pa=pa*1.15;
                   
               }
               else{
                   pa=pa;
               }
               
           }
           if(mm>=1000){
               if(pa>=80){
                   pa=pa*0.95;
                   
               }
               else{
                   pa=pa;
               }
           }
           
       }
           
           JOptionPane.showMessageDialog(null,"novo preço é :"+pa);
    }
   
}
