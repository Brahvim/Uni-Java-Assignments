package com.brahvim.uni.sem4.labs.fitf;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GreetLambda {

    public static void main(final String[] args) throws IOException {
        System.out.print("Please enter your name: ");

        final var name = new String(System.in.readAllBytes(), StandardCharsets.UTF_8);

        ((Greeter) p_name -> System.out.printf("Hi there, %s!\n", p_name))
                .greet(name);
    }

}
