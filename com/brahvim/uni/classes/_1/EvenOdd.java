package com.brahvim.uni.classes._1;
import java.util.Scanner;

public class EvenOdd {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			final int n = sc.nextInt();
			System.out.println(
				((n & 1) == 1)
				? "The number is odd.\n"
				: "The number is even.\n"
			);

		}
	}

}

