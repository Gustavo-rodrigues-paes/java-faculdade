/*
 * nome do programa: ExercLt1_vetor1
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo:Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *  a. A média dos valores entre 10 e 200;
 *  b. A soma dos números ímpares
 * data de desenvolvimento: 17/09/2024
 */
package vetores;

import javax.swing.JOptionPane;
public class ExercLt1_vetor1 {
    public static void main (String arg [ ]) {
      int opc = 0;
      int vetor[ ] = new int[50];
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
                    for ( cta = 0 ; cta < 50 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }



  public static void CalcularVetor(int vt[ ])
	{
	  int cta,m,k,i;
          m=0;
          k=0;
          i=0;
                  for ( cta = 0 ; cta < 50 ; cta++ ){
	     if(vt[cta]>10 && vt[cta]<200){
              m=m+vt[cta];
              k=k+1;
             }
             if(vt[cta]%2!=0){
                 i=i+vt[cta];
             }
	  }
                  m=m/k;
            System.out.println ("a soma dos impares é : "+i);
            System.out.println("a media  é : "+m);
      }
}