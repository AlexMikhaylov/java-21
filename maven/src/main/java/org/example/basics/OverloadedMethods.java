package org.example.basics;

public class OverloadedMethods {
    public static void main(String[] args) {
        // sout in IntelliJ
        // Ctrl + P -> Display all overloaded methods for method, hover mouse over the method name
        // Ctrl + Q -> Quick documentation -> three points down right -> Open in a documentation window
        System.out.println("Hello"); // print line with string
        System.out.println(1234); // print line with int

        System.out.print(' '); // print without line break
        System.out.println(1234); // print with int with line break

        // souf f - formatted output
        // format specifiers
        // %s means string
        // %d means decimal integer
        // %f means floating-point number
        // %c means character
        // %b means boolean
        // %h means hexadecimal integer
        // %o means octal integer
        // %x means hexadecimal integer (lowercase)
        // %X means hexadecimal integer (uppercase)
        // %e means scientific notation (lowercase)
        // %E means scientific notation (uppercase)
        // %g means either %e or %f, whichever is shorter
        // %G means either %E or %f, whichever is shorter (lowercase)
        // %t means boolean (true/false)
        // %p means memory address
        // %n means a newline
        System.out.printf("Hello%n"); // print line with formatted string
        System.out.printf("%d%n", 1234); // print line with formatted integer
        System.out.printf("Hello %s%n", "World"); // print line with formatted string

        int a = 12;
        int b = 234;
        System.out.printf("%s * %s = %s%n", a, b, a * b); // print line with formatted integers
        System.out.printf("%d * %d = %d%n", a, b, a * b); // print line with formatted integers

        // Additional examples of overloading
        System.out.println(add(5, 10)); // Calls the add method with two integers
        System.out.println(add(5.5, 10.5)); // Calls the add method with two doubles
        System.out.println(add("Hello", "World")); // Calls the add method with two strings

        System.out.println(multiply(5, 10)); // Calls the multiply method with two integers
        System.out.println(multiply(5.5, 10.5)); // Calls the multiply method with two doubles
        System.out.println(multiply(5, 10.5)); // Calls the multiply method with an int and a double

        System.out.println(concatenate("Hello", 123)); // Calls the concatenate method with a string and an integer
        System.out.println(concatenate("Value is", true)); // Calls the concatenate method with a string and a boolean
    }

    // Overloaded add methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return STR."\{a} \{b}";
    }

    // Overloaded multiply methods
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double multiply(int a, double b) {
        return a * b;
    }

    // Overloaded concatenate methods
    public static String concatenate(String a, int b) {
        return STR."\{a} \{b}";
    }

    public static String concatenate(String a, boolean b) {
        return STR."\{a} \{b}";
    }
}
