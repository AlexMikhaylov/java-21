package org.example.basics;

public class StringsConcatenation {
    public static void main(String[] args) {
        System.out.println(1 + 2 + "ABC"); // 3ABC
        System.out.println("ABC" + 1 + 2); // ABC12
        System.out.println(1 +2 + "ABC" + (1 + 2)); // 3ABC3
        System.out.println(1 +2 + "ABC" + 1 + 2); // 3ABC12

        //

        System.out.println("Boolean: " + true + ", " + false + ", " + (2 < 10)); //

        //

        System.out.println('a' + 0); // 97
        System.out.println('b' + 0); // 98
        System.out.println('a' + 'b'); // 195
        System.out.println("" + 'a' + 'b'); // ab
    }
}
