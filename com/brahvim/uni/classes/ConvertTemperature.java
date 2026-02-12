package com.brahvim.uni.classes;

import java.util.Scanner;

public class ConvertTemperature {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner((System.in))) {

			System.out.print("Enter a temperature in Celsius: ");
			System.out.printf(

					"In Fahrenheit, that is `%.2f`.\n",
					(180.0d / 100.0d) * sc.nextDouble() + 32.0d

			);

		} catch (final Exception e) {

			System.out.println("There was an error.");
			// e.printStackTrace();

		}
	}

}
