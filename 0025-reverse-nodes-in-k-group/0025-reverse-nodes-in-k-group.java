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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevLast = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode kth = findkNode(curr, k);

            if (kth == null)
                break;

            ListNode nextGroup = kth.next;

            kth.next = null;

            ListNode newHead = reverse(curr);

            if (curr == head) {
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            curr.next = nextGroup;

            prevLast = curr;
            curr = nextGroup;
        }
        return head;
    }

    public ListNode findkNode(ListNode head, int k) {
        ListNode curr = head;
        int c = 1;
        while (c != k && curr != null) {
            curr = curr.next;
            c++;
        }
        return curr;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}