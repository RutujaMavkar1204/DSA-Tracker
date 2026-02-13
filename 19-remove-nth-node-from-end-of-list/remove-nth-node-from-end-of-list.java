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
      ListNode newHead= reverse(head);
     
      int count=1;
      ListNode temp=newHead;
      ListNode prev=newHead;
      while(temp!=null){
        if(count==n){
            if(count==1){
                newHead=newHead.next;
            }
            prev.next=temp.next;
        }
        count++;
        prev=temp;
        temp=temp.next;

      }
      ListNode ans=reverse(newHead);
      return ans;

    }
    public ListNode reverse(ListNode head){
         ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;


        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next; 
        }
        return prev;

    }
}