package de.toomuchcoffee.bankchallenge;

public class CreditCard {
    public static String maskify(String creditCardNumber) {
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<creditCardNumber.length(); i++) {
            char charAt = creditCardNumber.charAt(i);
            if (charAt == '-' || !Character.isDigit(charAt)) {
                builder.append(charAt);
            } else if (i > 0 && i < creditCardNumber.length()-4) {
                builder.append("#");
            } else {
                builder.append(charAt);
            }
        }

        return builder.toString();
    }
}
