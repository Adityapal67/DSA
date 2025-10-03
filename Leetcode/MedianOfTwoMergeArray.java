package Leetcode.Leetcode;

import java.util.Arrays;
import java.util.Spliterator;

public class MedianOfTwoMergeArray {
    public static void main(String[] args) {
    int[] nums1={1,2};
    int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length+ nums2.length;
       int sum = 0;
        int[] merge = new int[nums1.length+ nums2.length];
        System.arraycopy(nums1 , 0 ,merge , 0 ,nums1.length);
        System.arraycopy(nums2 , 0 ,merge , nums1.length ,nums2.length);
        Arrays.sort(merge);
        if (n % 2 == 1) {
            return merge[n / 2]; // middle element
        } else {
            return (merge[n / 2 - 1] + merge[n / 2]) / 2.0; // avg of two middle
        }
    }
}
