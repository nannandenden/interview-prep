/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    if(a == null || a.next == null) return null;
        Set<ListNode> set = new HashSet<>();
        while(a != null) {
            if(set.contains(a)) {
                return a;
            } else {
                set.add(a);
            }
            a = a.next;
        }
        return null;
	}
}
