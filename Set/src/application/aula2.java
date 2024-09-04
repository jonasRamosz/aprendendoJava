package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class aula2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		
		//fazer copia de um set
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection "manter somente os elementos emcomum nos conjutos"
		
		//fazendo copia de set
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		
		//diference "manter os elementos  diferentes nos conjuntos"
		
		//fazaendo copia do set
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}

}
