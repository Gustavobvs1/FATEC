package QuadraticEquation;

public class InvalidEquationException extends Exception {
    @Override
    public String getMessage() {
        return "Não é uma equação do segundo grau válida";
    }
}
