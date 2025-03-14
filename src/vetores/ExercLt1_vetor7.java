/*
 * nome do programa: ExercLt1_vetor7
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e
             verificar a sua existência no vetor (utilizar pesquisa binária).
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;
public class ExercLt1_vetor7 { public static void main (String arg [ ]) {
      int opc = 0;
      int vetor[ ] = new int[20];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n2 - Classifica Vetor \n 3 - Mostra Vetor \n 4-Buscar Valor \n 9 - Fim"));
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
            case 4:
                BuscarValor(vetor);
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
                    for ( cta = 0 ; cta < 20 ; cta++ ){
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
  public static void BuscarValor(int vt[ ])
	{
	  int cta,n,meio,va,k;
          k=0;
          meio=10;
          va=meio/2;
          n=Integer.parseInt(JOptionPane.showInputDialog("digitar valor procurado"));
                  for ( cta = 0 ; cta < 20 ; cta++ ){
                      if(n>vt[meio]){
                          meio=meio+va;
                          va=va/2;
                      }
                      else{
                          if(n<vt[meio]){
                              meio=meio-va;
                              va=va/2;
                          }
                          else{
                              if(n==vt[meio]){
                                  System.out.println ("valor encontrado no indice : "+meio+" do vetor");
                              cta=20;
                              k=1;
                              }
                          }
                      }
	     
	  }
         if(k==0){
             System.out.println ("valor n encontrado");
         }   
      }
    
}
