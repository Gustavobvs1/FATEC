package CpfPackage;

public class InvalidCpfException extends Exception {

  @Override
  public String getMessage() {
    return "CPF Invalido!";
  }

}