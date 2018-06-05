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
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	     if(a == null) return null;
        
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode current = a;
        while(current != null) {

            stack.push(current);
            current = current.left;
        }

        while(stack.size() > 0) {
            current = stack.pop();
            result.add(current.val);

            if(current.right != null) {
                current = current.right;
                while(current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }
        }
        return result;
	}
}
