class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   Arrays.sort(nums);
   gen(list,new ArrayList<>(),nums,0);
   return list;
    }
    static void gen(List<List<Integer>> list,List<Integer> temp,int [] arr,int idx){
       list.add(new ArrayList<>(temp));
       for(int i =idx;i<arr.length;i++){
        if(i > idx && arr[i] == arr[i-1]) continue;
        temp.add(arr[i]);
        gen(list,temp,arr,i+1);
        temp.remove(temp.size()-1);

       }
    }

    
}

