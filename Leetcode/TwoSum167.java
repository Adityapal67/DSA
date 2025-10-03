package Leetcode.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum167 {
    public static void main(String[] args) {
     int[] arr ={1, 3, 5, 7, 10};
        System.out.println(Arrays.toString(twoSum(arr,17)));
    }
    public static int[] twoSum(int[] numbers, int target){
        int left = 0,right = numbers.length-1;
        int sum = 0;
        int[] arr = new int[2];
        while(left<right){
            sum = numbers[left]+numbers[right];
            if(sum<target) left++;
            else if(sum>target) right--;
            else if(sum == target){
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }

        }
        return arr;
    }
}
