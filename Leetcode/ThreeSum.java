package Leetcode.Leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
      int[] nums ={-1,0,1,2,-1,4};
        System.out.println(tsum(nums));
    }
    public static List<List<Integer>> tsum(int[] nums){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> mainList = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0 , j = 1 ,ele;
        while( j < nums.length){
            if(map.containsKey(-1*(nums[i]+nums[j]))){
                ele = map.get(-1*(nums[i]+nums[j]));
                if(list.contains(nums[i]) && list.contains(nums[j]) && list.contains(ele) ) {
                    i++;
                    j++;
                    break;
                }
                else {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(ele);
                }
            }
            else {
                map.put(nums[i] , i);
                map.put(nums[j],j);
                i++;
                j++;
            }
        }
        mainList.add(list);
        return mainList;
    }
}
