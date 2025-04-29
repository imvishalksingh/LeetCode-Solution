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
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        int lengthA=0;
        int lengthB=0;
        while(nodeA!=null){
            lengthA++;
            nodeA=nodeA.next;
        }
        while(nodeB!=null){
            lengthB++;
            nodeB=nodeB.next;
        }

        if(lengthA>lengthB){
            for(int i=0; i<lengthA-lengthB; i++){
                headA=headA.next;
            }
        }else{
            for(int i=0; i<lengthB-lengthA; i++){
                headB=headB.next;
            }
        }

        while(headA!=null && headB!=null){
            if(headA==headB) return headA;

            headA=headA.next;
            headB=headB.next;
        }

        return null;
    }
}