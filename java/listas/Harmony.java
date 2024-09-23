package java;

import java.util.Scanner;

public class Harmony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (1d/i);
        }
        System.out.println(sum);
    }
}
