package Leetcode.Leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
     int[] nums= {-2,3,4,-7,4,0};
        System.out.println(maximum(nums));
    }
    public static int maximum(int[] nums){
      int sum = 0,max =Integer.MIN_VALUE;
      for (int i =0;i< nums.length;i++){
          sum += nums[i];
          if(sum > max ) max = sum;
          if (sum<0) {
              sum = 0;
          }
      }
      return max;
    }
}
