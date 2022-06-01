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
public class Exercicio09 {
    
     public static void main(String[] args) {
         //Volume da lata
        double raio,altura,volume;
        
       raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o Raio:  "));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura: "));
       volume = 3.14159 * raio * raio  * altura;
      
       JOptionPane.showMessageDialog(null,"Volume: " +volume);
     }
    
}
