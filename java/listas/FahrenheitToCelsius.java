//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
// A formula de convers ´ ao˜ e: ´ C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
// e F a temperatura em Fahrenheit.


package listas;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t1 = scanner.nextDouble();

        System.out.println((t1 - 32) * 5/9);
    }
}