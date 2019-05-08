package de.toomuchcoffee.bankchallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToOrdinalTest {
    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("0", NumberToOrdinal.numberToOrdinal(0));
        assertEquals("1st", NumberToOrdinal.numberToOrdinal(1));
        assertEquals("2nd", NumberToOrdinal.numberToOrdinal(2));
        assertEquals("3rd", NumberToOrdinal.numberToOrdinal(3));
        assertEquals("4th", NumberToOrdinal.numberToOrdinal(4));
        assertEquals("21st", NumberToOrdinal.numberToOrdinal(21));
        assertEquals("42nd", NumberToOrdinal.numberToOrdinal(42));
        assertEquals("111th", NumberToOrdinal.numberToOrdinal(111));
        assertEquals("11111th", NumberToOrdinal.numberToOrdinal(11111));
        assertEquals("45123rd", NumberToOrdinal.numberToOrdinal(45123));
        assertEquals("11th", NumberToOrdinal.numberToOrdinal(11));
        assertEquals("12th", NumberToOrdinal.numberToOrdinal(12));
        assertEquals("13th", NumberToOrdinal.numberToOrdinal(13));
    }
}