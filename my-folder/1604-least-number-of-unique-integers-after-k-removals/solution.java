class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(mp.values());
        Collections.sort(values);
        int count = mp.size();
        for (int value : values) {
            if (k >= value) {
                k -= value;
                count--;
            } else {
                break;
            }
        }

        return count;

    }
}
