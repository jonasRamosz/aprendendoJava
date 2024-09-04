package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("NoteBook");
		set.add("tablet");
		System.out.println(set.contains("NoteBook"));
		
		set.remove("TV");
		set.removeIf(x -> x.length() >= 3);
		
		
		for(String item : set) {
			System.out.println(item);
		}
	}

}
