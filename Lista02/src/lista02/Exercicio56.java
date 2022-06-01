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
public class Exercicio56 {
    
        // Returns true if n is perfect
    static boolean isPerfect(int n)
    {
        // 1 nao e um numero perfeito
        if (n == 1)
            return false;
  
        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;
  
        // Looping "navega" pelo os numeros  para checar  se eles sao
        // divisores ou nao
        for (int i = 2; i < n; i++) {
            
            if (n % i == 0) {
                sum += i;
            }
            
        }
  
        // se sum do divisor é igual ao
        // n, entao n é um numero perfeito
        if (sum == n)
            return true;
  
        return false;
    }
  
    // carrega o programa
    public static void main(String[] args)
    {
        int n;
        
       n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
        
        // chama a função isperfect para
        // verificar se o numero é perfeito ou nao
        if (isPerfect(n))
            JOptionPane.showMessageDialog(null,n + " é um numero perfeito");
        else
            JOptionPane.showMessageDialog(null,n + " Não é um numero perfeito");
    }
    
}
