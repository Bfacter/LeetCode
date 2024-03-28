class Solution {
    public List<List<String>> partition(String s) {
        List<String> a = new ArrayList<>();
		List<List<String>> b = new ArrayList<>();
		parti(s,0,a,b);
		return b;

    }
   static void parti(String s, int i, List<String> a, List<List<String>> b) {
        if (i == s.length()) {
            b.add(new ArrayList<>(a));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String x = s.substring(i, j + 1);
            if (Palindrome(x)) {
                a.add(x);
                parti(s, j + 1, a, b);
                a.remove(a.size() - 1);
            }
        }
    }

    public static boolean Palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
