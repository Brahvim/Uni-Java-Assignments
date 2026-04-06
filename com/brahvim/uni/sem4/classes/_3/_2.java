package com.brahvim.uni.sem4.classes._3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _2 {

	public static void main(final String... p_args) {
		System.out.print("Enter path to a file to check for vowels in: ");
		try (final var sc = new Scanner(System.in)) {

			try (final var r = new FileReader(sc.nextLine())) {

				long countConsonants = 0;
				long countVowels = 0;

				while (r.ready()) {

					switch (r.read()) {

						case 'a', 'e', 'i', 'o', 'u' -> {
							++countVowels;
						}

						default -> {
							++countConsonants;
						}

					}

				}

				System.out.printf(

						"There are `%d` consonants and `%d` vowels.\n",
						countConsonants,
						countVowels

				);

			} catch (final FileNotFoundException e) {

				System.err.println("File not found.");

			} catch (final IOException e) {

				System.err.println("Problem reading file.");

			}

		}
	}

}
