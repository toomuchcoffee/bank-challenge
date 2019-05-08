package de.toomuchcoffee.bankchallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForBasicCreditCardsWithHyphens() {
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldNotMaskDigitsForShortCreditCards() {
        assertEquals("54321", CreditCard.maskify("54321"));
    }

    @Test
    public void shouldNotMaskNonDigitCharacters() {
        assertEquals("ABCD-EFGH-IJKLM-NOPQ", CreditCard.maskify("ABCD-EFGH-IJKLM-NOPQ"));
    }

    @Test
    public void shouldNotMaskEmptyStrings() {
        assertEquals("", CreditCard.maskify(""));
    }
}