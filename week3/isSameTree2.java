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
        return isSameTreeHelper(a, b) == true ? 1 : 0;
    }

    private boolean isSameTreeHelper(TreeNode a, TreeNode b) {
        // go through left, mid, right 
    if(a == null && b != null || a != null && b == null) return false;
    if(a == null && b == null) return true;
    
    
    if(a.val == b.val) return isSameTreeHelper(a.left, b.left) && isSameTreeHelper(a.right, b.right);
    
    return false;
    }
}
