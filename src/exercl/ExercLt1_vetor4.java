/*
 * nome do programa: ExercLt1_vetor4
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
             a. A média do grupo;
             b. A quantidade de notas acima do grupo;
             c. As posições dos valores abaixo da média do grupo.
 * data de desenvolvimento: 17/09/2024
 */
package vetores;
import javax.swing.JOptionPane;
public class ExercLt1_vetor4 {
     public static void main (String arg [ ]) {
      int opc = 0;
      double vetor[ ] = new double[30];
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

public static double[ ] CarregaVetor(double vt[ ])
	{
	  int cta;
                    for ( cta = 0 ; cta < 30 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }



  public static void CalcularVetor(double vt[ ])
	{
            int cta;
	  double abaixodamedia,acimadamedia,media;
          abaixodamedia=0;
          acimadamedia=0;
          media=0;
                  for ( cta = 0 ; cta < 30 ; cta++ ){
                      media=vt[cta]+media;  
	  }
                  media=media/(cta);
                  for(cta=0;cta<30;cta++){
                      if(vt[cta]>media){
                          acimadamedia=acimadamedia+1;
                      }
                      if(vt[cta]<media){
                          abaixodamedia=abaixodamedia+1;
                      }
                  }
            System.out.println ("a quantidade de pessoas abaixo da media é : "+abaixodamedia);
            System.out.println ("q quantidade de pessoas acima da media é : "+acimadamedia);
            System.out.println ("media dos valores do grupo é : "+media);
      }
    
    
}
