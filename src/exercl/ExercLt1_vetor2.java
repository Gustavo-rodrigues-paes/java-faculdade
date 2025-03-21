/*
 * nome do programa: ExercLt1_vetor2
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo: Criar e coletar um vetor [100] inteiro e exibir:
              a. O maior e o menor valor;
              b. A média dos valores.
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;
public class ExercLt1_vetor2 {
 public static void main (String arg [ ]) {
      int opc = 0;
      int vetor[ ] = new int[100];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 calcular e mostrar  \n 9 - Fim"));
      switch (opc)
         {
            case 1:
            	vetor = CarregaVetor(vetor);
                break;
            
            case 2:
                CalcularVetor(vetor);
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"FIM");
                 System.exit(0);
                 break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }
   }
 }

public static int[ ] CarregaVetor(int vt[ ])
	{
	  int cta;
                    for ( cta = 0 ; cta < 100 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }



  public static void CalcularVetor(int vt[ ])
	{
	  int cta,menor,maior,media;
          menor=0;
          maior=0;
          media=0;
                  for ( cta = 0 ; cta < 100 ; cta++ ){
                      media=vt[cta]+media;
                      
                      
                      if(cta==0){
                          maior=vt[cta];
                          menor=vt[cta];  
                  }
                      if(vt[cta]>maior){
                          maior=vt[cta];
                          
                      }
                      if(vt[cta]<menor){
                          menor=vt[cta];
                          
                      }
	     
	  }
                  media=media/(cta);
            System.out.println ("menor numero é : "+menor);
            System.out.println ("maior numero é : "+maior);
            System.out.println ("media dos valores é : "+media);
      }
    
}
