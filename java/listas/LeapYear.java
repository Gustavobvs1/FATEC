package listas;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        scanner.close();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            System.out.println("Ano Bissexto");
        
        else System.out.println("Ano não Bissexto");
    }
}