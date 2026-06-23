class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,candidates,target);
        return result;
    }
    public void backtrack(List<List<Integer>> result ,List<Integer> l,int start,int[] nums,int t){
         if(t == 0){
            result.add(new ArrayList(l));
         }
         if(t<0) return;
         for(int i = start;i<nums.length;i++){
            l.add(nums[i]);
            backtrack(result,l,i,nums,t-nums[i]);
            l.remove(l.size()-1);
         }
    }
}