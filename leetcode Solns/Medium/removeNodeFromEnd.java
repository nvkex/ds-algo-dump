/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int removeNode(ListNode node, int n){
        if(node.next == null)
            return 0;
        int i = 1 + removeNode(node.next, n);
        if(i == n)
            node.next = node.next.next;
        return i;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(removeNode(head, n) ==n-1)
            return head.next;
        return head;
    }
}