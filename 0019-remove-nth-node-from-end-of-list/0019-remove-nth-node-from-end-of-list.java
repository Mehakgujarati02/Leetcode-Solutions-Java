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
        
        ListNode ptr = head;
        ListNode temp = head;
        
        // Move ptr forward n times to create the gap
        int i = 1;
        while (i <= n) {
            ptr = ptr.next; 
            i++;
        }
        
        // If ptr becomes null, we need to remove the head
        if (ptr == null) return head.next;
        
        // Move both until ptr reaches the last node
        while (ptr.next != null) {
            ptr = ptr.next;
            temp = temp.next;
        } 
        
        // Skip the nth node from the end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        
        return head;
    }
}//tc :- O(l) here l is the length of the linked list as we traverse the list exactly once and sc:- O(1)