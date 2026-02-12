package com.brahvim.uni.classes._2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(final String... p_args) {
		try (final Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter a number: ");
			final int uin = sc.nextInt();
			int reverse = 0;

			for (int i = uin; i > 0; i /= 10) {

				reverse = reverse * 10 + i % 10;

			}

			System.out.println(reverse == uin
					? "That number is not a palindrome."
					: "That number is a palindrome." //
			);

		}
	}

}
