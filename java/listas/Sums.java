package listas;

import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        int n2 = (n1 * 3) + 1;

        int n3 = (n1 * 2) - 1;

        System.out.println(n2 + n3);
    }
}
