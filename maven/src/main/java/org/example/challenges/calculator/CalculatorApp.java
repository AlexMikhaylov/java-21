package org.example.challenges.calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);

        result = calculator.subtract(5, 3);
        System.out.println("5 - 3 = " + result);

        result = calculator.multiply(5, 3);
        System.out.println("5 * 3 = " + result);

        result = calculator.divide(5, 3);
        System.out.println("5 / 3 = " + result);

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        result = scientificCalculator.sine(Math.PI / 2);
        System.out.println("sin(π/2) = " + result);

        result = scientificCalculator.cosine(Math.PI / 2);
        System.out.println("cos(π/2) = " + result);
    }
}
