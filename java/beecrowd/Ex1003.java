import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();

        System.out.println("SOMA = " + (n1 + n2));
    }
}
