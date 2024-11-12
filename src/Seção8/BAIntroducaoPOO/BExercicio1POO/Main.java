package Seção8.BAIntroducaoPOO.BExercicio1POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Digite os valores");

        System.out.print("Width: ");
        retangulo.width = entrada.nextDouble();

        System.out.print("Height: ");
        retangulo.height = entrada.nextDouble();

//        System.out.println("Area: " + retangulo.Area());
//        System.out.println("Perimeter: " + retangulo.Perimeter());
//        System.out.println("Diagonal: " + retangulo.Diagonal());

        System.out.println(retangulo);

    }
}
