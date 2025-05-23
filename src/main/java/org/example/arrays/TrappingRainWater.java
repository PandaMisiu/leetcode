package org.example.arrays;

public class TrappingRainWater {
    public int trap(int[] height) {
        int length =  height.length;

        int left = 0, right = length-1;
        int leftMax = 0, rightMax = 0;
        int total = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax) leftMax = height[left];
                else total += leftMax - height[left];
                left++;
            } else {
                if(height[right]>=rightMax) rightMax = height[right];
                else total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}
