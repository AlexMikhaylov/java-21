package org.example.basics;

public class RecursiveMethods {
    public static void main(String[] args) {
        increment(100);
    }

    static void increment(int value) {
        System.out.println(value);

        if (value == 0)
            return;

        increment(value - 1);
    }
}
