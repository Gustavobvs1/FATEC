import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0000");
        double pi = 3.14159;
        double raio = scanner.nextDouble();
        scanner.close();

        System.out.println("A=" + df.format(pi * (Math.pow(raio,2))));
    }
}