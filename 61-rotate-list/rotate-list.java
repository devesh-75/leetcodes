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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode s = head;
        ListNode l = head;
        int count = 1;
        while(s.next !=null)
        {
            count++;
            s = s.next;
        }
        k = k % count;
        int n = count - k  -1;
        s.next = head;
        while(n-- > 0)
        {
            l = l.next;
        }
        head = l.next;
        l.next = null;
        return head;
    }
}