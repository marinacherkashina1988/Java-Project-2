package org.example;

public class E6CountVowels {

    public static int countVowels(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Create a method to count how many vowels are present in a string “documentation”

        System.out.println(countVowels("documentation"));
    }
}
