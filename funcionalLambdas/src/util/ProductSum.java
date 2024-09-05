package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductSum {
	public double filteredSum(List<Product> list, Predicate<Product> condicao) {
		double sum = 0.0;
		for(Product item : list) {
			if(condicao.test(item)) {
				sum += item.getPrice();
			}
		}
		return sum;
	}
}
