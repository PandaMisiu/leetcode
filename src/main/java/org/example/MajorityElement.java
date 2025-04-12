package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement {
    // ZASKAKUJĄCO SZYBKIE
//    public static int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> occurences  = new HashMap<>();
//
//        for(int i=0;i<nums.length;i++){
//            int currentNum = nums[i];
//
//            int currentValue = Optional.ofNullable(occurences.get(currentNum)).orElse(0);
//            occurences.put(currentNum, currentValue+1);
//        }
//
//        return Collections.max(occurences.entrySet(), Map.Entry.comparingByValue()).getKey();
//
//
//    }

    // WOLNE I DUŻO PAMIĘCI
//    public static int majorityElement(int[] nums) {
//        int length = nums.length;
//        int threshold = length % 2 == 0 ? length/2 : length/2+1;
//        for(int num : nums){
//            int occurences = 1;
//            for(int i=0;i<nums.length;i++){
//                if(nums[i] == num){
//                    occurences++;
//                }
//            }
//            if(occurences > threshold) return num;
//        }
//        return 0;
//    }

    public static int majorityElement(int []nums){
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
