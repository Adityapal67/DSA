package Leetcode.Leetcode;

import java.util.Arrays;

public class FirstAndLastPositiveInteger {
    public static void main(String[] args) {
     int[] nums = {5,7,7,8,8,10};
     int[] ans = searchRange(nums,6);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
                int first = findBound(nums, target, true);
                int last = findBound(nums, target, false);
                return new int[]{first, last};
    }
    public static int findBound(int[] nums, int target, boolean isFirst) {
                int left = 0, right = nums.length - 1, ans = -1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (nums[mid] == target) {
                        ans = mid;
                        if (isFirst) {
                            right = mid - 1; // keep searching left
                        } else {
                            left = mid + 1; // keep searching right
                        }
                    } else if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                return ans;
            }



}
