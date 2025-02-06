class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        if(head.next==null) return false;
        ListNode temp = head;
        ListNode run = head.next;
        while(run!=null && run.next!=null){
            temp=temp.next;
            run=run.next.next;
            if(temp==run){
                return true;
            }
        }
        return false;
    }
}
