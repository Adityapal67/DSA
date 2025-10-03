package Leetcode.Leetcode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
     int[] nums ={3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      int[] arr ={-1,-1};
      for (int i = 0;i< nums.length;i++){
          map.put(nums[i], i );
      }
      for(int i = 0;i< nums.length;i++){
          if(map.containsKey(target-nums[i]) && map.get(target-nums[i]) != i){
              arr[0] = i;
              arr[1]=map.get(target-nums[i]);
              break;
          }
      }
      return arr;
    }
}
