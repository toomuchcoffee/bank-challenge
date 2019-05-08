package de.toomuchcoffee.bankchallenge;

public class NumberToOrdinal {
    public static String numberToOrdinal(int number) {
        if (number == 0) {
            return String.valueOf(number);
        }
        int lastTwoDigits = number % 100;
        if (lastTwoDigits < 11 || lastTwoDigits > 13) {
            int lastDigit = number % 10;
            if (lastDigit == 1) {
                return number + "st";
            }
            if (lastDigit == 2) {
                return number + "nd";
            }
            if (lastDigit == 3) {
                return number + "rd";
            }
        }
        return number + "th";
    }
}
