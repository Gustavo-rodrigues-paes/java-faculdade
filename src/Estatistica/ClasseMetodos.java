
package Estatistica;


import java.io.*;	
import javax.swing.*;
public class ClasseMetodos {
    public Estatística[ ] FCADRASTRAESTATISTICA (Estatística[ ] Estatística  ) throws IOException {	
     int i;	
     String fileName = "ArquivoEstatistica.txt";	
     BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
     for (i = 0 ; i < 10 ; i++)	
          Estatística[i] = new Estatística();
	
     for (i = 0 ; i < 3 ; i++)  {	
           Estatística[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("digite codigo da cidade :"));	
           writer.write(Integer.toString( Estatística[i].CodigoCidade ));  	
           writer.newLine();	
           Estatística[i].NomeCidade = JOptionPane.showInputDialog("digite o nome da cidade:");	
           writer.write( Estatística[i].NomeCidade );  	
           writer.newLine();	
           Estatística[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("quantos acidentes ocorreu na cidade:"));	
           writer.write(Integer.toString(Estatística[i].QtdAcidentes));   	
          writer.newLine();  } 
      System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    writer.close();
  return Estatística;
  }	
 public void PQTDACIDENTES(Estatística[] Estatística) {
     int i;
     
     for(i=0;i<10;i++){
         if (Estatística[i].QtdAcidentes >100 &&  Estatística[i].QtdAcidentes<500){
         System.out.println(Estatística[i].CodigoCidade + " Nome: " + Estatística[i].NomeCidade + " Quantidade: " + Estatística[i].QtdAcidentes);
     
     }
     }
         
 }
 public void PMAIORMENOR(Estatística[]Estatística){
    
     int i,menor,maior;
     maior=0;
     menor=0;
     
     for(i=0;i<10;i++){
     if(i==0){
         menor=Estatística[i].QtdAcidentes;
        } 
     else{
         if(maior>Estatística[i].QtdAcidentes){
             maior=Estatística[i].QtdAcidentes;
         }
         else{
             if(menor>Estatística[i].QtdAcidentes){
                 menor=Estatística[i].QtdAcidentes;
             }
         }
     }
         System.out.println(menor);
         System.out.println(maior);
     }
     
 }
 public void PACIMA(Estatística[]Estatística){
         
     int i,media;
     media=0;
     for(i=0;i<10;i++){
         media=Estatística[i].QtdAcidentes+media;
         
     }
     media=media/10;
     for(i=0;i<10;i++){
         if(Estatística[i].QtdAcidentes>media){
             System.out.println(Estatística[i].CodigoCidade + " A cidade  " + Estatística[i].NomeCidade + " Quantidade: " + Estatística[i].QtdAcidentes);
         }
     }
     }
}
    

