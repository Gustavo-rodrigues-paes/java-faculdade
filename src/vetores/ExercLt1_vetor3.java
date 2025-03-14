/*
 * nome do programa: ExercLt1_vetor3
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo:Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3].
             Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;

public class ExercLt1_vetor3 {
    static int vetor1[ ] = new int[3];
    static int vetor[ ] = new int[3];
    static int vetor2[]=new int[6];
  public static void main (String arg [ ]) {
      int opc = 0;
   
      
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega primeiro Vetor \n  2 - carregar segundo vetor \n 3 - Mostra Vetor \n 9 - Fim"));
      switch (opc)
         {
            case 1:
            	vetor = CarregaVetor1(vetor);
                break;
            case 2:
               	vetor1 = CarregaVetor2(vetor);
                
                break;
            case 3:
                ConcaternarMostrar(vetor,vetor1);
                
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"FIM");
                 System.exit(0);
                 break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }
   }
 }

public static int[ ] CarregaVetor1(int vetor[ ])
	{
	  int cta;
                    for ( cta = 0 ; cta < 3 ; cta++ ){
	       vetor[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro do primeiro vetor"));
               }
      return vetor;
  }

public static int[ ] CarregaVetor2(int vetor1[ ])  {
	  int m;
                    for ( m = 0 ; m < 3 ; m++ ){
	       vetor1[m] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro do segundo vetor"));
               }
      return vetor1;
}

  public static void ConcaternarMostrar(int vetor[ ],int vetor1[])
	{
	  int i,k,y;
                  for ( i = 0 ; i < 3 ; i++ ){
	     vetor2[i]=vetor[i];
	  }
                  for(k=3;k<6;k++){
                      vetor2[k]=vetor1[k];
                  }
                  for(y=0;y<6;y++){
                      System.out.println (vetor2[y]);
                  }
            
      }
    
}
