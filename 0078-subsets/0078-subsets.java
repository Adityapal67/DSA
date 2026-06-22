class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(result,new ArrayList<>(),0,nums);
        return result;
    }
    public static void sub(List<List<Integer>> ls ,List<Integer> l,int start,int[] nums){
        ls.add(new ArrayList(l));
        for(int i=start;i<nums.length;i++){
            l.add(nums[i]);
            sub(ls,l,i+1,nums);
            l.remove(l.size()-1);
        }
    }
}