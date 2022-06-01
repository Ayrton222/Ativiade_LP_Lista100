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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Perimetro de triangulo
        
        int lado1,lado2,lado3;
        int perimetro;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro lado do triangulo:  "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo lado do triangulo:  "));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro lado do triangulo:  "));
        
        perimetro = lado1 + lado2 + lado3;
        
        JOptionPane.showMessageDialog(null,"O Perimetro do triangulo é : " +perimetro);
    }
    
}
