package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.PriceUpdate;

public class Consumer {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD", 70.00));
		list.add(new Product("Mouse", 50.00));

		list.forEach(new PriceUpdate());

		list.forEach(System.out::println);

		List<String> names = list.stream().map(Product::StaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
