package listas;

import java.util.Scanner;

public class StateTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        String state = scanner.next();

        scanner.close();

        switch (state) {
            case "MG":
                System.out.println(value * 1.07);
                break;

            case "SP":
                System.out.println(value * 1.12);
                break;

            case "RJ":
                System.out.println(value * 1.15);
                break;

            case "MS":
                System.out.println(value * 1.08);
                break;

            default:
                System.out.println("Erro");
                break;
        }
    }
     
}