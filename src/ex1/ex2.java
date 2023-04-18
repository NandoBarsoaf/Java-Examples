
package ex1;

import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.print("Informe um numero inteiro: ");
        num1 = scan.nextInt();
        
        System.out.print("Informe um segundo numero inteiro: ");
        num2 = scan.nextInt();
        
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        
        
        System.out.println("\nSoma: "+soma+"\nSubtracao: "+sub+"\nMultiplicacao: "+mult+"\nDivisao: "+div);
        
                
        
        
        
        
        
                
                
        
    }
}
