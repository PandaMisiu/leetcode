package org.example;

import java.util.*;

public class GroupAnagrams {
    // BARDZO WOLNE 1035 ms
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())return false;
//        char []sChars = s.toCharArray();
//        char []tChars = t.toCharArray();
//
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//
//        return Arrays.equals(sChars, tChars);
//    }
//
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> anagrams = new ArrayList<>();
//        boolean []disabledIndexes = new boolean[strs.length];
//        for(int i = 0;i<strs.length;i++){
//            if(disabledIndexes[i]) continue;
//            String currStr = strs[i];
//            List<String> matchedAnagrams = new ArrayList<>();
//            matchedAnagrams.add(currStr);
//            disabledIndexes[i] = true;
//            for(int k=i+1;k<strs.length;k++){
//                if(isAnagram(currStr,strs[k]) && !disabledIndexes[k]) {
//                    matchedAnagrams.add(strs[k]);
//                    disabledIndexes[k] = true;
//                }
//            }
//            anagrams.add(matchedAnagrams);
//        }
//        return anagrams;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String str : strs) {
            char [] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);

            if(!anagrams.containsKey(sortedStr)){
                anagrams.put(sortedStr,new ArrayList<>());
            }

            anagrams.get(sortedStr).add(str);

        }
        return new ArrayList<>(anagrams.values());
    }
}
