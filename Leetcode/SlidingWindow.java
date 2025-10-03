package Leetcode.Leetcode;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,10};
        int sum = 14;
        System.out.println(LongestSubArray(arr , sum));
    }
    public static int LongestSubArray(int[] arr , int k){
        int l = 0 ,r = 0,sum = 0,max = 0, n = arr.length;
        while(r<n){
            sum = sum + arr[r];
            while(sum>k){
                sum = sum - arr[l];
                l = l+1;
            }
            if(sum<=k){
                 max = Math.max(max , r-l+1);
                 r =r+1;
            }
        }
        return max;
    }
}
