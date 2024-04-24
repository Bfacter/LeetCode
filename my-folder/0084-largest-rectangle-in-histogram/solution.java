import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
	     
	     int [] ps = previousSmaller(arr,n);
	     int [] ns = nextSmaller(arr,n);
	     int ans = 0;
	    
	     for (int i = 0; i < arr.length; i++) {
			int length = ns[i] - ps[i] - 1; 
			int area = arr[i] * length;
			ans = Math.max(ans, area);
		}
	     return ans;
    }
    
    public static int[] nextSmaller(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ns = new int[n];
        ns[n-1]=n;
        s.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (!s.empty()) {
                ns[i] = s.peek();
            } else {
                ns[i] = n;
            }
            s.push(i);
        }
        ns[n - 1] = n;
        return ns;
    }

    public static int[] previousSmaller(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ps = new int[n];
        s.push(0);
        for (int i = 1; i < n; i++) {
            while (!s.empty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (!s.empty()) {
                ps[i] = s.peek();
            } else {
                ps[i] = -1;
            }
            s.push(i);
        }
        ps[0] = -1;
        return ps;
    }
}

