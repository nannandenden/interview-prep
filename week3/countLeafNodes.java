class Solution {
	/**
	 * Write a program that takes as its input an instance of TreeNode representing the root of a tree and 
	 * returns a int value representing the number of nodes in the tree with no children. 
	 */
	public int countLeafNodes(TreeNode a) {
		if(a == null) return 0;
		if(a.left == null && a.right == null) return 1;
		
		return countLeafNodes(a.left) + countLeafNodes(a.right);
		
	}
}