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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count =0;
        while(current!=null){
            count++;
            current = current.next;
        }
        if((count&1)==0){
            count/=2;
        }else{
            count/=2;

        }
        current =head;
        while(count!=0){
            count--;
            current=current.next;
        }
        return current;
        
    }
}
