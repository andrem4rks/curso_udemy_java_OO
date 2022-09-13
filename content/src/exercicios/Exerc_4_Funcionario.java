package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_4_Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id, numberOfHours;
        double valueOfHour;

        id = sc.nextInt();
        numberOfHours = sc.nextInt();
        valueOfHour = sc.nextDouble();

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f", (numberOfHours * valueOfHour));

    }
}
