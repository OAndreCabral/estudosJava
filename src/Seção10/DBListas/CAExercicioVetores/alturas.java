package Seção10.DBListas.CAExercicioVetores;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tecladoUsuario = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int numeroPessoas = tecladoUsuario.nextInt();

        // Inicia os arrays com os tipos
        String[] vetorNomes = new String[numeroPessoas];
        int[] vetorIdades = new int[numeroPessoas];
        double[] vetorAltura = new double[numeroPessoas];

        // Insere os nomes, idades e alturas no array
        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            vetorNomes[i] = tecladoUsuario.next();
            System.out.print("Idade: ");
            vetorIdades[i] = tecladoUsuario.nextInt();
            System.out.print("Altura: ");
            vetorAltura[i] = tecladoUsuario.nextDouble();
        }

        // Calcular a media da altura
        double soma = 0.0;
        for (int i = 0; i < numeroPessoas; i++) {
            soma = soma + vetorAltura[i];
        }
        double mediaAlturas = soma / numeroPessoas;
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        // Calcular a porcentagem
        int contagem = 0;
        for (int i = 0; i < numeroPessoas; i++) {
            if (vetorIdades[i] < 16) {
                contagem = contagem + 1;
            }
        }
        double porcentagem = (contagem * 100.0) / numeroPessoas;
        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagem);

        // Printar os nome de quem é menor de 16
        for (int i = 0; i < numeroPessoas; i++) {
            if (vetorIdades[i] < 16) {
                System.out.println(vetorNomes[i]);
            }
        }
    }
}
