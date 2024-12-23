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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
        ListNode curr=head;
        ListNode temp;

        while(curr.next!=null ){
            if(curr.val==curr.next.val){
                temp=curr;
                while(curr.next!=null && curr.val==curr.next.val) curr=curr.next;
                temp.next=curr.next;
            }else{
                curr=curr.next;
            }
            
        }

        return dummy.next;
    }
}