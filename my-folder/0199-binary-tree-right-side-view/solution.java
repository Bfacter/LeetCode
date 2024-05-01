/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        List<Integer> mainAns = new ArrayList<>();

        if (root == null) {
            return mainAns;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode x = q.peek();
            q.poll();

            if (x != null) {
                ans.add(x.val);
                if (x.left != null) {
                    q.add(x.left);
                }
                if (x.right != null) {
                    q.add(x.right);
                }
            } else {
                Collections.reverse(ans);
                int last = ans.get(0);
                mainAns.add(last);
                ans.clear();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }

        }
        return mainAns;

    }
}
