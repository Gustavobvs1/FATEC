import java.util.Scanner;
import java.util.InputMismatchException;

public class InstitutionalEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("\nDigite seu email institucional: ");
            String email = scanner.next();

            if (!email.endsWith("@fatec.sp.gov.br"))
                throw new InputMismatchException(
                        "É necessário ter @fatec.sp.gov.br");
            if (Character.isDigit(email.charAt(0)))
                throw new InputMismatchException("É necessário iniciar com letras");

            System.out.println("\nEmail valido! " + email);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Email institucional Invalido! " + e.getMessage());
        }
    }
}