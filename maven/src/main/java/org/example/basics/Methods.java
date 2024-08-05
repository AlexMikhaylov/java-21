package org.example.basics;

public class Methods {
    public static void main(String[] args) {
        Lines.lines();
    }
}

class Lines {
    static void lines(){
        for (int i = 0; i < 10; i++) {
            printHeart();
        }
    }

    private static void printHeart(){
        System.out.print("*");
    }
}
