import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorialNumber = 1;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nDigite um número: ");
            int n = scanner.nextInt();

            scanner.close();

            for (int i = 1; i <= n; i++) {
                factorialNumber = Math.multiplyExact(factorialNumber, i);
            }
            System.out.println(factorialNumber);
        } catch (ArithmeticException e) {
            System.out.println("\nErro: Número muito grande! ");
            System.out.println("Número mais proximo disponivel: " + factorialNumber);
        } catch (InputMismatchException e) {
            System.out.println("\nErro: digite um número valido!");
        }
    }
}
