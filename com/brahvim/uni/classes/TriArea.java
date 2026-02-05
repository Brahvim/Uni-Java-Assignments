package com.brahvim.uni.classes;

import java.util.Scanner;

public class TriArea {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Length of first side: ");
			final double a = sc.nextDouble();

			System.out.print("Length of second side: ");
			final double b = sc.nextDouble();

			System.out.print("Length of third side: ");
			final double c = sc.nextDouble();

			final double s = (a + b + c) * 0.5d;
			final double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.printf("Area is `%f`.\n", area);

		} catch (final Exception e) {

			System.out.println("There was an error.");
			// e.printStackTrace();

		}
	}

}
