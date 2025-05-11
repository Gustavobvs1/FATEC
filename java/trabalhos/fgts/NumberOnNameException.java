package Fgts;

class NumberOnNameException extends Exception {
    @Override
    public String getMessage() {
        return "O nome não pode conter números!";
    }
}
