package org.example;

import java.util.HashMap;

public class E9NonRepeatingCharacters {

    public static void main(String[] args) {
        //Find the First Non-Repeating Character in a String:
        // Given a string, find and return the first non-repeating character.
        // For example, in the string "abracadabra", the first non-repeating character is 'c'.

        String str = "abracadabra";

        for (int i = 0; i < str.length(); i++) {

            boolean singleCharacter = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    singleCharacter = false;
                }
            }
            if (singleCharacter) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
