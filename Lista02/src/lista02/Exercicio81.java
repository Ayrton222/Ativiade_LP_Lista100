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
public class Exercicio81 {
    
    public static void main (String args[]){
        
        
         String str = JOptionPane.showInputDialog("Digite algo: ");
		String result = str.replaceAll("\\s+","");
		JOptionPane.showMessageDialog(null,"O resultado escrito em espaço é: " + result);
    }
    
}
