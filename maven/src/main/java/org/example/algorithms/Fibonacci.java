package org.example.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.stream.LongStream;

/**
 * This class contains methods to calculate Fibonacci numbers using different approaches.
 */
public class Fibonacci {

    private static final int MAX_N = 92; // Maximum n to avoid long overflow

    /**
     * Calculates the nth Fibonacci number using a naive recursive approach.
     * This method has an exponential time complexity and is not suitable for large values of n.
     *
     * @param n the position of the Fibonacci number to calculate.
     * @return the nth Fibonacci number.
     * @throws IllegalArgumentException if n is less than 0 or greater than MAX_N.
     */
    public static long calculateFibonacciBad(int n) {
        validateInput(n);
        if (n < 2) {
            return n;
        }
        return calculateFibonacciBad(n - 1) + calculateFibonacciBad(n - 2);
    }

    // Memoization map for storing already computed Fibonacci numbers
    private static final Map<Integer, Long> memo = new HashMap<>(Map.of(0, 0L, 1, 1L));

    /**
     * Calculates the nth Fibonacci number using memoization.
     * This method stores the results of expensive function calls and reuses them when the same inputs occur again.
     *
     * @param n the position of the Fibonacci number to calculate.
     * @return the nth Fibonacci number.
     * @throws IllegalArgumentException if n is less than 0 or greater than MAX_N.
     */
    public static long calculateFibonacciMemoization(int n) {
        validateInput(n);
        if (!memo.containsKey(n)) {
            memo.put(n, calculateFibonacciMemoization(n - 1) + calculateFibonacciMemoization(n - 2));
        }
        return memo.get(n);
    }

    /**
     * Calculates the nth Fibonacci number using an iterative approach.
     * This method is more efficient than the recursive approach and has linear time complexity.
     *
     * @param n the position of the Fibonacci number to calculate.
     * @return the nth Fibonacci number.
     * @throws IllegalArgumentException if n is less than 0 or greater than MAX_N.
     */
    public static long calculateFibonacciIterative(int n) {
        validateInput(n);
        if (n == 0) return 0;
        if (n == 1) return 1;

        long last = 0, next = 1;
        for (int i = 2; i <= n; i++) {
            long temp = next;
            next += last;
            last = temp;
        }
        return next;
    }

    /**
     * A private inner class that implements the LongSupplier interface.
     * This class is used to generate a stream of Fibonacci numbers.
     */
    private static class FibonacciStream implements LongSupplier {
        private long last = 0L;
        private long next = 1L;

        @Override
        public long getAsLong() {
            long oldLast = last;
            last = next;
            next = oldLast + last;
            return oldLast;
        }
    }

    /**
     * Generates a stream of Fibonacci numbers.
     *
     * @return a LongStream of Fibonacci numbers.
     */
    public LongStream fibonacciStream() {
        return LongStream.generate(new FibonacciStream());
    }

    /**
     * Validates the input for Fibonacci calculations.
     *
     * @param n the position of the Fibonacci number to calculate.
     * @throws IllegalArgumentException if n is less than 0 or greater than MAX_N.
     */
    private static void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n > MAX_N) {
            throw new IllegalArgumentException("n must be less than or equal to " + MAX_N + " to avoid overflow");
        }
    }

    /**
     * The main method to test the methods.
     */
    public static void main(String[] args) {
        // Testing calculateFibonacciBad
        System.out.println(calculateFibonacciBad(0)); // 0
        System.out.println(calculateFibonacciBad(1)); // 1
        System.out.println(calculateFibonacciBad(2)); // 1
        System.out.println(calculateFibonacciBad(3)); // 2
        System.out.println(calculateFibonacciBad(4)); // 3
        System.out.println(calculateFibonacciBad(5)); // 5

        // Testing calculateFibonacciMemoization
        System.out.println(calculateFibonacciMemoization(40)); // 102_334_155
        System.out.println(calculateFibonacciMemoization(92)); // 7_540_113_804_746_346_429

        try {
            System.out.println(calculateFibonacciMemoization(-1));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(calculateFibonacciMemoization(93));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Testing calculateFibonacciIterative
        System.out.println(calculateFibonacciIterative(42)); // 267_914_296
        System.out.println(calculateFibonacciIterative(90)); // 2_880_067_194_370_816_120

        try {
            System.out.println(calculateFibonacciIterative(-1));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(calculateFibonacciIterative(93));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Testing the stream method
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciStream().limit(50).forEachOrdered(System.out::println); // expected first 50 fibonacci numbers
    }
}
