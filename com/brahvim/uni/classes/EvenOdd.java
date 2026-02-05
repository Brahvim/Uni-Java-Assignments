package com.brahvim.uni.classes;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			final int n = sc.nextInt();
			System.out.println(
				((n & 1) == 1)
				? "The number is odd.\n"
				: "The number is even.\n"
			);

		}
		catch (final Exception e) {
		}
	}

}

