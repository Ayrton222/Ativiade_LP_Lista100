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
public class Exercicio20 {
    
    public static void main(String[] args) {
        
        int prestacao1, prestacao2;
        
        int valorM, valorEntrada;
        
        valorM = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Mercadoria: "));
        
        prestacao1 = (valorM/3);
        
        prestacao2 = prestacao1;
        
        valorEntrada = valorM - (prestacao1 + prestacao2);
        
        JOptionPane.showMessageDialog(null,"Valor de entrada: " + valorEntrada + " \nValor d primeira prestação: " + prestacao1 + " \nValor da segunda prestação: " + prestacao2);
        
    }
    
}
