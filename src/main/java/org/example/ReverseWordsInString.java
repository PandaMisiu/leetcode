package org.example;

import java.util.Arrays;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[]words = s.trim().split("\\s+");

        int left = 0,right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        StringBuilder builder = new StringBuilder();
        for (int i =0;i<words.length;i++) {
            System.out.println("i: "+i+" "+words[i]);
            if(!words[i].isBlank()) {
                builder.append(words[i]);
            }
            if(i!=words.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

}
