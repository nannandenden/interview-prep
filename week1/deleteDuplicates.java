/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    if (a == null || a.next == null) return a;
        ListNode head = a;
        while (a.next != null) {
            if (a.val == a.next.val) {
                if (a.next.next == null) {
                    a.next = null;
                } else {
                    a.next = a.next.next;
                }
            } else {
                a = a.next;
            }
        }
        return head;
	}
}
