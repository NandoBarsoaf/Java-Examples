package ex1;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pontos do Lider: ");
        int lider = scan.nextInt();

        System.out.println("Pontos do Lanterna: ");
        int lanterna = scan.nextInt();

        int pontos = (lider - lanterna) / 3;

        System.out.println("Quantidade de vitorias: " + pontos);

    }

}
