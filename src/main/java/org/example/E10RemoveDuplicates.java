package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E10RemoveDuplicates {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?

        List<String> duplicates = new ArrayList<>();
        duplicates.add("Asghar");
        duplicates.add("Moazzam");
        duplicates.add("Asel");
        duplicates.add("Asghar");
        duplicates.add("Subair");

        for (int i = 0; i < duplicates.size(); i++) {
            for (int j = i + 1; j < duplicates.size(); j++) {
                if (duplicates.get(i).equals(duplicates.get(j))) {
                    duplicates.remove(j);
                    j--;
                }
            }
        }

        System.out.println(duplicates);
    }
}
