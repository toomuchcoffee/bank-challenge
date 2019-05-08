package de.toomuchcoffee.bankchallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void shouldWorkForAnEmptyString() {
        assertEquals(0, calculator.evaluate(""), 0);
    }
    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calculator.evaluate("1 2 3"), 0);
    }
    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calculator.evaluate("1 2 3.5"), 0);
    }
    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calculator.evaluate("1 3 +"), 0);
    }
    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calculator.evaluate("1 3 *"), 0);
    }
    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calculator.evaluate("1 3 -"), 0);
    }
    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calculator.evaluate("4 2 /"), 0);
    }
}