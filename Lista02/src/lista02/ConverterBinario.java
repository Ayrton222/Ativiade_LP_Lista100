/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

/**
 *
 * @author Usuário
 */
public class ConverterBinario {
    public String binario (int decimal) {
         
        //Variáveis Auxiliares
        int numero = decimal;
        String binario= "";
        String binariocontrario = "";
         
        //Condição para conversão 
        while (numero != 0) {
            binario += "" + numero%2;
            numero = numero/2;
            System.out.println(numero);
        }
         
        //Como a leitura do binário de trás para frente apos divisão, aqui faz a inversão.
        for (int i = (binario.length()); i != 0; i--) {
            binariocontrario += "" + binario.charAt(i-1);
        }
        //Retorna binário ao contrário
        return binariocontrario;
    }
}
    

