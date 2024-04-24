class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int len = length(head);
        ListNode prev = dummy;
        ListNode hd, td, n;
        while (len >= k) {
            hd = prev.next;
            td = hd;
            for (int i = 0; i < k - 1; i++) {
                td = td.next;
            }
        
            n = td.next;
            td.next = null;
            reverse(hd);
            prev.next = td;
            hd.next = n;
            prev = hd;
            len = len - k;
        }
       
        return dummy.next;
    }

    public void reverse(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}

