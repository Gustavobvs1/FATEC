package Fgts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fgts {
    public static void main(String[] args) {
        boolean error = true;
        while (error) {
            try {
                error = false;
                calculateFgts();
            }

            catch (NameLengthException e) {
                System.out.println("Erro: " + e.getMessage());
                error = true;
            }

            catch (NumberOnNameException e) {
                System.out.println("Erro: " + e.getMessage());
                error = true;
            }

            catch (InputMismatchException e) {
                System.out.println("Erro: Informe um salário valido (ex: 2599,99)");
                error = true;
            }

            catch (MinSalaryException e) {
                System.out.println("Erro: " + e.getMessage());
                error = true;
            }
        }
    }

    public static void calculateFgts()
            throws NameLengthException, NumberOnNameException, InputMismatchException, MinSalaryException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInforme seu nome: ");
        String name = scanner.next();

        if (name.length() < 5 || name.length() > 55)
            throw new NameLengthException();

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                throw new NumberOnNameException();
            }
        }

        System.out.print("\nInforme seu salário: ");
        double salary = scanner.nextDouble();

        if (salary < 1518)
            throw new MinSalaryException();

        double fgtsValue = salary * 0.08;

        System.out.println("\nRecibo do pagamento");
        System.out.println("Nome: " + name);
        System.out.println("Salário: R$" + salary);
        System.out.println("FGTS: R$" + fgtsValue);
    }
}