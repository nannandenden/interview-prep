/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
		// 1. split linked list into 2 lists
		ListNode[] lists = splitHalf(A);
		if(lists[0] == null || lists[1] == null) return lists[0];
		// 2. reverse the 2nd ListNode
		ListNode revNode = reverse(lists[1]);
		// 3. do the calculations
		ListNode sumLists[] = sumLists(lists[0], revNode);
		// 4. reverse the second list back
		ListNode revBack = reverse(sumLists[1]);
		// combine the two lists together
		ListNode connectNode = connectNode(sumLists[0], revBack);
		
		return connectNode;
    }
	
	public ListNode[] splitHalf(ListNode A) {
		int length = findLength(A); // 5
		int half = (length + 1)/2;  // (5 + 1) / 2 = 3
		ListNode list1 = null;
		ListNode list2 = null;
		list1 = A;
		while(half > 1) { 
			half--; // 2,1
			A = A.next; // 2, 3
		}
		list2 = A.next;
		A.next = null;
		return new ListNode[] {list1, list2};
	}
	
	int findLength(ListNode A) {
		int count = 0;
		while(A != null) {
			A = A.next;
			count++;
		}
		return count;
	}
	
	public ListNode[] sumLists(ListNode A, ListNode B) {
		ListNode runnerA = A;
		ListNode runnerB = B;
		while(A != null && B != null) {
			A.val = B.val - A.val;
			A = A.next;
			B = B.next;
		}
		return new ListNode[] {runnerA, runnerB};
	}
	
	public ListNode reverse(ListNode B) {
		ListNode currentHead = B;
		ListNode nextHead = null;
		ListNode prevHead = null;
		while(currentHead != null) {
			// save the next new head to neextHead
			nextHead = currentHead.next;
			// attach previous reversed head to current.next => create current reverse list
			currentHead.next = prevHead;
			// save the current reversed list as previous reversed list
			prevHead = currentHead;
			// get the next head to prepare for the node next reverse 
			currentHead = nextHead;
		}
		// assign latest reversed list to currentHead 
		currentHead = prevHead;
		return currentHead;
	}

	
	public ListNode connectNode(ListNode A, ListNode B) {
		if(A == null) return B;
		if(B == null) return A;
		ListNode head = A;
		while(A.next != null) {
			A = A.next;
		}	
		A.next = B;
		return head;
	}
}
