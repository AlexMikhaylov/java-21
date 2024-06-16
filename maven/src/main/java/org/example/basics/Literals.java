package org.example.basics;

/**
 * This class demonstrates various types of literals in Java,
 * including integer, floating-point, character, string, boolean, and null literals.
 */
public class Literals {
    public static void main(String[] args) {
        // Integer literals
        int integerLiteral = 1234567890;
        int negativeIntegerLiteral = -3;
        System.out.println("Integer Literal: " + integerLiteral);
        System.out.println("Negative Integer Literal: " + negativeIntegerLiteral);

        // Long integer literals
        long longIntegerLiteral = 1234567890123456789L;
        System.out.println("Long Integer Literal: " + longIntegerLiteral);

        // Floating-point literals
        double doubleLiteral = 3.14; // double precision
        float floatLiteral = 2.5f; // single precision
        double scientificNotationLiteral = 1e6; // scientific notation
        System.out.println("Double Literal: " + doubleLiteral);
        System.out.println("Float Literal: " + floatLiteral);
        System.out.println("Scientific Notation Literal: " + scientificNotationLiteral);

        // Character literals
        char characterLiteral = 'A';
        char spaceCharacterLiteral = ' ';
        System.out.println("Character Literal: " + characterLiteral);
        System.out.println("Space Character Literal: " + spaceCharacterLiteral);

        // String literals
        String stringLiteral = "Hello World";
        System.out.println("String Literal: " + stringLiteral);

        // Multi-line string literal (Text-Block)
        String textBlock = """
                Hello
                Java Rocks!
                """;
        System.out.println("Text Block:\n" + textBlock);

        // Boolean literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;
        System.out.println("Boolean True Literal: " + trueLiteral);
        System.out.println("Boolean False Literal: " + falseLiteral);

        // Null literal
        String nullLiteral = null;
        System.out.println("Null Literal: " + nullLiteral);

        // Binary, octal, and hexadecimal literals
        int binaryLiteral = 0b101010; // Binary (Base 2)
        int octalLiteral = 052; // Octal (Base 8)
        int hexadecimalLiteral = 0x2A; // Hexadecimal (Base 16)
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hexadecimal Literal: " + hexadecimalLiteral);

        // Numeric literals with underscores for readability
        long largeNumber = 10_000_000_000L;
        int binaryLiteralWithUnderscores = 0b1010_1010_1010_1010;
        double doubleLiteralWithUnderscores = 111.111_111_111;
        System.out.println("Large Number Literal with Underscores: " + largeNumber);
        System.out.println("Binary Literal with Underscores: " + binaryLiteralWithUnderscores);
        System.out.println("Double Literal with Underscores: " + doubleLiteralWithUnderscores);
    }
}
