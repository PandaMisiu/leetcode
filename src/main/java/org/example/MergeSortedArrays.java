package org.example;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mindex = m-1;
        int nindex = n-1;
        int right = m+n-1;

        while(nindex>=0){
            if(mindex>=0 && nums1[mindex] > nums2[nindex]){
                nums1[right] = nums1[mindex];
                mindex--;
            } else{
                nums1[right] = nums2[nindex];
                nindex--;
            }
            right--;
        }


        for(int i =0 ;i<m+n;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}
