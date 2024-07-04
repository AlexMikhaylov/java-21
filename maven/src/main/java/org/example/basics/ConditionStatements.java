package org.example.basics;

public class ConditionStatements {

    private static void checkQuadratSquare(int area){

        if (area > 10_000)
            System.out.println("The area " + area + " of the square is larger that 10 000");

        System.out.println("This print out statement will always be printed");
    }

    private static int readInputSquareSize(){
        System.out.println("Enter the square size a:");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter the square size b:");
        int b = new java.util.Scanner(System.in).nextInt();

        return a * b;
    }

    public static void main(String[] args) {
        int area = readInputSquareSize();
        checkQuadratSquare(area);  // Call the method to check the area of the square
    }
}
