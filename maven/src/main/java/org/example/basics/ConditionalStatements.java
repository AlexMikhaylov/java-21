package org.example.basics;

public class ConditionalStatements {

    private static final double RANDOM = Math.random();
    private static final int a = 12;
    private static final int b = 3434;

    private static String showColor(double value) {
        return value < 0.3 ? "white" :
                value < 0.6 ? "blue" :
                        value < 0.8 ? "green" : "yellow";
    }

    private static void useConditionalOperators() {
        /*
         * Syntax:
         *  Condition ? Expression1 : Expression2
         * */
        int result = a > b ? a : b;
        System.out.println("The larger number is: " + result);

    }

    private static void defineColor(double value) {

        if (value < 0.3)
            System.out.println("The color is white");
        else if (value < 0.6)
            System.out.println("The color is blue");
        else if (value < 0.8)
            System.out.println("The color is green");
        else
            System.out.println("The color is yellow");
    }

    private static void isRed(double value) {
        if (value > 0.5)
            if (value > 0.7)
                System.out.println("The value is dark red");
            else
                System.out.println("The value is hell red");
        else // Dangling-Else-Problem
            System.out.println("The value is not red");
    }

    private static void checkQuadratSquare(int area) {

        if (area > 10_000)
            System.out.println("The area " + area + " of the square is larger that 10 000");

        System.out.println("This print out statement will always be printed");
    }

    private static int readInputSquareSize() {
        System.out.println("Enter the square size a:");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the square size b:");
        int b = new java.util.Scanner(System.in).nextInt();

        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(RANDOM);
        isRed(RANDOM);  // Call the method to check if the random value is red or not
        defineColor(RANDOM);  // Call the method to define the color based on the random value
        useConditionalOperators();
        System.out.println(showColor(RANDOM));

        int area = readInputSquareSize();
        System.out.println(area);
        checkQuadratSquare(area);  // Call the method to check the area of the square
    }
}
