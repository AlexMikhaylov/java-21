package org.example.basics;

public class BinaryOperators {

    public static void main(String[] args) {
        // 0x - hexadecimal
        // 0b - binary
        int binary1 = 0b10101010;
        int binary2 = 0b11010100;

        // decimal output
        System.out.println( binary1 + " " + binary2);

        // ~ means conversion 0->1 and 1->0
        System.out.println(Integer.toBinaryString(binary1)); // 00000000000000000000000010101010
        System.out.println(Integer.toBinaryString(~binary1)); // 11111111111111111111111101010101

        // & | ^
        System.out.println(Integer.toBinaryString( binary1 & binary2 )); // AND 10000000
        System.out.println(Integer.toBinaryString( binary1 | binary2 )); // OR 11111110
        System.out.println(Integer.toBinaryString( binary1 ^ binary2 )); // XOR 01111110

        // << >> >>>
        System.out.println(Integer.toBinaryString(binary1) + " is " + binary1 + " in decimal");                  //  10101010
        System.out.println(Integer.toBinaryString(binary1 << 1)  + " is " + (binary1 << 1) + " in decimal");  //  101010100
        System.out.println(Integer.toBinaryString(binary1 << 2)   + " is " + (binary1 << 2) + " in decimal"); // 1010101000
        System.out.println(Integer.toBinaryString(binary1 >> 1)   + " is " + (binary1 >> 1) + " in decimal"); //    1010101
        System.out.println(Integer.toBinaryString(binary1 >> 2)  + " is " + (binary1 >> 2) + " in decimal");  //     101010

        // task: we get an output and want to keep the last 8 bits only
        // example 0010_1010_0110_0101 -> 0110_0101
        System.out.println(Integer.toBinaryString(getFirst8BitsBinary(0b0010_1010_0110_0101)));
        System.out.println(Integer.toBinaryString(getFirst8BitsHex(0b0010_1010_0110_0101)));

        byte b = (byte) 0b1110_1010;
        System.out.println(Integer.toBinaryString(getLast4BitsBinary(b)));

        // bits methods in the Integer class
        Integer.toBinaryString(10);
        Integer.bitCount(10);
        Integer.highestOneBit(10);
        Integer.lowestOneBit(10);
        Integer.compare(10, 11);
        Integer.numberOfLeadingZeros(10);
        Integer.numberOfTrailingZeros(10);
    }

    private static int getFirst8BitsBinary(int input){
        return input & 0b1111_1111;
    }

    private static int getFirst8BitsHex(int input){
        return input & 0xff;
    }

    private static byte getLast4BitsBinary(byte input){
        return (byte) ((input >> 4) & 0b1111);
    }
}
