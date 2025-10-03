package Leetcode.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1};
        rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        k = k% nums.length;
        int n = nums.length-k;
        reverse(nums,n,nums.length-1);
        reverse(nums,0,n-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums , int s , int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
