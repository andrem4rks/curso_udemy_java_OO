package aula_35_estruturas_condicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if ( hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        double n = 53.23456700;

        System.out.printf("measue %.8f \n", n);
        System.out.printf("rounded %.2f \n", n);
    }
}
