package org.example.algorithms;

public class Factorial {
    public static void main(String[] args) {
        int counter = 1;
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial = factorial * ++counter;
            // factorial *= ++counter;
        }

    }
}
