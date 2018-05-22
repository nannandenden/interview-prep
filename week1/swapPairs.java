/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
        if (a == null || a.next == null) return a;
        ListNode odd = a;
        ListNode even = a.next;
        ListNode runner = new ListNode(even.val);
        ListNode head = runner;
        runner.next = new ListNode(odd.val);
        runner = runner.next;

        while (even.next != null && odd.next != null) {
            odd = odd.next.next;
            even = even.next.next;
            if (even != null && odd != null) {
                runner.next = new ListNode(even.val);
                runner = runner.next;
                runner.next = new ListNode(odd.val);
                runner = runner.next;
            } else {
                if (odd != null) {
                    runner.next = new ListNode(odd.val);
                }
                break;
            }
        }
        return head;
	}
}
