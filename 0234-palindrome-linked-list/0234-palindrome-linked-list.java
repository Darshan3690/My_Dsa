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

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondh = reverse(slow);

        // Start from beginning
        ListNode first = head;

        // Compare both halves
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