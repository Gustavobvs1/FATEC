import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double perHour = scanner.nextDouble();
        scanner.close();

        System.out.println("NUMBER = " + number );
        System.out.println("SALARY = U$ " + df.format(hours * perHour));
    }
}
