package com.brahvim.uni.sem4.labs.fitf;

public class GreeterInformal implements Greeter {

	@Override
	public void greet(final String p_name) {
		System.out.printf("Hi, %s!\n", p_name);
	}

}
