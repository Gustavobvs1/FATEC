
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CondominiumRegister {
    public static void main(String[] args) {
        boolean error = true;
        while (error) {
            try {
                error = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n--------------CADASTRO--------------");

                System.out.print("\nDigite seu nome: ");
                String name = scanner.next();
                if (name.length() < 4 || name.length() > 55 || Character.isDigit(name.charAt(0)))
                    throw new InputMismatchException("Nome invalido");

                System.out.print("\nDigite seu email: ");
                String email = scanner.next();
                if (!email.contains("@") || !email.contains(".com") || Character.isDigit(email.charAt(0)))
                    throw new InputMismatchException("Email invalido!");

                System.out.print("\nDigite sua data de nascimento: ");
                String birthDate = scanner.next();
                if (!validateBirthDate(birthDate))
                    throw new InputMismatchException("Menor de 18 anos!");

                System.out.print("\nDigite seu telefone: ");
                String phoneNumber = scanner.next();

                if (!validatePhone(phoneNumber))
                    throw new InputMismatchException("Número de telefone invalido!");

                System.out.print("\nDigite a marca do carro: ");
                String carBrand = scanner.next();

                System.out.print("\nDigite o modelo do carro: ");
                String carModel = scanner.next();

                System.out.print("\nDigite se o modelo da placa é tradicional ou da mercosul: ");
                String signModel = scanner.next();

                System.out.print("\nDigite a placa do carro: ");
                String carSign = scanner.next();

                switch (signModel.toLowerCase()) {
                    case "mercosul":
                        if (!validateMercosulSign(carSign))
                            throw new InputMismatchException("Placa Mercosul Invalida!");
                        break;

                    case "tradicional":
                        if (!validateTraditionalSign(carSign))
                            throw new InputMismatchException("Placa Tradicional Invalida!");
                        break;
                    default:
                        throw new InputMismatchException("Modelo de placa invalido!");
                }

                System.out.println("\n\nInformações finais: ");
                System.out.println("Nome: " + name);
                System.out.println("Email: " + email);
                System.out.println("Data de nascimento: " + birthDate);
                System.out.println("Telefone: " + phoneNumber);
                System.out.println("Marca do carro: " + carBrand);
                System.out.println("Modelo do carro: " + carModel);
                System.out.println("Placa do carro: " + carSign);

            } catch (InputMismatchException e) {
                System.out.println("\nErro: " + e.getMessage());
                error = true;
            } catch (DateTimeParseException e) {
                System.out.println("\nErro: Data invalida!");
                error = true;
            }
        }
    }

    public static boolean validateBirthDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birthDate = LocalDate.parse(date, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        return period.getYears() >= 18;
    }

    public static boolean validatePhone(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        if (phoneNumber.length() != 11 && phoneNumber.length() != 13) {
            return false;
        }

        if (phoneNumber.length() == 13 && !phoneNumber.startsWith("55")) {
            return false;
        }

        String baseNumber = phoneNumber.length() == 13 ? phoneNumber.substring(2) : phoneNumber;

        return baseNumber.matches("^\\d{2}9\\d{8}$");
    }

    public static boolean validateTraditionalSign(String traditionalSign) {

        return traditionalSign.trim().toUpperCase().matches("^[A-Z]{3}-?\\d{4}$");
    }

    public static boolean validateMercosulSign(String mercosulSign) {
        return mercosulSign.replaceAll("[^a-zA-Z0-9]", "").toUpperCase().matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    }
}
