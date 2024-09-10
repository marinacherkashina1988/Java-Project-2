package org.example;

import java.util.ArrayList;
import java.util.List;

public class E8SortingWords {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        String[] array = {"Apple", "Banana", "Kiwi", "Anaconda", "Africa", "Chicken"};

        for (String word : array) {
            if (word.startsWith("A")) {
                words.add(word);
            }
        }
        words.toString().toLowerCase();
        System.out.println(words);
    }
}
