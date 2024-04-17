class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = new ArrayList<>();
        gen(list,new ArrayList<>(),n,k,0,arr);
        return list;
    }
    static void gen(List<List<Integer>> list,List<Integer>temp,int target,int ele,int idx,int []arr){
        if(target==0&&ele==0){
            list.add(new ArrayList(temp));
            return;
        }
         for (int i = idx; i < arr.length; i++) {
            if (arr[i] > target) break;
            temp.add(arr[i]);
            gen(list, temp, target - arr[i], ele - 1, i + 1, arr);
            temp.remove(temp.size() - 1);
        }
    }

}

