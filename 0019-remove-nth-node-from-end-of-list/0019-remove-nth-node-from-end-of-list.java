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
    // static int count(ListNode head){
    //     ListNode temp=head;
    //     int c=0;
    //     while(temp!=null){
    //         c++;
    //         temp=temp.next;
    //     }
    //     return c;
    // }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // ListNode prev=head;
        // int len=count(head);
        // int loop=len-n+1;
        // int i=1;
        // if(len==1){
        //     return null;
        // }
        // if(loop==1){
        //     head=head.next;
        //     return head;
        // }
        // while(i<loop){
        //     prev=temp;
        //     temp=temp.next;
        //     i++;
            
            
        // }
        // prev.next=temp.next;
        // return head;

        ListNode slow =head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast =fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        ListNode deleteNode = slow.next;
        slow.next = slow.next.next;
        return head;


        
    }
}