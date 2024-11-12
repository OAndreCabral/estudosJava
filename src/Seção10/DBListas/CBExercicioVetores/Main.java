package Seção10.DBListas.CBExercicioVetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoUsuario = new Scanner(System.in);

        Aluguel[] array = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados?");
        int numeroDeQuartos = tecladoUsuario.nextInt();

        for (int i = 0; i < numeroDeQuartos; i++) {
            System.out.println();
            System.out.println("Quarto #" + (i + 1));

            System.out.print("Name: ");
            tecladoUsuario.nextLine();
            String name = tecladoUsuario.nextLine();

            //Opção 1 com email manual
            //System.out.print("Email:");
            //String email = tecladoUsuario.next();

            //Opção 2 com email criado automatico
            String email = name.replace(" ",".") + "@gmail.com";
            System.out.print("Email: " + email);
            System.out.println();

            System.out.print("Quarto:");
            int numeroQuarto = tecladoUsuario.nextInt();

//          Aluguel numeroAluguel = new Aluguel(name, email);
//          array[numeroQuarto] = numeroAluguel;

            array[numeroQuarto] = new Aluguel(name, email);
        }
        System.out.println();
        System.out.println("Quartos alugados:");
        for (int i = 0; i < 10; i++) {
            if(array[i] != null){
                System.out.println(i + ":" + array[i]);
            }
        }
    }
}
