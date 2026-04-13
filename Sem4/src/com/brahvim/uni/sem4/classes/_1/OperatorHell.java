package com.brahvim.uni.sem4.classes._1;

public class OperatorHell {

	@SuppressWarnings({ "all", "dead", "unused" })
	public static void main(final String... p_args) {
		final int x = 3;
		final int y = 5;
		final int z = 7;
		System.out.println(

				(x + y * 2 << 1 & 15) == 10
						&& !(x > z) || x != y

		);
		System.out.println(

				(x * y + 10 / 2 % 3 & 7) == 5
						&& x >= z

		);
	}

}
