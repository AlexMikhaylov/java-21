package org.example.basics;

public class SwitchCaseCalculator {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double substract(double a, double b) {
        return a - b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Error: Division by zero");
            return -1;
        }
        return a / b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    // boolean, double, long, float can't be used in switch statements

    // Traditional implementation of switch-case
    private static void traditionalSwitchCase(double a, double b, String operator) {
        if (operator != null) {
            switch (operator) {
                case "+":
                    System.out.println(add(a, b));
                    break; // avoids fall-through
                case "-":
                    System.out.println(substract(a, b));
                    break;
                case "/":
                    if (b == 0)
                        System.out.println("Error: Division by zero");
                    else
                        System.out.println(divide(a, b));
                    break;
                case "*", "x", "X":
                    // case "x":
                    // case "X":
                    System.out.println(multiply(a, b));
                    break;
                default:
                    System.out.println(STR."Error: Invalid operator \{operator}");
            }
        }
    }

    // Modern implementation of switch-case
    private static void modernSwitchCase(double x, double y, String operator) {
        // Selector expression
        switch (operator) { // char, byte, short, int, Character, Byte, Short, Integer, String, enum
            case "+" -> System.out.println(add(x, y));
            case "-" -> System.out.println(substract(x, y));
            case "/" -> {
                if (y == 0)
                    System.out.println("Error: Division by zero");
                else
                    System.out.println(divide(x, y));
            }
            case "*", "x", "X" -> System.out.println(multiply(x, y));
            case null, default -> System.out.println(STR."Error: Invalid operator \{operator}");
        }
        ;
    }

    // Modern implementation of switch-case with return type
    private static String modernSwitchCaseWithReturn(double x, double y, String operator) {
        return switch (operator) {
            case "+" -> STR."\{add(x, y)}";
            case "-" -> STR."\{substract(x, y)}";
            case "/" -> {
                if (y == 0) {
                    System.err.println("Error: Division by zero");
                    yield STR."\{-1}";
                }
                yield STR."\{divide(x, y)}";
            }
            case "*", "x", "X" -> STR."\{multiply(x, y)}";
            case null, default -> STR."Error: Invalid operator \{operator}";
        };
    }

    public static void main(String[] args) {
        double x = new java.util.Scanner(System.in).nextDouble();
        String operator = new java.util.Scanner(System.in).next();
        double y = new java.util.Scanner(System.in).nextDouble();

        traditionalSwitchCase(x, y, operator);
        modernSwitchCase(x, y, operator);
        System.out.println(modernSwitchCaseWithReturn(x, y, operator));

    }
}
