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
     * Checks if a given number is a Fibonacci number.
     *
     * @param number the number to check.
     * @return true if the number is a Fibonacci number, false otherwise.
     * This method uses the iterative approach to calculate Fibonacci numbers.
     * It iterates from 0 to the given number, calculating each Fibonacci number using the calculateFibonacciIterative method.
     * If the calculated Fibonacci number equals the given number, it returns true.
     * If the calculated Fibonacci number is greater than the given number, it returns false.
     */
    public static boolean isFibonacci(long number){
        for(int i = 0; calculateFibonacciIterative(i) <= number; i++){
            if(calculateFibonacciIterative(i) == number){
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a given number is a Fibonacci number using perfect square method.
     *
     * @param number the number to check.
     * @return true if the number is a Fibonacci number, false otherwise.
     */
    public static boolean isFibonacciSquare(long number) {
        // Check if 5*number^2 + 4 or 5*number^2 - 4 is a perfect square
        long x1 = 5 * number * number + 4;
        long x2 = 5 * number * number - 4;

        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }

    /**
     * Checks if a given number is a perfect square.
     *
     * @param x the number to check.
     * @return true if the number is a perfect square, false otherwise.
     */
    private static boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }

    /**
     * The main method to test the methods.
     */
    public static void main(String[] args) {
        System.out.println(isFibonacci(-1)); // expected false
        System.out.println(isFibonacci(6)); // expected false
        System.out.println(isFibonacci(7)); // expected false
        System.out.println(isFibonacci(8)); // expected true


        System.out.println(isFibonacciSquare(6)); // expected false
        System.out.println(isFibonacciSquare(7)); // expected false
        System.out.println(isFibonacciSquare(8)); // expected true
    }
}
