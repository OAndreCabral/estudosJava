package Seção10.DBListas.EAMatrizExercicio;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner tecladoUsuario = new Scanner(System.in);

        int numero = tecladoUsuario.nextInt();
        Integer[][] matriz = new Integer[numero][numero];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = tecladoUsuario.nextInt();
            }
        }

        System.out.println("Principal diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("Numeros negativos: " + contador);
    }
}
