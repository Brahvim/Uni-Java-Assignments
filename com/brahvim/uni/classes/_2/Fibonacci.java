package com.brahvim.uni.classes._2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("How many terms of the Fibonacci series to print?: ");
			final long uin = sc.nextLong();
			long out = 0;

			for (long i = uin; i > 0; i /= 10) {

				out = out * 10 + i % 10;

			}
		}
	}

}
