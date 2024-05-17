package ru.webdev;

public class Main {
    /*
    Добавить в приложении классы, реализующие операции деления 'Divider' и умножения 'Multiplier', продемонстрировать их работу в методе main основного класса. Для этого запросить у пользователя в вести в консоль 2 числа с плавающей точкой.

    Пример:
    Вывод: Введите число a
    Ввод: 1
    Вывод: Введите число b
    Ввод: 2
    Вывод: Результат сложения a и b: 3
    Вывод: Результат вычитания a и b: -1
    Вывод: Результат умножения a и b: 2
    Вывод: Результат деления a и b: 0.5
    */


    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;

        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b); // 7.0

        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b); // -3.0

        calculator = new Calculator((n, m) -> n * m);
        calculator.calc(a, b); // 10.0
    }
}
