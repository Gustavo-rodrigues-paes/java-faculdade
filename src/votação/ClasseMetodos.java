
package votação;
import java.io.*;	
import javax.swing.*;
import java.util.Random;

public class ClasseMetodos {
       public Votação[ ] FCADRASTRAVOTAÇÃO (Votação[ ] Votação  ) throws IOException {	
     int i;	
     String fileName = "ArquivoVotação.txt";	
     BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
     for (i = 0 ; i < 200 ; i++)	{
          Votação[i] = new Votação();
     }
 
     for (i = 0 ; i < 200 ; i++)  {	
           Votação[i].NumeroSeção = (int) (Math.random()*11+0);	
           writer.write(Integer.toString( Votação[i].NumeroSeção ));  	
           writer.newLine();	
           Votação[i].NumeroCandidato = (int) (Math.random()*301+0);		
           writer.write(Integer.toString(Votação[i].NumeroCandidato));   	
          writer.newLine();  } 
      System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    writer.close();
  return Votação;
  }	
 public void FCLASSIFICASEÇÃO(Votação[] Votação) {
     int i,k,aux;
     
     for(i=0;i<200;i++){
         for(k=1;k<199;k++){
         if (Votação[i].NumeroSeção > Votação[k].NumeroSeção){
            aux= Votação[i].NumeroSeção;
            Votação[i].NumeroSeção = Votação[k].NumeroSeção;
            Votação[k].NumeroSeção = aux;    
         }
     }
     }
         
 }
  public Votação[ ] FGRAVAVOTAÇÃO (Votação[ ] Votação  ) throws IOException {	
     int i;	
     String fileName = "ArquivoVotação.txt";	
     BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));	
     for (i = 0 ; i < 200 ; i++)	{
          Votação[i] = new Votação();
     }
 
     for (i = 0 ; i < 200 ; i++)  {	
           Votação[i].NumeroSeção = (int) (Math.random()*11+0);	
           writer.write(Integer.toString( Votação[i].NumeroSeção ));  	
           writer.newLine();	
           Votação[i].NumeroCandidato = (int) (Math.random()*301+0);		
           writer.write(Integer.toString(Votação[i].NumeroCandidato));   	
          writer.newLine();  } 
      System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    writer.close();
  return Votação;
  }	
 
 
 
  public void MostrarIndicadores(Votação[] Votação)throws IOException {
    	
     ClasseMetodos m = new ClasseMetodos(); 
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("-----------------------------------------------------------------------\n" +
"|	    Mostrar Indicadores			                  |\n" +
"|        Estatísticas de Votação em 2021		          |\n" +
"| 1 – Quantidade Eleitores por Seção	                          |\n" +
"| 2 – Seção com Maior e Menor número de Eleitores                 |\n" +
"| 3 – Quantidade de votos por candidato                          |\n" +
"| 4 – 10 primeiros colocadas (nro cand. e qtd votos)             |\n" +
"| 9 – Finaliza consulta	                		          |\n" +
"------------------------------------------------------------------------"));
      switch (opc)     {
            case 1: QuantidadeEleitoresporSeção(Votação);
                         break;
            case 2:SeçãocomMaioreMenornúmerodeEleitores (Votação);
                         break;
            case 3:Quantidadedevotosporcandidato(Votação);
                         break;
            case 4:osdezprimeiroscolocados(Votação);
                         break;   
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } 
    
public void QuantidadeEleitoresporSeção(Votação[] Votação) {
    int i,k;
    int vetor[]=new int [200];
    int vetor1[]=new int [10];
    
    for(i=0;i<200;i++){
        for(k=0;k<10;k++){
        if(Votação[i].NumeroSeção==k){
            vetor1[k]=vetor1[k]+1;
        }
        }
        
    }
    for(k=0;k<10;k++){
    System.out.println("a quantidade de eleitores na seção "+k+" é : "+vetor1[k]);
    }
    }
 public void SeçãocomMaioreMenornúmerodeEleitores(Votação[] Votação) {
     int i,maior,menor,k,m,x;
     int vetor[]=new int [200];
     int vetor1[]=new int [10];
     int vetor2[]=new int [10];
     maior=0;
     menor=0;
    m=0;
     for(i=0;i<200;i++){
         for(k=0;k<10;k++){
             vetor2[k]=k;
        if(Votação[i].NumeroSeção==k){
            vetor1[k]=vetor1[k]+1;
        }
        }
        maior=vetor1[0];
        menor=vetor1[0];
        for(k=1;k<10;k++){
         
            if(menor<vetor1[k]){
                menor=vetor1[k];
                m=vetor2[k];
                
            }
            else{
                if(maior>vetor1[k]){
                    maior=vetor1[k];
                }
            }
        }
       
     }
      
     
 }
  public void Quantidadedevotosporcandidato(Votação[] Votação) {
     int i,k;
     int vetor[]=new int [301];
     
    
      for(i=0;i<200;i++){
          vetor[Votação[i].NumeroCandidato] = (vetor[Votação[i].NumeroCandidato] +1);

}
      for(i=0;i<300;i++){
      System.out.println("a quantidade de votos no candidato "+ i+ " é : " +vetor[i]);
      }
      }
  public void osdezprimeiroscolocados(Votação[] Votação) {
       int i,k,m,aux;
     int vetor[]=new int [300];
     
    
      for(i=0;i<200;i++){
          vetor[Votação[i].NumeroCandidato] = (vetor[Votação[i].NumeroCandidato] +1);

}
      for(i=0;i<200;i++){
       for(k=1;k<199;k++){
         if(vetor[Votação[i].NumeroCandidato]>vetor[Votação[k].NumeroCandidato]){
             aux=vetor[Votação[i].NumeroCandidato];
             vetor[Votação[i].NumeroCandidato]=vetor[Votação[k].NumeroCandidato];
             vetor[Votação[k].NumeroCandidato]=aux;
         }
       
       }
      }
      for(m=0;m<10;m++){
           System.out.println("a quantidade de votos no candidato "+Votação[m].NumeroCandidato+" é : " +vetor[Votação[m].NumeroCandidato]);
      }
    
 }
 
 
}
