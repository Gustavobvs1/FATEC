package listas;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cathet1 = scanner.nextDouble();
        double cathet2 = scanner.nextDouble();

        double equation = Math.sqrt((Math.pow(cathet1, 2) + Math.pow(cathet2, 2)));

        System.out.println(equation);
    }
}
