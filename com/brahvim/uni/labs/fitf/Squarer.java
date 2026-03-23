package com.brahvim.uni.labs.fitf;

public interface Squarer {

    int calculate(int n);

    public static void main(final String[] args) {

        final Squarer squarer = n -> n * n;

        for (final int i : new int[] { 6, 9 }) {

            System.out.printf("Square of %d is %d.\n", squarer.calculate(i));

        }

    }

}