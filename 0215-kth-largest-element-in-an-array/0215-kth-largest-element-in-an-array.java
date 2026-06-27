class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(b,a));
        for(int i:nums){
            pq.offer(i);
        }
        while(k != 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}