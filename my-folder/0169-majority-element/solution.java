class Solution {
    public int majorityElement(int[] nums) {
        int n1=-1;
        Map<Integer,Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:m.entrySet()){
           if(entry.getValue()>nums.length/2){
               n1= entry.getKey();
           }
        }
     return n1;
    }
}
