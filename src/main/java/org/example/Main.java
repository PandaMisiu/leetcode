package org.example;

public class Main {
    public static void main(String[] args) {
//        int []nums1 = {1,2,3,0,0,0};
//        int []nums2 = {2,5,6};
//        int m = 3,n=3;
////        int []nums1 = {2,0};
////        int []nums2 = {1};
////        int m = 2,n=1;
//        MergeSortedArrays.merge(nums1,m,nums2,n);

//        int []nums = {0,0,1,1,1,2,2,3,3,4};
////        int []nums = {1};
//        int k = RemoveDuplicatesSortedArray.removeDuplicates(nums);
//        System.out.println("\n"+k);

        int []nums = {2,2,1,1,1,2,2};
        int result = MajorityElement.majorityElement(nums);
        System.out.println(result);
    }
}