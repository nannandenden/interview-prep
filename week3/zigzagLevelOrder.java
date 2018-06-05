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
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    if(a == null) return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<TreeNode> rightToLeft = new Stack<>();
        Stack<TreeNode> leftToRight = new Stack<>();
        leftToRight.push(a);
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(a.val);
        result.add(newList);

        while(!leftToRight.isEmpty() || !rightToLeft.isEmpty()) {
            newList = new ArrayList<>();
            if(!leftToRight.isEmpty()) {
                while(!leftToRight.isEmpty()) {
                    TreeNode node = leftToRight.pop();
                    if(node.right != null) {
                        newList.add(node.right.val);
                        rightToLeft.push(node.right);
                    }
                    if(node.left != null) {
                        newList.add(node.left.val);
                        rightToLeft.push(node.left);
                    }
                }
            } else {
                while(!rightToLeft.isEmpty()) {
                    TreeNode node = rightToLeft.pop();
                    if(node.left != null) {
                        newList.add(node.left.val);
                        leftToRight.push(node.left);
                    }
                    if(node.right != null) {
                        newList.add(node.right.val);
                        leftToRight.push(node.right);
                    }
                }
            }
            if(!newList.isEmpty()) {
                result.add(newList);
            }
        }
        return result;
	}
}
