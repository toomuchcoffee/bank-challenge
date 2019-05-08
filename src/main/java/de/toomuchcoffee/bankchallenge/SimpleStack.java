package de.toomuchcoffee.bankchallenge;

class SimpleStack<T> {
    private T[] stack;
    private int top = -1;

    public SimpleStack(T[] args) {
        this.stack = args;
    }

    public T pop() {
        T r = stack[top];
        top = top - 1;
        return r;
    }

    public void push(T value) {
        top = top + 1;
        stack[top] = value;
    }
}
