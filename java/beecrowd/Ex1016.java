import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        scanner.close();
        
        System.out.println((distance * 2) + " minutos");
    }
}
