package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] words = new String[numRows];
//        Arrays.fill(words, "");

        boolean increment = true;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            String word = Optional.ofNullable(words[counter]).orElse("");
            word += s.charAt(i);
            words[counter] = word;

            if (increment) {
                counter++;
            } else {
                counter--;
            }

            if (counter == numRows - 1 || counter==0) increment = !increment;
        }

        return Arrays.stream(words)
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }
}
