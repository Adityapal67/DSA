package Leetcode.Leetcode;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
     int[] h ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h));
    }
    public static int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int min = -1,dis =-1,area = 0,max = 0;
        while (left<right){
            min = Math.min(height[left], height[right]);
            dis = (right+1) - (left+1);
            area = min*dis;
            max = Math.max(area , max);
            if(height[left]<height[right]) left += 1;
            else right--;
        }
        return max;
    }
}
