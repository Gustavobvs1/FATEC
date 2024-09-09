import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        String name = scanner.nextLine();
        double fixedSalary = scanner.nextDouble();
        double sales = scanner.nextDouble();
        scanner.close();

        String total = df.format(fixedSalary + (sales * 0.15));
        
        System.out.println("TOTAL = R$ " + total);
    }
}
