package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(!seen.containsKey(nums[i])){
                seen.put(nums[i], i);
            } else{
                int prevValIndex = seen.get(nums[i]);
                if(Math.abs(prevValIndex - i)<=k) return true;
                else {
                    seen.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
