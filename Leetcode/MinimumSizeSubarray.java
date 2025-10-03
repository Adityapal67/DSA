package Leetcode.Leetcode;

import java.util.Iterator;
import java.util.Map;

public class MinimumSizeSubarray {
    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
       int l = 0, r =0,minlength = Integer.MAX_VALUE,length = 0;
       int sum = 0;
       for (r =0;r< nums.length;r++) {
           sum += nums[r];

           while (sum>=target) {
                   length = r-l+1;
                   minlength = Math.min(minlength,length);
                   sum -= nums[l];
                   l++;
           }
       }
       return (minlength == Integer.MAX_VALUE)?0:minlength;
    }
}
