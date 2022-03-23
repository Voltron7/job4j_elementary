package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + div(first, second)
                + sub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
