class Solution {
    public int minOperations(int[] nums, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int num : nums){
             pq.offer(num);
         }
        int count =0;
        while (!pq.isEmpty() && pq.peek() < k) {
            int smallest = pq.poll();
            int nextSmallest = pq.isEmpty() ? k : pq.peek();
            int diff = k - smallest;
            count ++;
            pq.offer(smallest + diff);
        }
        return count;
    }
}
