class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k); 
        
        for (int n : nums) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll(); 
            }
        }
        return queue.peek();
    }
}