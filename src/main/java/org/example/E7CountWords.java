package org.example;

public class E7CountWords {

    public static int countWords(String sentence) {

        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {

        System.out.println(countWords("Hello, world!"));
    }
}
