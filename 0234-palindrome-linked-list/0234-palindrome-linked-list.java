class Solution {

    ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next1 = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next1;
        }

        return pre;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondh = reverse(slow);
        ListNode first = head;

        while (secondh != null) {
            if (first.val != secondh.val) {
                return false;
            }

            first = first.next;
            secondh = secondh.next;
        }

        return true;
    }
}