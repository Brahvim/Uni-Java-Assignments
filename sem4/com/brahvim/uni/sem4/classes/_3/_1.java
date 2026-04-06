package com.brahvim.uni.sem4.classes._3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class _1 {

	public static void main(final String... p_args) {
		System.out.print("Enter path to a file to count words in: ");
		try (final var sc = new Scanner(System.in)) {

			try (final var r = new Scanner(new FileReader(sc.nextLine()))) {

				int bestLen = -1;
				String bestText = "";

				while (r.hasNext()) {

					final String word = r.next();
					final int len = word.length();

					if (len > bestLen) {

						bestText = word;
						bestLen = len;

					}

				}

				if (bestLen > 0) {

					System.out.printf("Longest word is `%s`.\n", bestText);

				} else {

					System.err.println("Parsing error.");

				}

			} catch (final FileNotFoundException e) {

				System.err.println("File not found.");

			}

		}
	}

}
