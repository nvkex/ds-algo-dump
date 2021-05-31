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
    public ListNode swap(ListNode head, ListNode prev){
        if(head == null || head.next == null)
            return head;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        if(prev != null)
            prev.next = temp;
        swap(head.next, head);
        return temp;
    }
    public ListNode swapPairs(ListNode head) {
        return swap(head, null);
    }
}