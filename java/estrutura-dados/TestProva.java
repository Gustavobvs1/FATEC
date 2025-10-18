public class TestProva {
    static void invertNumber(int n) {
        if (n / 10 != 0) {
            System.out.print(n % 10);
            invertNumber(n / 10);
        } else
            System.out.print(n);
    }

    public static void main(String[] args) {
        invertNumber(123);
    }
}
