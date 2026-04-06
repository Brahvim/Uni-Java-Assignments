package com.brahvim.uni.sem4.classes._1;

public class Bitwise {

	public static void main(final String... p_args) {
		System.out.println(0x001 | 0x001);

		System.out.println(0x001 | 0x000); // `0x000`!

		System.out.println(0x001 & 0x001);

		System.out.println(0x001 ^ 0x001);

		// (Outputs `1\n1\n1\n0` LIKE a XOR gate...!)
	}

}
