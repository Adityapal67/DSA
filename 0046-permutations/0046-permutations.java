class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, result, new ArrayList<>(),
                  new boolean[nums.length]);

        return result;
    }

    private void backtrack(int[] nums,
                           List<List<Integer>> result,
                           List<Integer> curr,
                           boolean[] used) {

        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            used[i] = true;
            curr.add(nums[i]);

            backtrack(nums, result, curr, used);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}