class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> result = new ArrayList<>();
        gen(result, new ArrayList<>(), candidates, 0, target);
        return result;
    }

    static void gen(List<List<Integer>> list, List<Integer> temp, int[] arr, int idx, int target) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue; 
            if (arr[i] > target) break; 
            temp.add(arr[i]);
            gen(list, temp, arr, i + 1, target - arr[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
