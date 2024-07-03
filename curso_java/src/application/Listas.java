package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("jonas");
		list.add("Hadassa");
		list.add("Ivani");
		list.add("Simba");
		list.add("Hanna");
		list.add(2, "jonas");
		System.out.println("Lista: " + list);
		list.removeIf(value -> value.charAt(0) == 'S');
		List<String> result = list.stream().filter(names -> names == "jonas").collect(Collectors.toList());
		String name = list.stream().filter(names -> names.charAt(0) == 'j').findFirst().orElse("Nao existe");
		System.out.println("Lista: " + list);
		System.out.println("Result: " + result);
		System.out.println("name: " + name);
	}

}
