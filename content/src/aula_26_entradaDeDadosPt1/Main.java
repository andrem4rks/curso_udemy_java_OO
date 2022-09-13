package aula_26_entradaDeDadosPt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Para String (sem espaços)
        //String x;
        //x = sc.next();

        //Para inteiro/double
        //int x;
        //x = sc.nextInt(); // no lugar de nextInt ficaria nextDouble()

        // Leitura de varios dados na mesma linha
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
