/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int hasPathSum(TreeNode a, int b) {
    		
    		return hasPathSumHelper(a, b) ? 1 : 0;
	}

	private boolean hasPathSumHelper(TreeNode node, int sum) {
		if (node == null) {
			return (sum == 0);
		} else {
            boolean ans = false;
  
            /* otherwise check both subtrees */
            int subsum = sum - node.val;
            if (subsum == 0 && node.left == null && node.right == null)
                return true;
            if (node.left != null)
                ans = ans || hasPathSumHelper(node.left, subsum);
            if (node.right != null)
                ans = ans || hasPathSumHelper(node.right, subsum);
            return ans;
        }
	}
}
