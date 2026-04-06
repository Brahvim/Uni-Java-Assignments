package com.brahvim.uni.sem4.labs.b64;

import java.util.Base64;

public class BinaryEncodingExample {

    public static void main(final String[] args) {
        final byte[] bdata = { 1, 2, 3, 4, 5 }; // `ceil(40 / 6 * 8) = 54` for byte-strlen.
        final String encoded = Base64.getEncoder().encodeToString(bdata);

        // UTF-8 strlen is `ceil(54 / 8) = 7`, plus `=`s padding x2 for 5b of data.
        System.out.printf("Binary encoded values: %s\n", encoded);

        final byte[] decoded = Base64.getDecoder().decode(encoded);
        System.out.println("Decoded values:");
        for (final byte b : decoded) {

            System.out.printf("%d ", b);

        }

    }

}
