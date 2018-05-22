/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode newHead = new RandomListNode(head.label);

        RandomListNode runnerOriginal = head;
        RandomListNode runnerCopy = newHead;
        map.put(runnerOriginal, runnerCopy);

        runnerOriginal = runnerOriginal.next;
        while(runnerOriginal != null) {
            RandomListNode temp = new RandomListNode(runnerOriginal.label);
            map.put(runnerOriginal, temp);
            runnerCopy.next = temp;
            runnerCopy = temp;
            runnerOriginal = runnerOriginal.next;
        }
        runnerOriginal = head;
        runnerCopy = newHead;
        while(runnerOriginal != null) {
            if(runnerOriginal.random != null) {
                runnerCopy.random = map.get(runnerOriginal.random);
            } else {
                runnerCopy.random = null;
            }
            runnerOriginal = runnerOriginal.next;
		    runnerCopy = runnerCopy.next;
        }
        return newHead;
    }
}
