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
    public ListNode deleteMiddle(ListNode head) {
        ListNode counter=head;
        int len=0;
        while(counter!=null){
            len++;
            counter=counter.next;
        }
        if(len==1){
            return null;
        }
        if(len==2) {
            head.next=null;
            return head;
        }
        int mid=len/2;
        counter=head;
        for(int i=0 ;i<mid-1 ;i++){
            counter=counter.next;
        }
        ListNode temp=counter.next.next;

        counter.next=temp;
        return head;




        
    }
}