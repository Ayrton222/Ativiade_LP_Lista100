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
public class Exercicio69 {
    
    public static void main(String args[]){
        
        int [] valor = new int [15];
        int referencia;
        int conta=0, menores=0, iguais=0;
        
        for(int i =0; i <15; i++){
           valor[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o " + i + " valor? "));      
        }
        
        referencia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de referencia: "));
        
         for(int i=0; i<15; i++){
                if(valor[i]>referencia){
                     conta++;
                }else if(valor[i]<referencia){
                     menores++;
                }else{
                     iguais++;
                }
         }
            if(iguais>0){
               JOptionPane.showMessageDialog(null,"Existem " + iguais +" valores iguais ao da referencia");
            }else{
                JOptionPane.showMessageDialog(null,"Nao existem valores iguais ao da referencia");
            }
    }  
 }

