package ru.webdev;

public class Calculator {
    Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public void calc(double a, double b) {
        double result = operation.getResult(a, b);
        System.out.println((int) result);
    }

    public void calcForDivider(double a, double b) {
        System.out.println("Результат деления a и b: " + operation.getResult(a, b));
    }
}
