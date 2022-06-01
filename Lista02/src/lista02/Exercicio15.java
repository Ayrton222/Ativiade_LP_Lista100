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
public class Exercicio15 {
    public static void main(String[] args) {
        
        float sombra_predio, sombra_usuario, altura_usuario, altura_predio, sr;
        
        sombra_predio = Float.parseFloat(JOptionPane.showInputDialog("Informe o tamanho da sombra do predio: "));
        sombra_usuario = Float.parseFloat(JOptionPane.showInputDialog("Informe o tamanho da sombra do usuario: "));
        altura_usuario = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura: "));
        
        sr = (sombra_predio / sombra_usuario);
        
        altura_predio = (sr * altura_usuario);
        
        JOptionPane.showMessageDialog(null,"A altura do predio: " + altura_predio + " metros");
        
    }
    
}
