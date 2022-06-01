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
public class Exercicio34 {
    
    public static void main(String args[]){
        
        float valor,salario;
        int anos;
        int meses;
        float prestacao;
        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do emprestimo solicitado: "));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário mensal : "));
        anos = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos para pagar: "));
        
        meses = anos * 12;
        prestacao = valor / meses;
           if (prestacao > salario * 0.3){
                JOptionPane.showMessageDialog(null,"Infelizmente você não pode obter o empréstimo");
           }else{
              JOptionPane.showMessageDialog(null,"Valor da prestação: R$ " + prestacao + " Empréstimo OK");
           }

    }
    
}
