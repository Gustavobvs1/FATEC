import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        double radius = scanner.nextDouble();
        double pi = 3.14159;
        scanner.close();

        String volume = df.format(pi * 4/3 * (Math.pow(radius, 3)));

        System.out.println("VOLUME = " + volume);
    }
}