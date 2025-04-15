package org.example;

import com.sun.jdi.IntegerType;

import java.util.*;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> seen = new TreeSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        int maxSeq = 1;
        int currSeq = 1;

        Iterator<Integer> it = seen.iterator();
        int prevVal = it.next();

        while (it.hasNext()) {
            int val = it.next();
            if (val == prevVal + 1) {
                currSeq++;
            } else {
                maxSeq = Math.max(maxSeq, currSeq);
                currSeq = 1;
            }
            prevVal = val;
        }
        maxSeq = Math.max(maxSeq, currSeq);

        return maxSeq;
    }
}
