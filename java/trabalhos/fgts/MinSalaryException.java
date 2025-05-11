package Fgts;

class MinSalaryException extends Exception {
    @Override
    public String getMessage() {
        return "Salário abaixo do salário mínimo (R$ 1518,00)";
    }
}
