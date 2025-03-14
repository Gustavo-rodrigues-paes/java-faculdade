/*
 * nome do programa:ExercLt1_30
 *nome do programador:gustavo rodrigues paes
 *Objetivo:30.Receba a data de nascimento e atual em ano, mês e dia.
Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 * data de desenvolvimento:29/08/2024
 */
package newpackage;

import javax.swing.JOptionPane;
public class ExercLt1_30 {
    public static void main(String args[]){
        int x,aa,an,ma,mn,da,dn,i,anos,meses,dias;
        aa=Integer.parseInt(JOptionPane.showInputDialog("digitar ano atual"));
        an=Integer.parseInt(JOptionPane.showInputDialog("digitar ano de nascimento"));
        ma=Integer.parseInt(JOptionPane.showInputDialog("digitar mes atual"));
        mn=Integer.parseInt(JOptionPane.showInputDialog("digitar mes de nascimento"));
        da=Integer.parseInt(JOptionPane.showInputDialog("digitar dia atual"));
        dn=Integer.parseInt(JOptionPane.showInputDialog("digitar dia de nascimento")) ;
        anos=an-aa;
        if(ma>mn){
            meses=ma-mn;
        }
        else{
            meses=12-(mn-ma);
        }
        if(da>dn){
            dias=da-dn;
        }
        else{
            dias=30-(dn-da);
        }
        if(dn%4==0){
            dias=dias+1;
        }
       dias=(dias+(anos/4));
       JOptionPane.showMessageDialog(null,"a idade é: "+anos+"/"+meses+"/"+dias);
       
       
        
        
        
        
        
    
    }
    
}
