
package ex1;

import java.util.Scanner;


public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Quantos cavalos voce tem: ");
        int cavalo = scan.nextInt();
        
        int ferraduras = cavalo * 4;


        System.out.printf("Quantidade de ferraduras: "+ferraduras);       
        
        
  }
    
}
