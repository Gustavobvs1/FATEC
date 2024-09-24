// Fac¸a a leitura de tres valores e apresente como resultado a soma dos quadrados dos ˆ
// tres valores lidos.

package listas;

import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        scanner.close();

        System.out.println((Math.pow(n1, n2)) + (Math.pow(n2, 2)) + (Math.pow(n3,2)));
    }
}
