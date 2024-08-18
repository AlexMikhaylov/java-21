package org.example.oop;

import java.awt.*;
import java.util.Locale;

public class Examples {

    public static void main(String[] args) {
        // reference variable
        // class - Bauplan
        // object - abgeleitete Instanz des Baulpans
        // with "new" we can create objects of a class, new is a statement (Ausdruck)

        // Locale is deprecated since Java 19
        Locale loc = new Locale("en", "USA");
        Locale deLoc = new Locale("de");
        loc.setDefault(loc); // setDefault(Locale) is a static method defined inside Locale class but static method can be invoked using instance reference as well.
        System.out.println(deLoc); // de
        System.out.println(loc); // en_USA
        System.out.println(Locale.getDefault());; // en_USA

        // create an instance of Point class
        // from AWT library: Abstract Window Toolkit: Classes for graphic interfaces
        // Point defines coordinates on screen
        var point = new Point(); // constructor call: declaration and initialization
        System.out.println(point); // java.awt.Point[x=0,y=0] is a reference to the created object with default coordinates

        point.x = 10;
        System.out.println(point.x); // 10
        System.out.println(point.y); // 0

        point.setLocation(11, 22);
        System.out.println(point); // java.awt.Point[x=11,y=22] is string representation, toString() is redundant here because println() method calls the toString() method already, when a reference type is submitted

        // Point -> String -> int
        String stringPoint = point.toString();
        System.out.println(stringPoint.length()); // 25
        System.out.println(new Point().toString().length()); // 23

        //


        // The Polygon class encapsulates a description of a closed, two-dimensional region within a coordinate space.
        // reference type   object type
        var emptyPolygon =       new Polygon(); // Creates an empty polygon.
    }
}
