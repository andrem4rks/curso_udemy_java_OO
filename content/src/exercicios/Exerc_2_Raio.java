package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_2_Raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        System.out.printf("A=%.4f", (3.14159 * Math.pow(r, 2)));
    }
}
