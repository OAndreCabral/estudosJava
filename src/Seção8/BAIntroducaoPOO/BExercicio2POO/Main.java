package Seção8.BAIntroducaoPOO.BExercicio2POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Funcionario joao = new Funcionario();
        System.out.println("Digite os dados");

        System.out.print("Name: ");
        joao.name = entrada.nextLine();

        System.out.print("Gross Salary: ");
        joao.grossSalary = entrada.nextDouble();

        System.out.print("Tax: ");
        joao.tax = entrada.nextDouble();

        System.out.println();

        System.out.println("Employee:" + joao);

        System.out.println("Which percentage to increase salary? ");
        double percentage = entrada.nextDouble();
        joao.increaseSalary(percentage);

        System.out.println("Updated data: " + joao);
    }
}
