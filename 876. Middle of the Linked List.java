class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0;
        for(temp=head;temp!=null;c++,temp=temp.next);
        int k = c/2;
        temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        head=temp;
        return head;
    }
}