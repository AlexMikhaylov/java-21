package org.example.basics;

public class ConsoleInputs {
    /*
    * Write: System.out, System.err
    * Read: System.in
    * */

    public static void main(String[] args) {
        // Scanner in jvm uses the local default system format for decimal delimiters
        // , separator for German system must be used
        // . separator for English system must be used
        System.out.println("Enter your name:");
        String name = new java.util.Scanner(System.in).nextLine(); // include delimiters
        //String name = new java.util.Scanner(System.in).next(); only first characters till the first delimiter (white space)
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter your calorie count:");
        double kcal = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Enter the number of products:");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println("Name: " + name + ", Calories: " + kcal + ", Products count: " + number);

        // different output
        System.out.println(kcal);
        System.out.printf("%f%n", kcal);
        System.out.printf("%.2f%n", kcal); // round to 2 decimal places
    }
}
