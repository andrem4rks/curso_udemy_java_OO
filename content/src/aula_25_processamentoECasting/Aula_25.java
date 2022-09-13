package aula_25_processamentoECasting;

public class Aula_25 {
    public static void main(String[] args) {
        //area de um trapezio
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h; //resultado esperado = 35

        System.out.println("Area = " + area);

        // exemplo de casting

        int a, x;
        double resultado;

        a = 5;
        x = 2;

        resultado = (double) a / x; // exemplo 1 de casting

        a = (int) resultado; // exemplo 2 de casting

        System.out.println(resultado);
    }
}
