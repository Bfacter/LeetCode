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
  class pair
	{
		int withRoot=0;
		int withoutRoot=0;
    }
		
class Solution {

    pair solve(TreeNode root) {
			if (root == null) {
				return new pair();
			}
			pair left = solve(root.left);
			pair right = solve(root.right);
			pair p = new pair();
			p.withRoot = root.val + left.withoutRoot + right.withoutRoot;
			p.withoutRoot = Math.max(left.withRoot, left.withoutRoot) + Math.max(right.withRoot, right.withoutRoot);
			return p;
		}
   

		public int rob(TreeNode root) {
			pair p = solve(root);
			return Math.max(p.withRoot, p.withoutRoot);
		}
}

