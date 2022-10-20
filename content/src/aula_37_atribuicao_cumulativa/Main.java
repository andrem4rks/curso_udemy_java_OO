package aula_37_atribuicao_cumulativa; 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100) {
            conta += (minutos - 100) * 2.0; // += operador cumulativo (+=,-=,*=,/=,%=)
        }
        
        System.out.printf("O valor da conta é = R$ %.2f%n", conta);
        
    }
}
