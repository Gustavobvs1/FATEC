package listas;

import java.util.Scanner;

public class RetirementCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        int serviceTime = scanner.nextInt();

        scanner.close();

        if(age >= 65 || serviceTime >= 30 || age >= 60 && serviceTime >= 25) 
            System.out.println("Pode aposentar");

        else System.out.println("Não pode aposentar");
    }
}