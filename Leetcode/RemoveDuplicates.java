package Leetcode.Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(unique(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int unique(int[] nums){
     int i = 0 ,j = 1,count = 1;
     while (j< nums.length){
         if(nums[i] != nums[j]){
             count++;
             nums[i+1] = nums[j];
             i++;
             j++;
         }
         else {
             j++;
         }
     }
     return count;
    }
}
