package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testFibonacci() {
        App app = new App();
        assertEquals(5, app.getFibonacci(5), "Fibonacci calculation is incorrect!");
    }
}
