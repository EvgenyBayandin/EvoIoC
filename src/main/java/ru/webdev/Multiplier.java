package ru.webdev;

public class Multiplier implements Operation {
    @Override
    public double getResult(double a, double b) {
        return (int) (a * b);
    }
}
