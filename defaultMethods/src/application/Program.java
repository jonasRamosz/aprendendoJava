package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Mounths: ");
		int mounths = sc.nextInt();
		
		InterestService is = new BrazilInterestService(1.0);
		InterestService is2 = new UsaInterestService(2.0);
		
		double payment = is.payment(amount, mounths);
		
		System.out.println("Payment after " + mounths + " mounths:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
