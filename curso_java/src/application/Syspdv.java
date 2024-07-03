package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Syspdv {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite o nome do produto");
		String name = sc.nextLine();
		
		System.out.println("Digite o preço do produto");
		double preco = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, preco, quantity);
		

		System.out.println("Informaçoes do produto: " + product);

		System.out.println("Digite o numero de produtos a ser adcionado no estoque");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("Informaçoes do produto Atualizadas: " + product);

		System.out.println("Digite o numero de produtos a ser removidos do estoque");
		quantity = sc.nextInt();
		product.removeProdutos(quantity);

		System.out.println("Informaçoes do produto Atualizadas: " + product);

		sc.close();

	}

}
