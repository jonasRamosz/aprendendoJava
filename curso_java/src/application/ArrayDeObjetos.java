package application;

import java.util.Locale;
import java.util.Scanner;

import entites.ArraysDeObjetos;

public class ArrayDeObjetos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos deseja guardar: ");
		
		int n = sc.nextInt();
		ArraysDeObjetos [] vect = new ArraysDeObjetos[n];
		
		for(int i = 0 ; i < vect.length ; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ArraysDeObjetos(name, price);
			
		}
		
		double soma = 0.0;
		for(int i = 0 ; i < vect.length ; i++) {
			soma += vect[i].getPrice();
		}
		System.out.printf("a SOMA é : %.2f%n", soma );
		System.out.printf("a Media é : %.2f", soma/n );
		sc.close();
	}

}
