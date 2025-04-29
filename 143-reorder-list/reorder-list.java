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
    public void reorderList(ListNode head) {
        if (head == null) return;
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode mid=slow.next;
        slow.next=null;

        ListNode emp=null;
        while(mid!=null){
            ListNode temp=mid.next;
            mid.next=emp;
            emp=mid;
            mid=temp;
        }

        ListNode f=head;
        ListNode s=emp;

        while(s!=null){
            ListNode fn=f.next;
            ListNode sn=s.next;
            f.next=s;
            s.next=fn;
            f=fn;
            s=sn;
        }


    }
}