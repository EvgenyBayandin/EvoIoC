package ru.webdev;

public class Divider implements Operation {
    public double getResult(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN;
        } else {
            return a / b;
        }
    }
}
