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
    public ListNode oddEvenList(ListNode head) {
        int count =1;
        ListNode start=null;
        ListNode temp=head;
        ListNode end=null;
        ListNode join=null;


        while(temp!=null){
            if(count%2==1){
                if(start==null){
                    start=temp;
                    temp=temp.next;
                }
                else{
                    start.next=temp;
                    start=start.next;
                    temp=temp.next;
                }
            }
            else{
                if(end==null){
                    end=temp;
                    join=end;
                    temp=temp.next;
                    end.next=null;
                    
                }
                else{
                    end.next=temp;
                    end=end.next;
                    temp=temp.next;
                    end.next=null;
                }
            }
            count++;  
        }
        if(start!=null && end!=null){
            start.next=join;
        }
        
        return head;
      
    }
}