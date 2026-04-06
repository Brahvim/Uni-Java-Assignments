package com.brahvim.uni.sem4.labs.b64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class B64 {

	public static void main(final String[] p_args) {
		String uin = "";
		char op = 0;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Please enter a Base64 or UTF-8 string: ");
			uin = sc.nextLine();

			System.out.print("Please select an operation [E/d]: ");
			op = sc.next().charAt(0);

		}

		switch (op) {

			case 'e', 'E' -> {

				final var e = Base64.getEncoder().encodeToString(

						uin.getBytes(StandardCharsets.UTF_8)

				);

				System.out.printf("Base64: %s\n", e);

			}

			case 'd', 'D' -> {

				final var d = Base64.getDecoder().decode(

						uin.getBytes(StandardCharsets.UTF_8)

				);

				System.out.printf("UTF-8: %s\n", new String(d, StandardCharsets.UTF_8));

			}

			default -> {

				System.out.println("Invalid operation.");

			}

		}
	}

}
