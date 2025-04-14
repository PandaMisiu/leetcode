package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (k == 0) return;

        int[] lastK = Arrays.copyOfRange(nums, len - k, len);
        int[] firstPart = Arrays.copyOfRange(nums, 0, len - k);

        System.arraycopy(lastK, 0, nums, 0, k);
        System.arraycopy(firstPart, 0, nums, k, len - k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
