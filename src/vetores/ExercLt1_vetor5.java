/*
 * nome do programa: ExercLt1_vetor5
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo:Criar e coletar em um vetor [20] inteiro.
            Calcule e exiba, segundo:∑ (A[1] – A[21–1])
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;
public class ExercLt1_vetor5 {
       public static void main (String arg [ ]) {
      int opc = 0;
      int vetor[ ] = new int[20];
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
                    for ( cta = 0 ; cta < 20 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }



  public static void CalcularVetor(int vt[ ])
	{
	  int cta,sub,k;
          sub=0;
          k=19;
                  for ( cta = 0 ; cta < 10 ; cta++ ){
               sub=vt[cta]-vt[k];
               k=k-1;
               System.out.println ("a subtração dos dois extremos do vetor  é : "+sub);
                       
	  }
                
            
      }
    
    
    
}
