package com.brahvim.uni.sem4.labs.jcf;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(final String[] p_args) {
		final Map<String, String> dict = new HashMap<>();

		dict.put("delicious", 	"Tasty.");
		dict.put("robber", 		"A kind of thief.");
		dict.put("keyboard", 	"A device used to input text.");


		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter a word (or \"exit\"): ");

				final String word = sc.next().toLowerCase();

				if ("exit".equals(word)) {

					System.out.println("Exiting...");
					System.exit(0);

				}

				System.out.println(dict.get(word));

			}
		}
	}

}
