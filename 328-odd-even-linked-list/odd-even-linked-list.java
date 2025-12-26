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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
    return head;

        ListNode l = new ListNode();
        ListNode head2 = l;
        ListNode p = head.next;
        ListNode prev = head;
        int i = 2;
        while(p != null)
        {
            if(i%2 == 0)
            {
                l.next = p;
                l = l.next;
                prev.next = p.next;
                p = prev.next;
                i++;
            }
            else{
                prev = p;
                p = p.next;
                i++;
            }
        }
        l.next = null;
        prev.next = head2.next;
        return head;
    }
}