package Seção10.DBListas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        System.out.println("ARRAY ORIGINAL");
        stringList.add("Maria");
        stringList.add("Alex");
        stringList.add("Bob");
        stringList.add("Anna");
        stringList.add("Pepo");
        stringList.add("André");
        for (String Nomes: stringList) {
            System.out.println("Nome:" + Nomes);
        }

        System.out.println();
        System.out.println("ADICIONAR UM ELEMENTO DENTRO DO ARRAY");
        stringList.add(2, "XesqueDele");
        for (String Nomes: stringList) {
            System.out.println("Nome Atualizado 01:" + Nomes);
        }

        System.out.println();
        System.out.println("REMOVER UM ELEMENTO DO ARRAY");
        stringList.remove(1);
        for (String Nomes: stringList) {
            System.out.println("Nome Atualizado 02:" + Nomes);
        }

        System.out.println();
        System.out.println("REMOVER UM ELEMENTO DO ARRAY COM CONDIÇÃO");
        stringList.removeIf(s -> s.contains("M"));
        for (String Nomes: stringList) {
            System.out.println("Nome Atualizado 03:" + Nomes);
        }

        System.out.println();
        System.out.println("FILTRAR ELEMENTO DO ARRAY COM A LETRA A");
        List<String> filtro = stringList.stream()
                .filter(inicialA -> inicialA.startsWith("A"))
                .toList();
        System.out.println(filtro);

        System.out.println();
        System.out.println("ENCONTRAR O PRIMEIRO ELEMENTO COM A LETRA A");
        String name = stringList.stream()
                .filter(inicialA -> inicialA.startsWith("Z"))
                .findFirst().orElse(null);
        System.out.println(name);
    }
}
