package com.company;

public class FactorialUsingRecursion {
    public static void main(String args[]) {
        int input = 6;
        int factorial = getFactorial(input);
        System.out.println(factorial);
    }

    public static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);

        }
    }
}
