import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double triangle = (a * c) / 2;
        double circle = 3.14159 * (Math.pow(c, 2));
        double trapeze = (( a + b) * c) / 2;
        double square = Math.pow(b, 2);
        double rectangle = a * b;

        System.out.println("TRIANGULO: " + df.format(triangle));
        System.out.println("CIRCULO: " + df.format(circle));
        System.out.println("TRAPEZIO: " + df.format(trapeze));
        System.out.println("QUADRADO: " + df.format(square));
        System.out.println("RETANGULO: " + df.format(rectangle));
    }
}
