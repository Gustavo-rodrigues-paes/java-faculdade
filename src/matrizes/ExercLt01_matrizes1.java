/*
 * nome do programa: ExercLt01_matriz1
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo:Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos 
            vendidos em 4 semanas. Calcular e exibir:
            a. A quantidade de cada produto vendido no mês;
            b. A quantidade de produtos vendidos por semana;
            c. O total de produtos vendidos no mês.
 * data de desenvolvimento: 17/09/2024
 */
package matrizes;

import javax.swing.JOptionPane;
public class ExercLt01_matrizes1 {
   
 	static int M[ ][ ] = new int [3][4];
	static int x,y;
   public static void main(String args [ ])    {
       int vetor[]=new int [4];
       int vetor1[]=new int[5];
       
      
        CarregaMat(vetor,vetor1);
        MostraMat();
        
        System.exit(0);
        System.out.println(vetor[y]);
     }
     
    static void CarregaMat(int vt[],int vt1[]){
        int total;
        total=0;
	for ( x = 0 ; x < 3 ; x++ )   {
           
	     for ( y = 0 ; y < 4 ; y++)  {
                     M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
              vt[x]=vt[x]+M[x][y];
              total=total+M[x][y];
              vt1[y]=vt1[y]+M[x][y];
              System.out.println("a quantidade de produtos que vendeu na semana "+y+"é : "+vt1[y]);
              
                      
 	 }
             System.out.println("o produto "+x+" vendeu " +vt[x]+ " no mes");
             
        }
        System.out.println("a quantidade total de vendas no més é : "+total);
             
    }
   static void MostraMat( ) {	
    	for ( x = 0 ; x < 3 ; x++ )  {
	         for ( y = 0 ; y < 4 ; y++)   {
	        	   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
                 }  
        }  
   }  
}
    
