package application;

import java.util.Scanner;

import services.PrinterService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrinterService<Integer> ps = new PrinterService<>();
		System.out.println("How many values");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i + 1) + "° valor");
			int value = sc.nextInt();
			ps.addValue(value);
		}

		// ps.print();
		System.out.println("First: " + ps.first());

		sc.close();

	}
}
