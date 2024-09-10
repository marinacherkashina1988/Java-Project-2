package org.example;

public class E4Palindrome {
    public static void main(String[] args) {

        String word = "level";

        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();

        String reversed = sb.toString();

        if (word.equalsIgnoreCase(reversed)){
            System.out.println("The given word is palindrome");
        } else {
            System.out.println("Try another word");
        }
    }
}
