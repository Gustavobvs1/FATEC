package CpfPackage;

import java.util.Scanner;

public class Cpf {
  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.print("\nDigite seu CPF: ");
      String cpf = scanner.next();

      System.out.print("\nDigite seu estado: ");
      String state = scanner.next();

      if (!validateCPF(cpf, state))
        throw new InvalidCpfException();
      System.out.println("CPF Valido");

    } catch (InvalidCpfException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  public static boolean validateCPF(String cpf, String state) {
    cpf = cpf.replaceAll("[^0-9]", "");

    if (cpf.length() != 11) {
      return false;
    }

    int count = 0;
    char firstChar = cpf.charAt(0);
    for (int i = 1; i < cpf.length(); i++) {
      if (cpf.charAt(i) == firstChar)
        count++;
    }
    if (count == 10)
      return false;

    int sum = 0;
    for (int i = 0; i < 9; i++) {
      sum += (cpf.charAt(i) - '0') * (10 - i);
    }
    int rest = sum % 11;
    int firstDigit = (rest < 2) ? 0 : 11 - rest;

    if ((cpf.charAt(9) - '0') != firstDigit) {
      return false;
    }

    sum = 0;
    for (int i = 0; i < 10; i++) {
      sum += (cpf.charAt(i) - '0') * (11 - i);
    }
    rest = sum % 11;
    int secondDigit = (rest < 2) ? 0 : 11 - rest;

    if ((cpf.charAt(10) - '0') != secondDigit) {
      return false;
    }

    int stateDigit = getStateDigit(state.toUpperCase());

    return Integer.parseInt(cpf.substring(8, 9)) == stateDigit;
  }

  private static int getStateDigit(String state) {
    switch (state) {
      case "DF":
      case "GO":
      case "MT":
      case "MS":
      case "TO":
        return 1;
      case "AC":
      case "AM":
      case "AP":
      case "PA":
      case "RO":
      case "RR":
        return 2;
      case "CE":
      case "MA":
      case "PI":
        return 3;
      case "AL":
      case "PB":
      case "PE":
      case "RN":
        return 4;
      case "BA":
      case "SE":
        return 5;
      case "MG":
        return 6;
      case "ES":
      case "RJ":
        return 7;
      case "SP":
        return 8;
      case "PR":
      case "SC":
        return 9;
      case "RS":
        return 0;
      default:
        return -1;
    }
  }
}