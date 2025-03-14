/*
 * nome do programa: ExercLt01_matriz2
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo:Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a 
            diagonal principal terá seus dados carregados no programa segundo:
 * data de desenvolvimento: 17/09/2024
 */
package matrizes;

import javax.swing.JOptionPane;
public class ExercLt01_matrizes2 {
    static int M[ ][ ] = new int [4][4];
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
        int k;
        k=1;
	for ( x = 0 ; x < 4 ; x++ )   {
           
	     for ( y = 0 ; y < 4 ; y++)  {
                 if(y==x){
                     M[x][y]=k;
                     k=k*4;
                     
                 }
                 else{
                     M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
                 }
              
              
                      
 	 }
            
             
        }
       
             
    }
   static void MostraMat( ) {	
    	for ( x = 0 ; x < 4 ; x++ )  {
	         for ( y = 0 ; y < 4 ; y++)   {
	        	   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
                 }  
        }  
   }  
    
}
