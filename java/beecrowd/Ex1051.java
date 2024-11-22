import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double tax = 0.0;

        if (salary <= 2000.0) {
            System.out.println("Isento");
        } else if (salary <= 3000.0) {
            tax = (salary - 2000.0) * 0.08;
            System.out.printf("R$ %.2f%n", tax);
        } else if (salary <= 4500.0) {
            tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18);
            System.out.printf("R$ %.2f%n", tax);
        } else {
            tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28);
            System.out.printf("R$ %.2f%n", tax);
        }

        scanner.close();
    }
}
