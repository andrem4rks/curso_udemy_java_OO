package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_5_Pecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codOfPart1, codOfPart2, numberOfParts1, numberOfParts2;
        double valueOfPart1, valueOfPart2;

        codOfPart1 = sc.nextInt();
        numberOfParts1 = sc.nextInt();
        valueOfPart1 = sc.nextDouble();

        codOfPart2 = sc.nextInt();
        numberOfParts2 = sc.nextInt();
        valueOfPart2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR = R$ %.2f", (numberOfParts1 * valueOfPart1) + (numberOfParts2 * valueOfPart2));

    }
}
