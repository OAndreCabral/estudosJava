package Seção8.BAIntroducaoPOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Enter Product Data");

        System.out.print("Name: ");
        produto.name = entrada.nextLine();

        System.out.print("Price: ");
        produto.price = entrada.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantity = entrada.nextInt();

        System.out.println();
        System.out.println(produto);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        produto.addProducts(quantity);

        System.out.println(produto);
        System.out.println();

        System.out.print("Enter te number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        produto.removeProducts(quantity);

        System.out.println(produto);

        System.out.println();
        System.out.println("Update data: " + produto);

    }
}
