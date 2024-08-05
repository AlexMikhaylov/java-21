package org.example.basics;

public class OverridingMethods {
    public static void main(String[] args) {
        lines(14, '*');
        lines(10);

        System.out.println(random());
        System.out.println(random(200.0));
        System.out.println(random(100, 200));
        System.out.println(random(100.0, 200.0));
    }

    static double random(){
        return Math.random();
    }

//    doesn't work:
//    static void random(){
//        Math.random();
//    }

    static double random(int min, int max){
        return Math.random() * (max - min) + min;
    }

    static double random(double min, double max){
        return Math.random() * (max - min) + min;
    }


    static double random(double max){
        return Math.random() * max;
    }

    // Optional parameter workaround
    static void lines(int length){
        lines(length, '#');
    }

    static void lines(int length, char c){
        // repeat() function since Java 11
        System.out.println(("" + c).repeat(length));
    }


}
