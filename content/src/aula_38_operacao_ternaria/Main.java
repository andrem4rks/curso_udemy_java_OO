package aula_38_operacao_ternaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // (condicao) ? true : false
        

        System.out.println(desconto);
    }
}