package com.brahvim.uni.sem4.practicals;

public class Defaults {

    static int i;
    static byte b;
    static char c;
    static long l;
    static float f;
    static short s;
    static double d;
    static boolean bool;

    public static void main(final String... p_args) {
        System.out.println("Default values of Java primitive data-types:");
        System.out.println("`int`: " + Defaults.i);
        System.out.println("`byte`: " + Defaults.b);
        System.out.println("`long`: " + Defaults.l);
        System.out.println("`float`: " + Defaults.f);
        System.out.println("`short`: " + Defaults.s);
        System.out.println("`double`: " + Defaults.d);
        System.out.println("`boolean`: " + Defaults.bool);
        System.out.println("`char`: '" + Defaults.c + "' (UTF-8 value: " + (int) Defaults.c + ")");
    }

}
