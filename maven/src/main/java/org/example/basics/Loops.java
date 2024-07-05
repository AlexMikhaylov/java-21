package org.example.basics;

public class Loops {

    private static void demoDoWhileLoop() {
        // This loop will execute at least once
        // and then continue until the condition becomes false
        /*
         * Syntax:
         * do Statement while (condition)
         * */
        int counter = 0;
        double sum = 0;
        double random;
        do { // all declared variables here are valid inside this scopes only
            random = Math.random();
            sum += random;
            System.out.println("Counter: " + counter);
            System.out.println("Random value: " + random);
            System.out.println("Sum: " + sum);
            counter++;
        } while (random > 0.1);
        System.out.println("Do While Loop ended");

    }

    private static void demoWhileLoop() {
        // This loop will execute until the condition becomes false
        /*
         * Syntax:
         * Statements Block
         * while (condition)
         *     Statements Block
         * */
        int counter = 0;
        double sum = 0;
        double random = Math.random();
        while (random > 0.1) { // all declared variables here are valid inside this scopes only

            sum += random;
            System.out.println("Counter: " + counter);
            System.out.println("Random value: " + random);
            System.out.println("Sum: " + sum);
            random = Math.random();
            counter++;
        }
        System.out.println("While Loop ended");
    }

    private static void demoForLoop() {
        // This loop will execute a specific number of times
        /*
         * Syntax:
         * for (initialization; condition; increment/decrement)
         *     Statement
         *
         * for (;;){} is an endless loop == for (;true;){}
         * */
        for (int i = 0; i < 10; i++) { // all declared variables here are valid inside this scopes only
            System.out.println("Counter: " + i);
        }
        System.out.println("For Loop ended");

        // example with two conditional variables
        // each segment is independent of the other
        for(int x = 0, y = 0; Math.random() > 0.1; x++, y+= (int) (Math.random() * 100)){
            System.out.println(x + " " + y);
        }
    }

    private static void demoComplexForLoop(){

    }

    private static void howManyDigitsHasNumber(int number){
        int count = 0;
        int initialNumber = number;
        while(number>=0){
            number /= 10;
            count++;
            if(number == 0){
                break;
            }
        }
        System.out.println("Number " + initialNumber + " has " + count + " digits.");
    }

    private static void demoBreakAndContinueForLoop(){
        // break statement will terminate the current loop
        // continue statement will skip the current iteration and continue with the next one
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println("Even number: " + i);
                continue;
            }
            System.out.println("Odd number: " + i);
            if(i == 51){
                break;
            }
        }
        System.out.println("Loop ended");
    }

    private static void demoBreakAndContinueWhileLoop(){
        int i = 0;
        while(true){
            if(i % 2 == 0){
                System.out.println("Even number: " + i);
                i++;
                continue;
            }
            System.out.println("Odd number: " + i);
            if(i == 51){
                break;
            }
            i++;
        }
        System.out.println("Loop ended");
    }

    public static void main(String[] args) {
        demoDoWhileLoop();
        demoWhileLoop();
        howManyDigitsHasNumber(12345);
        demoBreakAndContinueWhileLoop();
        demoForLoop();
    }
}
