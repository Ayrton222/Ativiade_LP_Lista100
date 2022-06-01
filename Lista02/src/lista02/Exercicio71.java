/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Exercicio71 {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        
            int[] arr = new int[10];
            int key;
    
            System.out.println("Digite um numero: ");
            key = scan.nextInt();
            boolean val = contains(arr, key);
            System.out.println("Array contains "+key+"? \n"+val);
            
            
            for(int i=0; i < arr.length; i++){
			int numero = random.nextInt(100);
			arr[i] = numero;
		}
                System.out.println(" ");
            	System.out.print("Numeros existente: ");
		for(int numero : arr ){
			System.out.print(numero + " ");
		}
    }
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}

