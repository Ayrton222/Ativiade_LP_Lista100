/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Exercicio10 {
    
   
    public static void main(String[] args) {
    //Variável com atribuição
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        //Objeto
        ConverterBinario converter = new ConverterBinario();
         
        JOptionPane.showMessageDialog(null, "Binário: " + converter.binario(numero));
    }
}
    