
package ex1;

import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        
        System.out.println("Endereco: ");
        String endereco = scan.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = scan.nextLine();
        
        System.out.println("Area de Atuacao Profissional: ");
        String area = scan.nextLine();
        
        
        System.out.println("\nNome: "+nome+"\nEndereco: "+endereco+"\nTelefone: "+telefone+"\nArea de Atuacao Profissional: "+area);
                
    }
    
    
}
