package com.example;

public class Fibonacci {
    public int calculate(int n) {
        if (n <= 1) return n;
        return calculate(n - 1) + calculate(n - 2);
    }
}