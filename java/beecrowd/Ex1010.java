import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int p1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        double d1 = scanner.nextDouble();

        int p2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        double d2 = scanner.nextDouble();

        scanner.close();

        String total = df.format((n1 * d1) + (n2 * d2));
        System.out.println("VALOR A PAGAR: R$ " + total);
    }
}
