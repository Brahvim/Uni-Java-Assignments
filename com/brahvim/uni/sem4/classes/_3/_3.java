package com.brahvim.uni.sem4.classes._3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class _3 {

	public static void main(final String... p_args) {
		System.out.print("Enter path to a file to split numbers in: ");
		try (final var sc = new Scanner(System.in)) {

			try (final var r = new Scanner(new FileReader(sc.nextLine()))) {

				final var evens = new ArrayList<Integer>();
				final var odds = new ArrayList<Integer>();

				while (r.hasNextInt()) {

					final var num = r.nextInt();
					((ArrayList<Integer>) ((num & 1) == 1 ? odds : evens)).add(num); // ^v^")!

				}

				for (final var entry : Map.of(

						"odd.txt", odds,
						"even.txt", evens

				).entrySet()) {

					final var list = entry.getValue();
					final var path = entry.getKey();

					try (final var w = new BufferedWriter(new FileWriter(path))) {

						for (final int i : list) {

							w.write(Integer.toString(i));

						}

						System.out.printf("Wrote to `%s`.\n", path);

					} catch (final IOException e) {

						System.err.printf("Count not write to `%s`.\n", path);

					}

				}

			} catch (final FileNotFoundException e) {

				System.err.println("File not found.");

			}

		}
	}

}
