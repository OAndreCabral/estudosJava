package Seção10.DBListas.CAExercicioVetores;

import java.util.Scanner;

public class numeroNegativos {
    public static void main(String[] args) {
        Scanner tecladoUsuario = new Scanner(System.in);

        System.out.println("Insira quantos numeros você irá digitar:");
        int numeroDigitado = tecladoUsuario.nextInt();

        int[] vet = new int[numeroDigitado];

        for (int i = 0; i < numeroDigitado; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = tecladoUsuario.nextInt();
        }

        System.out.println("Numero negativos");

        for (int i = 0; i < numeroDigitado; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
    }
}
