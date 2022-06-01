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
public class Exercicio93 {
      public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = 5; // ordem da matriz 
    int i, j;
    int m[][] = new int[n][n];

    for (i=0; i<n; i++) {
      System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("m[%d][%d] = ", i, j);
        m[i][j] = ler.nextInt();
      }
      System.out.printf("\n");
    }

// processamento: somando todos os elementos da diagonal principal e secundaria
    int smdp = 0, smds = 0;
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", m[i][j]);

        if (i == j) // diagonal principal
           smdp = smdp + m[i][j];
        if ((i + j) == (n - 1)) // diagonal secundaria
           smds = smds + m[i][j];
      }
      System.out.printf("\n");
    }
    System.out.printf("\nSoma da Diagonal Principal  = %d", smdp);
    System.out.printf("\nSoma da Diagonal Secundaria = %d\n", smds);
  }
}
    

