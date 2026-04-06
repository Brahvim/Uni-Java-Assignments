package com.brahvim.uni.sem4.labs.jcf;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(final String[] p_args) {
		final Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("Java"); // Duplicate, ignored.
		
		System.out.println(set.size()); // `3`.
		System.out.println(set.contains("Python")); // `true`.
		
		// Iteration (order not guaranteed!):
		for (final String l : set) {
			
			System.out.println(l);
			
		}
		
		set.remove("C++");
		System.out.println(set); // `[ Java, Python ]`.
		
	}

}
