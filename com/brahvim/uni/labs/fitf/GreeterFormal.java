package com.brahvim.uni.labs.fitf;

public class GreeterFormal implements Greeter {

	@Override
	public void greet(final String p_name) {
		System.out.printf("Hello there, %s.\n", p_name);
	}

}
