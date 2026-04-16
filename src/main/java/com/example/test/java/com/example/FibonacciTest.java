package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        Fibonacci fib = new Fibonacci();
        assertEquals(5, fib.calculate(5));
    }
}