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
    public int getDecimalValue(ListNode head) {
         int n = -1;
         ListNode c = head;
         while(c!=null){
             n++;
             c=c.next;
         }
         int sum =0;
         c=head;
         while(c!=null){
             sum +=c.val*Math.pow(2,n);
             n--;
             c=c.next;
         }
         return sum;
    }
}
