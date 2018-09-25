package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//System.out.print("Quantity in stock?: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price); // Variável abstrata
		product.setName("Computer");
		System.out.println("Update name: " +product.getName()); 
		product.setPrice(1200.00);
		System.out.println("Update price: " +product.getPrice()); 
		
		System.out.println();
		System.out.print("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt(); // recebe o valor da quantidade
		product.addProducts(quantity);

		System.out.println();
		System.out.print("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt(); // remove determinado valor do produto
		product.removeProducts(quantity);

		System.out.println();
		System.out.print("Product data: " + product);

		sc.close();
	}

}
