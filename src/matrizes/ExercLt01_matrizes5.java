/*
 * nome do programa: ExercLt01_matriz5
 * nome do programador: Gustavo Rodrigues Paes
 * objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
             Calcular e mostrar a soma das peças do tabuleiro
 * data de desenvolvimento: 17/09/2024
 */
package matrizes;

import javax.swing.JOptionPane;
public class ExercLt01_matrizes5 {
    
    static int M[ ][ ] = new int [8][8];
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
        
        
	for ( x = 0 ; x < 8 ; x++ )   {
           
	     for ( y = 0 ; y < 8 ; y++)  {
                 if(y==0 || y==7 || x==0 || x==7){
                     M[x][y]=1;
                     
                     
                 }
                 else{
                     if(y==1 || y==6 || x==1 || x==6){
                         M[x][y]=2;
                     }
                     else{
                         if(y==2 || y==5 || x==2 || x==5){
                             M[x][y]=3; 
                         }
                         else{
                             if(y==3 || y==4 || x==3 || x==4){
                                 M[x][y]=4;
                             }
                             
                         }
                     }
                     
                 }
              
              
                      
 	 }
            
             
        }
       
             
    }
   static void MostraMat( ) {	
    	for ( x = 0 ; x < 8 ; x++ )  {
	         for ( y = 0 ; y < 8 ; y++)   {
	        	   System.out.println("M[" +x+ "][" +y+ "] = "+M[x][y]);
                 }  
        }  
   }  
    
}
