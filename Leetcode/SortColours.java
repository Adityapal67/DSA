package Leetcode.Leetcode;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
     int[] nums={2,0,2,1,1,0};
     Colors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void Colors(int[] nums) {
//        for(int i = 0;i<nums.length-1;i++){
//            int minIndex= i;
//            for(int j = i+1 ;j < nums.length;j++){
//                if(nums[j]<nums[minIndex]) minIndex = j;
//            }
//            int t = nums[i];
//            nums[i]= nums[minIndex];
//            nums[minIndex] = t;
//        }
        //Dutch Naitional Flag Algorithm
        int low = 0,mid =0,high = nums.length-1;
        while (mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            else if (nums[mid]== 2) {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
