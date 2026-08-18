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

        int m=0 , n=0;

        ListNode current1=headA;
        while(current1!=null){
            m++;
            current1=current1.next;
        }
        ListNode current2=headB;
        while(current2!=null){
            n++;
            current2=current2.next;
        }
        
        ListNode pa=headA , pb=headB;

        if(m>n){
            int diff=m-n;
            while(diff>0){
                pa=pa.next;
                diff--;
            }

        }
        else{
            int diff=n-m;
            while(diff>0){
                pb=pb.next;
                diff--;
            }
        }

        while(pa!=pb){
            pa=pa.next;
            pb=pb.next;

        }
        return pa;



        


        
    }
}