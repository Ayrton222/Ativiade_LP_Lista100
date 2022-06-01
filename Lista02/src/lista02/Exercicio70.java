/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Random;

/**
 *
 * @author Usuário
 */
public class Exercicio70 {
    
    public static void main(String args[]){
       	Random random = new Random();
		
		int[] numerosAleatorios = new int [100];
		
		for(int i=0; i < numerosAleatorios.length; i++){
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Numeros Aleatorios: ");
		for(int numero : numerosAleatorios ){
			System.out.print(numero + " ");
		}
}
}
