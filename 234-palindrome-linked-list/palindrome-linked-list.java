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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            System.out.println("slow"+slow.val);
            System.out.println(fast.val);
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode prev=null;

        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
            System.out.println(prev.val);

        }

        ListNode start=head;
        ListNode end=prev;

        while(start!=null && end!=null){
            if(start.val!=end.val){
            return false;
           }
           System.out.println(start.val); 
            System.out.println(end.val);
            start=start.next;
            end=end.next;
            
           
        }
        return true;








        
        
    }
}