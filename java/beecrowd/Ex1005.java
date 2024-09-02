import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00000");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String media = df.format(((num1 * 3.5) + (num2 * 7.5))/11);

        System.out.println("MEDIA = " + media);
    }
}
