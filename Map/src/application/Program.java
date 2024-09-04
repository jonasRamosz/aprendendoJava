package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		 Map<String, String> coockies = new TreeMap<>();
		 
		 coockies.put("username", "Jonas");
		 coockies.put("email", "jonas@gmail.com");
		 coockies.put("phone", "888888888");
		 
		 coockies.remove("email");
		 
		 System.out.println(coockies.containsKey("phone"));
		 
		 for(String key: coockies.keySet()) {
			 System.out.println(key + ": " + coockies.get(key));
		 }
		 
	}

}
