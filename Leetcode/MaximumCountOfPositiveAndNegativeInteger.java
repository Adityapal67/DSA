package Leetcode.Leetcode;

public class MaximumCountOfPositiveAndNegativeInteger {
    public static void main(String[] args) {
      int[][] nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
      int ans = maximumCount(nums);
        System.out.println(ans);
    }
    public static int maximumCount(int[][] nums) {
        int pos = 0;
        int neg = 0;
        for(int[] n:nums){
            for(int num: n){
            if(num<0) neg++;
            }
        }
        return Math.max(pos,neg);
    }
}
