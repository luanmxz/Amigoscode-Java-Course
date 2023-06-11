package com.br.luanmarcene;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        byte testByte = 10;
        short testByteToShort = testByte;

        short testShort = 10;
        /* byte testShortToByte = testShort;
           Doesn't work because the size of byte is smaller than short. Only works if the size of the type that is receiving
           the value/reference is bigger than the type of the value/reference.
         */

        int testInt = 10;
        long testIntToLong = testInt;

        long testLong = 10L;
        //int testLongToInt = testLong; The same case of testShortToByte above.
    }
}