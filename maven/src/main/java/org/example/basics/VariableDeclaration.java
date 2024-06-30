package org.example.basics;

import java.math.BigInteger;

/**
 * This class demonstrates various types of variable declarations and initializations in Java.
 * It includes examples relevant to everyday development scenarios, using Java 21 best practices.
 */
public class VariableDeclaration {

    public static void main(String[] args) {
        // Example of integer declaration and initialization
        int age = 20; // declaration and initialization
        System.out.println("Age: " + age);

        // Example of long integer declaration for larger values
        long bigAge = 100_000_000_000_000L;
        System.out.println("Big Age: " + bigAge);

        // Using BigInteger for extremely large numbers
        BigInteger veryBigAge = new BigInteger("123456789012345678901234567890");
        System.out.println("Very Big Age: " + veryBigAge);

        // Demonstrating the use of different integer types
        short shortAge = 12_000;
        byte byteAge = 120;
        System.out.println("Short Age: " + shortAge);
        System.out.println("Byte Age: " + byteAge);

        // Floating-point number declarations
        double doubleAge = 1000.00000000000000000000; // double precision floating point
        float floatAge = 1000.0000000f; // single precision floating point
        System.out.println("Double Age: " + doubleAge);
        System.out.println("Float Age: " + floatAge);

        // Character type declaration
        char charGender = 'M';
        System.out.println("Gender: " + charGender);

        // String declaration
        String name = "Alexander";
        System.out.println("Name: " + name);

        // Boolean declaration
        boolean snowing = false;
        System.out.println("Is it snowing? " + snowing);

        // Declaration of multiple variables in a single line
        int i = 12, y;
        int a, b = 12;
        int c, d;
        System.out.println("i: " + i);
        System.out.println("b: " + b);

        // Expressions assignment and unary operators

        double priceJuce = 1.5;
        double priceApple = 0.75;

        // from right to left
        priceApple = priceJuce = 1.6;
        //           --------1-------
        // ---2-----
        System.out.println(-priceJuce);
        System.out.println(-(-priceJuce));
        System.out.println(+priceJuce);

        // Math.random between 0 (inclusive) and 1 (exclusive)
        double random = Math.random();
        System.out.println(random);
        System.out.println(-random);

        // Modulo operator (%) remainder of division a % b = a - (b * Math.floor(a / b))
        int remainder = 10 % 3;
        System.out.println(STR."Remainder: \{remainder}");

        double totalMinutes = 125.33;
        System.out.println( Math.floor(totalMinutes / 60) + " hours and " + (totalMinutes % 60) + " minutes");

        // Automatic type promotion (widening conversion)
        double j = 111.111;
        int k = 200;
        System.out.println( j * k); // double

        char m = 'M';
        // char s = m + 1; // Error: incompatible types: char cannot be converted to int
        char s = (char) (m + 1);
        System.out.println(s);

        // Final variable declaration (constant)
        final double PI = 3.1415926535897932;
        System.out.println(STR."PI: \{PI}");

        // Example: Using final with other types
        final String GREETING = "Hello, World!";
        System.out.println(GREETING);

        // Best practice: Use meaningful variable names
        int customerAge = 30;
        double annualSalary = 85_000.50;
        boolean isEmployeeActive = true;

        System.out.println("Customer Age: " + customerAge);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Is Employee Active? " + isEmployeeActive);

        /*
        * Assignment operators
        * = *= /= %= -= += <<= >>= >>>= &= ^= |=
        * = means that the assignment operator should be used to assign a value to a variable.
        * *= means that the assignment operator should be used to multiply a variable by a value.
        * /= means that the assignment operator should be used to divide a variable by a value.
        * %= means that the assignment operator should be used to calculate the remainder of a division.
        * -= means that the assignment operator should be used to subtract a value from a variable.
        * += means that the assignment operator should be used to add a value to a variable.
        * <<= means that the assignment operator should be used to left-shift a variable by a value.
        * >>= means that the assignment operator should be used to right-shift a variable by a value.
        * >>>= means that the assignment operator should be used to unsigned right-shift a variable by a value
        * &= means that the assignment operator should be used to bitwise AND a variable with a value.
        * ^= means that the assignment operator should be used to bitwise XOR a variable with a value.
        * |= means that the assignment operator should be used to bitwise OR a variable with a value.
        *
        *
        * var = var OP (expression) => var OP= (expression)
        *
        */
        int counter = 0;
        counter += 2;

        // attention
        int cd = 10;
        cd *= 3.1215; // versteckte Typumwandlung
        System.out.println(cd); // 31

        int cf = 10;
        cf *= (int) 3.1215;
        System.out.println(cf); // 30 because of cf *= ((int) 3.1215)
    }
}
