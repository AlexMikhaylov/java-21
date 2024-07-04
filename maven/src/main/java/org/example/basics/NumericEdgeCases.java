package org.example.basics;

public class NumericEdgeCases {
    public static void main(String[] args) {
        // Integer overflow
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer overflow: " + (maxInt + 1));

        // Integer underflow
        int minInt = Integer.MIN_VALUE;
        System.out.println("Integer underflow: " + (minInt - 1));

        // Floating point precision
        double doubleValue = 1.0 / 3.0;
        System.out.println("Floating point precision: " + doubleValue);

        // Float min / 2
        float minFloat = Float.MIN_VALUE;
        System.out.println("Float min value " + minFloat + " / 2: " + minFloat / 2);

        // Precision issues 0.9999999999999999
        double precisionValue = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("Precision issue: " + precisionValue);

        // Float precision issue: 1.23456789123f is cut to 1.2345679
        float notPreciseValue = 1.23456789123f;
        System.out.println("Not precise float value: " + notPreciseValue);

        // Double precision issue: 1.23456789123456789012345 is cut to 1.234567891234568
        double notPreciseDoubleValue = 1.23456789123456789012345;
        System.out.println("Not precise double value: " + notPreciseDoubleValue);

        // Infinity and NaN
        // there are double and float values which do not represent a number but are infinity
        System.out.println(Float.MAX_VALUE * 2); // Infinity
        double infinityDouble = Double.POSITIVE_INFINITY;
        double infinityFloat = Float.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        System.out.println("Double Infinity: " + infinityDouble);
        System.out.println("Float Infinity: " + infinityFloat);
        System.out.println("Negative Infinity: " + negativeInfinity);

        // NaN (Not a Number) is a floating point representation of undefined or unrepresentable values
        double nan = Double.NaN;
        double nan2 = Double.NaN;
        var minusSqrt = Math.sqrt(-4);
        System.out.println(nan == nan2); // false always
        System.out.println("Are two values NaN: " + (Double.isNaN(nan) == Double.isNaN(nan2)));
        System.out.println("Math.sqrt(-4): " + minusSqrt);
        System.out.println("NaN: " + nan);
        System.out.println("Is NaN: " + Double.isNaN(nan));
        System.out.println("Is infinity: " + Double.isInfinite(infinityDouble));
        System.out.println("Is negative infinity: " + Double.isInfinite(negativeInfinity));
        System.out.println("positive infinity" + 0.0 / 0.0 );
        System.out.println("negative infinity" + -0.0 / 0.0 );

        // durch 0 teilen -> Infinity
        // only in floating point case, not in integer
        System.out.println( 1. / 0);
        System.out.println( -1. / 0);

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println( 1 / 0);

        // Math exact methods
        // Exception in thread "main" java.lang.ArithmeticException: integer overflow
        // Math.addExact(maxInt, 1);
    }
}
