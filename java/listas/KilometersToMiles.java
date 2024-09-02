// Leia uma distancia em quil ˆ ometros e apresente-a convertida em milhas. A f ˆ ormula de ´
// conversao˜ e: ´ M =
// K
// 1,61 , sendo K a distancia em quil ˆ ometros e ˆ M em milhas.


package listas;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilo = scanner.nextDouble();

        System.out.println(kilo/1.61);
    }    
}
