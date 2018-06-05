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
	public int isSameTree(TreeNode a, TreeNode b) {
        if(a == null && b ==  null) return 1;
        if(a == null || b == null) return 0;
        // at this point both are not null'

        return preOrder(a, b) == true ? 1 : 0;
    }

    private boolean preOrder(TreeNode a, TreeNode b) {
        if(a == null || b == null) {
            if(a == null && b == null) return true;
            return false;
        }
        if(a.val != b.val) return false;

        return preOrder(a.left, b.left) && preOrder(b.right, b.right);
    }
}
