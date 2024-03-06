class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
         List<Boolean> ans = new ArrayList<>();
         int n = candies.length;
         int max=-1;
         for(int i =0;i<n;i++){
             max = Math.max(max,candies[i]);
             candies[i]+=extraCandies;
         }

         for(int i =0;i<n;i++){
             if(max>candies[i]){
                 ans.add(false);
             }else{
                 ans.add(true);
             }
         }

         return ans;
          

    }
}
