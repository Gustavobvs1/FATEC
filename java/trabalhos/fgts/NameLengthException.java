package Fgts;

class NameLengthException extends Exception {
    @Override
    public String getMessage() {
        return "Número de caracteres inválido! Digite novamente!";
    }
}
