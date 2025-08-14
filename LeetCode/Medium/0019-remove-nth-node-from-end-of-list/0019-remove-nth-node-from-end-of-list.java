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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        int step = 0;

        while(fast.next != null) {
            fast = fast.next;
            if(step >= n) {
                slow = slow.next;
            }
            step++;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}