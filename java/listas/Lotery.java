package listas;

import java.util.Scanner;

public class Lotery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do premio: ");
        double prize = scanner.nextDouble();

        System.out.println("Digite a primeira aposta: ");
        double g1 = scanner.nextDouble();

        System.out.println("Digite a segunda aposta: ");
        double g2 = scanner.nextDouble();

        System.out.println("Digite a terceira aposta: ");
        double g3 = scanner.nextDouble();

        scanner.close();

        double[] gamble = {g1,g2,g3};

        double total = g1 + g2 + g3;

        for (int i = 0; i < gamble.length; i++) {
            double percentage = gamble[i]/total;
            System.out.println("O " + (i + 1) + "º apostador recebeu: " + (prize * percentage));
        }
    }
}
