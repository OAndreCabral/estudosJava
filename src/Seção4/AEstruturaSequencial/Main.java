package Seção4.AEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 10.35784;
        System.out.println("Hello world!");
        System.out.println("Bom dia!");
        System.out.println(x);
        System.out.println("----------------------------");
        System.out.printf("%.2f", x);
        System.out.println();
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultados = %.2f metros", x);
        System.out.println();

        Scanner entrada = new Scanner(System.in);

        int y;
        System.out.println("Digite um numero");
        y = entrada.nextInt();
        System.out.println("Voce digitou:" + y);

        double z;
        System.out.println("Digite um numero");
        z = entrada.nextDouble();
        System.out.printf("Você digitou: %.2f%n", z);

        char caracter;
        System.out.println("Digite caracter");
        caracter = entrada.next().charAt(0);
        System.out.println("Voce digitou:" + caracter);

        entrada.close();
    }
}