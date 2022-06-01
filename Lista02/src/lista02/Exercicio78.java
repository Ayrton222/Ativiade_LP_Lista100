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
public class Exercicio78 {
    
    public static void main(String args[]){
      
        String texto = JOptionPane.showInputDialog("Digite algo: ");

        //contar o tamanho de caracteres que existe na string (conta o espaço)
        int stringTamanho = texto.length();

       JOptionPane.showMessageDialog(null,"Tamanho da String(texto): " + stringTamanho);

       //Contar o tamanho de caracteres que existe na string (nao conta os espaço)
        int stringTamanhosemEspaco = texto.replace(" ", "").length();
        JOptionPane.showMessageDialog(null,"Tamanho da String(texto) sem espaços: " + stringTamanhosemEspaco);
    }
    
}
