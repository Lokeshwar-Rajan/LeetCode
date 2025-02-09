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
    ListNode temp;
    public boolean isPalindrome(ListNode head) {
        temp = head;
        return rev(head);
    }
    public boolean rev(ListNode head){
        if(head == null) return true;
        boolean result = rev(head.next) && head.val == temp.val;
        temp=temp.next;
        return result;
    }
}