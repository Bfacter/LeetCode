class Solution {
    public int largestAltitude(int[] gain) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=gain.length;
        pq.add(0);
        int a=0;
        for(int i =0;i<n;i++){
          a+=gain[i];
          pq.add(a);
        }
        int b=pq.peek();
        return b;
    }
}
