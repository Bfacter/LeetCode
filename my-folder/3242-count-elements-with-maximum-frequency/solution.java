class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int maxFrequency = 0;
        for (int frequency : hm.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        int count =0;
        for(int c:hm.values()){
            if(c==maxFrequency){
                count=count+maxFrequency;
            }
        }
        return count;
    }
}
