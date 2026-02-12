package com.brahvim.uni.classes._1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(final String... p_args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			int a = sc.nextInt();

			System.out.print("Enter another number: ");
			int b = sc.nextInt();

			a += b;
			b = a - b;
			a -= b;

			System.out.printf("The resulting values are `%d` and `%d`.\n", a, b);

		}
	}

}
