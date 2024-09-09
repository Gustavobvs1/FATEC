import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        scanner.close();    

        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));

        System.out.println(df.format(distance));
    }
}
