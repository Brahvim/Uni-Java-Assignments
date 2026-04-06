package com.brahvim.uni.sem4.labs.jcf;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(final String[] p_args) {
		final Map<String, Integer> scores = new HashMap<>();
		
		scores.put("Alice", 95);
		scores.put("Bob", 	97);
		scores.put("Carol", 92);
		scores.put("Alice", 99); // Updates existing value.
		
		System.out.println(scores.get("Alice"));
		System.out.println(scores.containsKey("Bob"));
		
		// Iterate entries:
		for (final var e : scores.entrySet()) {
			
			System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
			
		}
	}

}
