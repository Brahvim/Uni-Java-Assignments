package com.brahvim.uni.classes._2;

import java.util.Scanner;

public class DigitSum {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			int sum = 0;

			for (int in = sc.nextInt(); in > 0; sum += in % 10, in /= 10)
				;

			System.out.printf("The sum of the digits of this number is `%d`.\n", sum);

		}
	}

}
