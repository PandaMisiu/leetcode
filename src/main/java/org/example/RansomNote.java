package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> occurences = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            int currentValue = Optional.ofNullable(occurences.get(ransomNote.charAt(i))).orElse(0);
            occurences.put(ransomNote.charAt(i),++currentValue);
        }

        for(int i=0;i<magazine.length();i++){
            int currentValue = Optional.ofNullable(occurences.get(magazine.charAt(i))).orElse(0);
            occurences.put(magazine.charAt(i),--currentValue);
        }

        for(int val : occurences.values()){
            if(val>0) return false;
        }
        return true;
    }
}
