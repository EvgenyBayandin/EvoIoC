package ru.webdev;

public class Adder implements Operation {
    @Override
    public double getResult(double a, double b) {
        return (int) (a + b);
    }
}
