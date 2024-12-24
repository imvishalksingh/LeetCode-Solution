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
    public ListNode partition(ListNode head, int x) {
        ListNode fpart=new ListNode(0);
        ListNode spart=new ListNode(0);

        ListNode fparthead=fpart;
        ListNode sparthead=spart;
        while(head!=null){
            if(head.val<x){
                fparthead.next=head;
                fparthead=fparthead.next;
            }else{
                sparthead.next=head;
                sparthead=sparthead.next;
            }
            head=head.next;
        }
       fparthead.next=spart.next;
       sparthead.next=null;

       return fpart.next;
    }
}