package de.toomuchcoffee.bankchallenge;

public class Calculator {

    public double evaluate(String expr) {
        String[] args = expr.split(" ");
        SimpleStack<String> stack = new SimpleStack<>(args);

        for (String token : args) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                double a = Double.valueOf(stack.pop());
                double b = Double.valueOf(stack.pop());
                double r = 0;
                if ("+".equals(token)) {
                    r = b + a;
                }
                if ("-".equals(token)) {
                    r = b - a;
                }
                if ("*".equals(token)) {
                    r = b * a;
                }
                if ("/".equals(token)) {
                    r = b / a;
                }

                stack.push(String.valueOf(r));
            } else {
                if (token.length() == 0) {
                    token = String.valueOf(0);
                }
                stack.push(token);
            }
        }

        return Double.valueOf(stack.pop());
    }


}
