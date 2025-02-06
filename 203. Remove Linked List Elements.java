class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        while(temp!=null){
            while(temp.next!=null && temp.next.val==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
}