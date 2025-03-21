/*
 * nome do programa: ExercLt1_vetor6
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo: Criar e coletar em um vetor [20] com números aleatórios.
             Classificar este vetor em ordem crescente e mostre os dados.
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;
public class ExercLt1_vetor6 {
     public static void main (String arg [ ]) {
      int opc = 0;
      int vetor[ ] = new int[20];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
      switch (opc)
         {
            case 1:
            	vetor = CarregaVetor(vetor);
                break;
            case 2:
               	vetor = ClassificaVetor(vetor);
                JOptionPane.showMessageDialog(null,"Vetor Classificado");
                break;
            case 3:
                MostraVetor(vetor);
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
                    for ( cta = 0 ; cta < 4 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }

public static int[ ] ClassificaVetor(int vt[ ])  {
	  int i,j, aux;
          for ( i = 0 ; i < 19 ; i++ ){
              for ( j = i+1 ; j < 20 ; j++ ){
	    if ((vt[i] > vt[j])) {
                          aux = vt[i];
                          vt[i] = vt[j];
                         vt[j] = aux; }
                     }   }
      return vt;   }

  public static void MostraVetor(int vt[ ])
	{
	  int cta;
                  for ( cta = 0 ; cta < 20 ; cta++ ){
	     System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	  }
            System.out.println ("******************************");
      }
    
}
