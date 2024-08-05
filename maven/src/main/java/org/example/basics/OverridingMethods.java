package org.example.basics;

public class OverridingMethods {
    public static void main(String[] args) {
        lines(14, '*');
        lines(10);

        random();
        random(100, 200);
        random(100, 200, 2);
        random(100.0, 200.0, 3);

    }

    static double random(){
        return Math.random();
    }

    static double random(int min, int max){
        return Math.random() * (max - min) + min;
    }

    static double random(double min, double max){
        return Math.random() * (max - min) + min;
    }

    static double random(int min, int max, int precision){
        return Math.round(Math.random() * (max - min) + min) / Math.pow(10, precision);
    }

    static double random(double min, double max, int precision){
        return Math.round(Math.random() * (max - min) + min) / Math.pow(10, precision);
    }

    static double random(double max){
        return Math.random() * max;
    }

    // Optional parameter
    static void lines(int length){
        lines(length, '#');
    }

    static void lines(int length, char c){
        System.out.println(("" + c).repeat(length));
    }


}
