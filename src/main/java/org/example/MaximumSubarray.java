package org.example;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int maxEnd = nums[0], maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxEnd + nums[i] > nums[i]) maxEnd += nums[i];
            else maxEnd = nums[i];

            if(maxEnd > maxSum) maxSum = maxEnd;
        }

        return maxSum;
    }
}
