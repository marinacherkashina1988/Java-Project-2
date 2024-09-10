package org.example;

public class E2CountAlphaCharacters {

    public static void main(String[] args) {
        //Find out how many alpha characters are present in a string?

        String s = "S2y5^%nt8>Ax";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
