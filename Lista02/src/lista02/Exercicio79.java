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
public class Exercicio79 {
    
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        String nomeCompleto;
        
        System.out.println("Digite seu nome completo:");
        nomeCompleto = entrada.nextLine();

        int espaco = nomeCompleto.indexOf(" ");
        System.out.printf("Primeiro nome extraído: \"%s\"%n",nomeCompleto.substring(0,espaco));
        entrada.close();
    }
}
