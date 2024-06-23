package org.example.new21;

// https://openjdk.org/jeps/430
// this is a preview feature

/**
 * This class demonstrates the usage of Java 21's String Templates feature.
 */
public class StringTemplates {

    // Simple greeting message example
    static String name = "Alexander";
    static int age = 38;

    /**
     * A greeting message using Java 21's String Templates feature.
     *
     */
    static String greeting = STR."Hello, \{name}! You are \{age} years old.";

    // Using multi-line string template to create an HTML document
    static String title = "My Web Page";
    static String text = "Hello, world";

    /**
     * An HTML document created using Java 21's String Templates feature.
     *
     */
    static String html = STR."""
            <html>
              <head>
                <title>\{title}</title>
              </head>
              <body>
                <p>\{text}</p>
              </body>
            </html>
            """;

    /**
     * The main method to demonstrate the usage of the greeting and HTML document.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Output the greeting message
        System.out.println(greeting);
        // Output the HTML document
        System.out.println(html);
    }
}
