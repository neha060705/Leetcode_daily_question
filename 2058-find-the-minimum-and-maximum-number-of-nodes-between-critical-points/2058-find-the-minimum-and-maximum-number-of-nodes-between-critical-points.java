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

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }
        ListNode temp = head.next;
        ListNode prev =head;
        ListNode front = head.next.next;
        int[] ans= new int[2];
        List<Integer> ls= new ArrayList<>();
        int cnt =2;
        while(temp.next!=null){
            if(prev.val >temp.val && front.val> temp.val ){
                ls.add(cnt);
            }
            else if(prev.val<temp.val && front.val <temp.val){
                ls.add(cnt);
            }
            temp= temp.next;
            cnt++;
            prev= prev.next;
            front = front.next;
        }
        int min =Integer.MAX_VALUE;
        int n= ls.size();
        if(n<2){
            return new int[]{-1,-1};
        }
        for(int i=0;i<n-1;i++){
            min = Math.min(min ,ls.get(i+1)-ls.get(i));
        }
        int max= ls.get(n-1)-ls.get(0);
        ans[0]= min;
        ans[1]= max;
        return ans;
    }
}