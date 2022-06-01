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
public class Exercicio22 {
    static int modulo;
    public static void main(String[] args) {
        int x ;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        
        if( x < 0){
            modulo = modulo % x * (-1);
        }else{
            modulo = modulo % x; 
    }  
        
        JOptionPane.showMessageDialog(null,"O modulo de " + x + " é: " + modulo);
}
}
