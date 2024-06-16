package org.example.basics;

/**
 * This class demonstrates the various data types in Java, both primitive and reference types.
 */
public class JavaDataTypes {
    /*
     * The data types in Java fall into two categories:
     *
     * 1. Primitive data types:
     *   primitive types are the built-in data types of the Java language that are not objects.
     *   They include numbers, characters from the Basic Multilingual Plane (BMP), and booleans.
     *
     *    There are two kinds of primitive data types:
     *       1. Numeric types
     *       Integral types (whole number): byte, short, int (default), long, char (unicode character)
     *       Floating-point types (decimal number): float (with f), double (default)
     *
     *       2. Type boolean: true or false
     *
     * 2. Reference types:
     * Reference types are the data types that refer to objects, e.g. String, String[], Scanner, System
     */

    /* Type       Storage Size           Precision
     * byte       8 bits (1 Byte)          8-bit signed integer, range: -128 to 127 (-2^7 to 2^7 - 1)
     * short     16 bits (2 Byte)          16-bit signed integer, range: -32,768 to 32,767 (-2^15 to 2^15 -1)
     * int       32 bits (4 Byte)          32-bit signed integer, range: -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31 -1)
     * long      64 bits (8 Byte)          64-bit signed integer, range: -9,223,372,036,854,758,077,593,671,168 to 9,223,372,036,854,758,077,593,671,168 (-2^63 to 2^63 -1)
     * char      16 bits (2 Byte)          16-bit unsigned integer, range: 0 to 65,535, represents a BMP (Basic Multilingual Plane) Unicode character
     * float     32 bits (4 Byte)          Single-precision 32-bit IEEE 754 floating point number, range: 3.4e-45 to 3.4e38
     * double    64 bits (8 Byte)          Double-precision 64-bit IEEE 754 floating point number, range: 1.7e-308 to 1.7e308
     */


    public static void main(String[] args) {
        // Primitive Data Types

        // Integral Types
        byte byteValue = 127; // 8-bit signed integer
        short shortValue = 32_767; // 16-bit signed integer
        int intValue = 2_147_483_647; // 32-bit signed integer
        long longValue = 9_223_372_036_854_775_807L; // 64-bit signed integer
        char charValue = 'A'; // 16-bit Unicode character

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Char Value: " + charValue);

        // Floating-point Types
        float floatValue = 3.14f; // 32-bit single-precision floating point
        double doubleValue = 3.141592653589793; // 64-bit double-precision floating point

        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        // Boolean Type
        boolean booleanValue = true; // 1-bit representing true or false

        System.out.println("Boolean Value: " + booleanValue);

        // Reference Data Types

        // String - a sequence of characters
        String stringValue = "Hello, Java!";

        // Arrays - a collection of elements of the same type
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "Java", "Rocks"};

        // Objects - instances of classes
        Person person = new Person("John", 30);

        System.out.println("String Value: " + stringValue);
        System.out.println("Int Array: " + java.util.Arrays.toString(intArray));
        System.out.println("String Array: " + java.util.Arrays.toString(stringArray));
        System.out.println("Person: " + person);
    }

    /**
     * A simple class to demonstrate reference types.
     */
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}
