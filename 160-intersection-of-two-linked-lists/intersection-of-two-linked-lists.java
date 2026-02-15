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
        ListNode temp1=headA;
        ListNode temp2=headB;
        int count=0;
        ListNode ans=null;
        while(temp1!=null){
            while(temp1!=null && temp2!=null){
                if(temp1==temp2){
                    if(count==0){
                        ans=temp1;
                    }
                    count=1; 
                    temp1=temp1.next;
                    temp2=temp2.next;
                   
                    System.out.println(count);
                    System.out.println(ans.val);
                }
                else{
                    count=0;
                    temp2=temp2.next;
                }
            }
            temp2=headB;
            if(temp1!=null){
            temp1=temp1.next;}
        }
        if(count==0){
            return null;
        }
        return ans;
    }
}