package listas;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentSalary = scanner.nextDouble();
        int serviceTime = scanner.nextInt();

        currentSalary *= salaryIncreasePercentage(currentSalary) + 1;

        currentSalary += bonusIncrease(serviceTime);

        System.out.println(currentSalary);

        scanner.close();
    }
    
    public static double salaryIncreasePercentage(double currentSalary) {
        double percentage = 0;
        if(currentSalary <= 500) percentage = 0.25;
        else if(currentSalary <= 1000) percentage =  0.2;
        else if(currentSalary <= 1500) percentage =  0.15;
        else if(currentSalary <= 2000) percentage =  0.1;
        return percentage;
    }

    public static double bonusIncrease(int serviceTime) {
        double bonus = 0;
        if(serviceTime > 10) bonus = 500;
        else if(serviceTime >= 7) bonus = 300;
        else if(serviceTime >= 4 ) bonus = 200;
        else if(serviceTime >= 1 ) bonus = 100;
        return bonus;
    }
}