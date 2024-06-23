package org.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void calculateFibonacciBad() {
        assertEquals(0, Fibonacci.calculateFibonacciBad(0));
        assertEquals(1, Fibonacci.calculateFibonacciBad(1));
        assertEquals(1, Fibonacci.calculateFibonacciBad(2));
        assertEquals(2, Fibonacci.calculateFibonacciBad(3));
        assertEquals(3, Fibonacci.calculateFibonacciBad(4));
        assertEquals(5, Fibonacci.calculateFibonacciBad(5));
        assertEquals(102334155, Fibonacci.calculateFibonacciBad(40));

        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciBad(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciBad(93));
    }

    @Test
    void calculateFibonacciMemoization() {
        assertEquals(0, Fibonacci.calculateFibonacciMemoization(0));
        assertEquals(1, Fibonacci.calculateFibonacciMemoization(1));
        assertEquals(1, Fibonacci.calculateFibonacciMemoization(2));
        assertEquals(2, Fibonacci.calculateFibonacciMemoization(3));
        assertEquals(3, Fibonacci.calculateFibonacciMemoization(4));
        assertEquals(5, Fibonacci.calculateFibonacciMemoization(5));
        assertEquals(102334155, Fibonacci.calculateFibonacciMemoization(40));
        assertEquals(7540113804746346429L, Fibonacci.calculateFibonacciMemoization(92));

        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciMemoization(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciMemoization(93));
    }

    @Test
    void calculateFibonacciIterative() {
        assertEquals(0, Fibonacci.calculateFibonacciIterative(0));
        assertEquals(1, Fibonacci.calculateFibonacciIterative(1));
        assertEquals(1, Fibonacci.calculateFibonacciIterative(2));
        assertEquals(2, Fibonacci.calculateFibonacciIterative(3));
        assertEquals(3, Fibonacci.calculateFibonacciIterative(4));
        assertEquals(5, Fibonacci.calculateFibonacciIterative(5));
        assertEquals(102334155, Fibonacci.calculateFibonacciIterative(40));
        assertEquals(7540113804746346429L, Fibonacci.calculateFibonacciIterative(92));

        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciIterative(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateFibonacciIterative(93));
    }

    @Test
    void fibonacciStream() {
        Fibonacci fibonacci = new Fibonacci();
        long[] expectedFirst50 = {
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
                6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269,
                2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155,
                165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, 2971215073L, 4807526976L, 7778742049L
        };

        long[] first50 = fibonacci.fibonacciStream().limit(50).toArray();
        assertArrayEquals(expectedFirst50, first50);
    }

    @Test
    void isFibonacci() {
        // test fibonacci numbers
        assertTrue(Fibonacci.isFibonacci(0));
        assertTrue(Fibonacci.isFibonacci(1));
        assertTrue(Fibonacci.isFibonacci(2));
        assertTrue(Fibonacci.isFibonacci(3));
        assertTrue(Fibonacci.isFibonacci(5));
        assertTrue(Fibonacci.isFibonacci(8));
        assertTrue(Fibonacci.isFibonacci(13));
        assertTrue(Fibonacci.isFibonacci(21));
        assertTrue(Fibonacci.isFibonacci(34));
        assertTrue(Fibonacci.isFibonacci(55));
        assertTrue(Fibonacci.isFibonacci(89));
        assertTrue(Fibonacci.isFibonacci(144));
        assertTrue(Fibonacci.isFibonacci(233));
        assertTrue(Fibonacci.isFibonacci(377));
        assertTrue(Fibonacci.isFibonacci(610));

        // test not fibonacci numbers
        assertFalse(Fibonacci.isFibonacci(4));
        assertFalse(Fibonacci.isFibonacci(-1));
        assertFalse(Fibonacci.isFibonacci(93));
        assertFalse(Fibonacci.isFibonacci(102334156));
    }
}
