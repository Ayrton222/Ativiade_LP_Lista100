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
public class Exercicio07 {
     public static void main(String[] args) {
     //mes,dia,ano
        
        int dias,mes,anos;
        int idade;
        int idadeSemana;
        int anoAtual;
        int idadeAnos;
        
       idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:  "));
        
       anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
       
       idadeAnos = anoAtual - idade;
       
       mes = idadeAnos * 12;
       dias =(idadeAnos * 365);
       idadeSemana = (idadeAnos * 48);
       
        JOptionPane.showMessageDialog(null,"Quantos anos você viveu : " +idadeAnos);
        JOptionPane.showMessageDialog(null,"Quantos dias você viveu : " +dias);
    JOptionPane.showMessageDialog(null,"Quantos meses você viveu : " +mes);
    
}
}
