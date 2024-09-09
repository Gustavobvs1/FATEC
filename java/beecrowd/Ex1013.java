import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.close();

        int firstGreat = ((n1 + n2 + (Math.abs(n1 - n2)))/2);
        int greater = ((firstGreat + n3 + (Math.abs(firstGreat - n3)))/2);

        System.out.println(greater + " eh o maior");
    }
}
