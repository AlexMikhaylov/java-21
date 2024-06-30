package org.example.basics;

public class TypeConversion {
    // implicit automatic type conversion
    // byte -> short -> int -> long -> float -> double

    // explicit type conversion (narrowing conversion)
    // short -> byte -> char
    // char -> byte -> short
    // int -> byte -> short -> char
    // long -> byte -> short -> char -> int
    // float -> byte -> short -> char -> int -> long
    // double -> byte -> short -> char -> int -> long -> float

    // There is no type conversion between boolean and any other type.

    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = byteValue; // implicit narrowing conversion
        int intValue = shortValue; // implicit narrowing conversion
        long longValue = intValue; // implicit narrowing conversion
        float floatValue = longValue; // implicit narrowing conversion
        double doubleValue = floatValue; // implicit narrowing conversion

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        // explicit type conversion (narrowing conversion)
        long value = 111111L;
        int intVal = (int) (value + value);

        double random = Math.random(); // 0 .. < 1
        int randomInt100 = (int) (random * 100); // 0.. < 100
        int randomInt10 = (int) (random * 10); // 0.. < 10

        // Convert to String, it's not a type conversion, it's a method call.
        String s = String.valueOf(value);
    }

}
