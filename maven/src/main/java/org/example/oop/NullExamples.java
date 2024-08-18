package org.example.oop;

import javax.swing.*;
import java.awt.*;

public class NullExamples {
    public static void main(String[] args) {
        Point p = new Point();
        Point nullPoint = null;
        String s = "";
        //s.length();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        //at org.example.oop.NullExamples.main(NullExamples.java:10)
        int i;
        if (s != null){
            System.out.println(s.length());
        }else {
            System.out.println("s == null");
        }
        System.out.println(nullPoint);

        // GUI input
        String input = JOptionPane.showInputDialog("Input");
        if (input != null)
            System.out.println(input.length()); // nullpointerexception if the dialog window is canceled or closed without input
    }
}
