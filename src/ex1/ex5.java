package ex1;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        float valor = scan.nextFloat();

        System.out.println("Desconto: ");
        int desconto = scan.nextInt();

        float total = valor * desconto / 100;
        float total2 = valor - total;

        System.out.printf("O valor do desconto e %.2f e o valor do produto com desconto e %.2f", total, total2);

    }

}
