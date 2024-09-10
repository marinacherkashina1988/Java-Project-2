package org.example;

public class E3ReverseString {

    public static String reverse(String word) {

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));
    }
}
