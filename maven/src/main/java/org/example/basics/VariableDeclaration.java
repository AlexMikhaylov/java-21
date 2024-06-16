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

        // Final variable declaration (constant)
        final double PI = 3.1415926535897932;
        System.out.println("PI: " + PI);

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
    }
}
