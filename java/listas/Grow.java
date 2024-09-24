package listas;

import java.util.Scanner;

public class Grow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean verify = n % 2 == 0;

        while (!verify) {
             n = scanner.nextInt();
             verify = n % 2 == 0;
        }
        scanner.close();

        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
