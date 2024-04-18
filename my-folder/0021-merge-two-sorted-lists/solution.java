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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        ListNode nh = null;
        if(a.val<b.val){
            nh = a;
            nh.next = mergeTwoLists(a.next,b);
        }
        else{
            nh = b;
            nh.next = mergeTwoLists(a,b.next);
        }
        return nh;
    }
}
