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
    public ListNode removeNodes(ListNode head) {
        ListNode temp1 = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = temp1;          
            temp1 = current;             
            current = next;
        }
        int max = temp1.val;
        ListNode temp = temp1;
        while(temp!=null && temp.next!=null){
            if(max>temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                max=temp.next.val;
                temp=temp.next;
            }
        }
        ListNode temp2 = null;
        current = temp1;
        while (current != null) {
            ListNode next = current.next;
            current.next = temp2;          
            temp2 = current;             
            current = next;
        }
        return temp2;
    }
}