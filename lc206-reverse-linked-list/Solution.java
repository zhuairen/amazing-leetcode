/**
 * 反转链表 leetcode 206
 * https://leetcode.com/problems/reverse-linked-list/
 *
 */
public class Solution {


    /**
     *  
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
