import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        int distance = scanner.nextInt();
        double liters = scanner.nextDouble();
        scanner.close();

        System.out.println(df.format(distance / liters) + " km/l");
    }
}
