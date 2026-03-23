package com.brahvim.uni.labs.fitf;

import java.util.function.Function;

@FunctionalInterface
public interface Calculator {

	int calculate(int n);

	public static void main(final String[] args) { // TIL `main()` REALLY can be *anywhere*...!
		final Function<Integer, Integer> calculatorHalf = n -> n / 2;
		final Calculator calculatorTwice = new Calculator() {

			@Override
			public int calculate(final int p_value) {
				return p_value * 2;
			}

		};
		final Calculator calculatorSquare = n -> n * n; // `->` is the "Lambda Operator".

		for (final int i : new int[] { 6, 9 }) {

			System.out.printf("Square of %d is %d.\n", i, calculatorSquare.calculate(i));
			System.out.printf("Twice of %d is %d.\n", i, calculatorTwice.calculate(i));
			System.out.printf("Half of %d is %d.\n", i, calculatorHalf.apply(i));

		}
	}

}