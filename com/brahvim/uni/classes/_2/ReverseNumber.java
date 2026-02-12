package com.brahvim.uni.classes._2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			int out = 0;

			for (int i = sc.nextInt(); i > 0; i /= 10) {

				out = out * 10 + i % 10;

			}

			System.out.printf("The reverse of this number is `%d`.\n", out);

		}
	}

}
