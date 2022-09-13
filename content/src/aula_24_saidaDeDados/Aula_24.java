package aula_24_saidaDeDados;

import java.util.Locale;

public class Aula_24 {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 35;
        double renda = 4000.0;

        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha %.2f reais %n", nome, idade, renda);

    }
 }
