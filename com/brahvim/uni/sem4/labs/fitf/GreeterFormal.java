package com.brahvim.uni.sem4.labs.fitf;

public class GreeterFormal implements Greeter {

	@Override
	public void greet(final String p_name) {
		System.out.printf("Hello there, %s.\n", p_name);
	}

}
