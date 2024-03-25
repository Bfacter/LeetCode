class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                duplicates.add(key);
            }
        }

        return duplicates;
    }
    }

