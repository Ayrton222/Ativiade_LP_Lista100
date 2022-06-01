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
public class Exercicio60 {
    
    public static void main(String args[]){
        int maior = 0,  res = 0 , primo=0;

       for (int a=500; a<=1000; a++){
           
         if(a%2==0){  
             System.out.println(" ");
            System.out.println("Primos até " + a );
            
        for (int i=2; i<=a; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                               
        maior = a-i;
                          
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " + " + maior + " = " + a);
            }
            primo = 0;
        }

       
    }
}
 
    
}    

}     