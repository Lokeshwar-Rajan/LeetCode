/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode run=temp1;
        int c1=0,c2=0;
        while(temp1!=null){
            temp1=temp1.next;
            c1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            c2++;
        }
        
            int max=Math.max(c1,c2);
            int diff=Math.abs(c1-c2);
            if(c1==max){
                temp1=headA;
                c1=0;
                while(temp1!=null){
                    if(c1==diff){
                        break;
                    }
                    temp1=temp1.next;
                    c1++;
                }
                temp2=headB;
                while(temp1!=null){
                    if(temp1==temp2){
                        return temp1;
                    }
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }
            else{
                temp2=headB;
                c2=0;
                while(temp2!=null){
                    if(c2==diff){
                        break;
                    }
                    temp2=temp2.next;
                    c2++;
                }
                temp1=headA;
                while(temp1!=null){
                    if(temp1==temp2){
                        return temp1;
                    }
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
            }

        
        return null;
    }
}