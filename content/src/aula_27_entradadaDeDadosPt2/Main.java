package aula_27_entradadaDeDadosPt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Leitura de todos os dados da linha
        //Trick para que o nextLine desejado nao consuma a quebra de linha
        //apos um valor ser digitado (int,double, etc)

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // Vai consumir a quebra de linha pendente, deixando o caminho livre
        s1 = sc.nextLine(); // <- para esse cara
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
