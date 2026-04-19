package com.brahvim.uni.sem4.practicals;

public class _2 {

	public static void main(final String[] p_args) {
		if (p_args.length == 2) {

			try {

				System.out.printf(

						"Sum of the two values is `%d`.\n",
						Integer.valueOf(p_args[0]) + Integer.valueOf(p_args[1])

				);

			} catch (final NumberFormatException eNfe) {

				System.err.println("Given values can only be be 32-bit integers.");

			}

		} else {

			System.err.println("Please pass two 32-bit integers.");

		}
	}

}
