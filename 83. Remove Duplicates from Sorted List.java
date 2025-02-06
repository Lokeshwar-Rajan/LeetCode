class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            ListNode run = temp;
            while(run.next!=null){
                if(temp.val==run.next.val){
                    run.next=run.next.next;
                }
                else{
                    run=run.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}