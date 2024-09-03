import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        scanner.close();

        int equation = n1 * n2 - n3 * n4;

        System.out.println("DIFERENCA = " + equation);
    }
}
