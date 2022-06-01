/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Exercicio98 {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int linha = 4;
        int coluna = 3;
        int[][] matrizA = new int [linha][coluna];
        
        for(int i =0; i < linha; i++){
            for(int j =0; j < coluna; j++){
                System.out.print("Digite o valor da matrizA: ");
                matrizA[i][j] = entrada.nextInt();
            }        
        }
        
        int linha2 = 3;
        int coluna2 = 2;
        int[][] matrizB = new int [linha2][coluna2];
        
        for(int i =0; i < linha2; i ++){
            for(int j =0; j < coluna2; j++){
             System.out.print("Digite o valor da matrizB: ");   
             matrizB[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("");
        
          for(int i =0; i < linha; i++){
            for(int j =0; j < coluna; j++){
                System.out.print(matrizA[i][j] + " ");  
            }    
          System.out.println("");
        }
          for(int i =0; i < linha2; i++){
            for(int j =0; j < coluna2; j++){
                System.out.print(matrizB[i][j] + " ");  
            }    
          System.out.println("");
        }
          
          if(matrizA[0].length == matrizA.length){
              
              int[][] matrizC = new int[linha][coluna2];
              for(int i =0; i < linha; i++){
                  for(int j =0; i< coluna2; j++){
                      for(int k =0; i< linha2; k++){
                          matrizC[i][j] = matrizA[i][k] * matrizB[k][j];
                      }
                  }
              }
              
              for(int i =0; i < linha; i++){
            for(int j =0; j < coluna2; j++){
                System.out.print(matrizC[i][j] + " ");  
            }    
          System.out.println("");
        }
              
          }else{
              System.out.println("Nao e possivel realizar o calculo");
          }
          
        
    }
}

