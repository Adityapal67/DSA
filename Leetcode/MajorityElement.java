package Leetcode.Leetcode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
      int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
    public static int majority(int[] nums){
      int ele = 0 , count = 0;
      for(int i = 0;i< nums.length;i++){
          if(count==0){
              ele = nums[i];
              count++;
          }
          else if (nums[i] == ele) {
              count++;
          }
          else count--;
      }
      int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]== ele) c++;
        }
        if(c>= nums.length/2) return ele;
        return -1;
    }

}
