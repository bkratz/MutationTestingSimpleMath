package de.birgitkratz.simplemath;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    // Will sum numbers from n down to 0
    public int summation(int start) {
        int summation = 0;
        while (start > 0) {
            summation += start;
            start--;
        }
        return summation;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public int compare(int a, int b) {
        int result = 0;
        if (a == b) {
            result = 0;
        } else if (a > b) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
