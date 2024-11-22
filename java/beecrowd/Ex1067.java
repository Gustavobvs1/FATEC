import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();


        for(int i = 1; i <= number; i++) {
            if(i % 2 == 1) System.out.println(i);
        }
    }
}
