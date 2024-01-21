package com.StringBuliderExample;

public class ReverseString {
    public static void main(String[] args) {

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("PoornimaKatti");

        // print string
        System.out.println("String = " + str.toString());
        //Create a copy, don't share the array

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());
    }
}
