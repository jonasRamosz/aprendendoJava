package application;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos elementos deseja guardar");
		int elementsLength = sc.nextInt();
		
		double [] vect = new double[elementsLength];
		
		for(int i = 0 ; i < elementsLength ; i++ ) {
			System.out.printf("Digite um numero para ser guardado pela %dº vez: ", i+1);
			double value = sc.nextDouble();
			vect[i] = value;
		}
		double soma = 0.0;
		for(int i = 0 ; i < elementsLength ; i++ ) {
			soma += vect[i]; 
		}
		
		System.out.println("soma: " + soma);
		
		System.out.printf("media: %.2f", (soma/elementsLength));
		
		
		
		sc.close();

	}

}
