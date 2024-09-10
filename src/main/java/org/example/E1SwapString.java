package org.example;

public class E1SwapString {
    public static void main(String[] args) {
        //Write a program to swap 2 String without a temporary variable?

        String s1 = "Hello";
        String s2 = "Syntax";

        s1 = s1.concat(s2);
        s2 = s1.substring(0,5);
        s1 = s1.substring(5,11);

        System.out.println(s1);
        System.out.println(s2);
    }
}
