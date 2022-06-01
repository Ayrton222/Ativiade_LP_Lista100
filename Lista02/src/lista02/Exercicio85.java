/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

/**
 *
 * @author Usuário
 */
public class Exercicio85 {
    
    int i = 16;
//String hexstr = Integer.toString(i, 16);


String hexstr = Integer.toHexString(i);

//ou (with leading zeroes and uppercase)


  public static void main(String args[]){
    int i = 16;
    System.out.print(Integer.toHexString( 0x10000 | i).substring(1).toUpperCase());
  }
}
