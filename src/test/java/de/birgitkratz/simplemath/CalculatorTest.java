package de.birgitkratz.simplemath;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add () {
        assertThat(calculator.add(1, 0)).isEqualTo(1);
    }

    @Test
    void substract() {
        assertThat(calculator.substract(1, 1)).isEqualTo(0);
    }

    @Test
    void multiply() {
        assertThat(calculator.multiply(1, 1)).isEqualTo(1);
    }

    @Test
    void divide() {
        assertThat(calculator.divide(0, 100)).isZero();
        assertThat(calculator.divide(105, 10)).isEqualTo(10);
    }

    @Test
    void summation() {
        assertThat(calculator.summation(0)).isZero();
        assertThat(calculator.summation(1)).isEqualTo(1);
        assertThat(calculator.summation(2)).isEqualTo(3);
    }

    @Test
    void isPositive() {
        assertThat(calculator.isPositive(2)).isTrue();
        assertThat(calculator.isPositive(-2)).isFalse();
    }

    @Test
    void compare() {
        assertThat(calculator.compare(0, 0)).isZero();
        assertThat(calculator.compare(2, 0)).isEqualTo(1);
        assertThat(calculator.compare(0, 2)).isEqualTo(-1);
    }
}