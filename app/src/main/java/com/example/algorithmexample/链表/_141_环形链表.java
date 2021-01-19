package com.example.algorithmexample.链表;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/solution/
 * Created by Lenovo on 21/01/07.
 */
class _141_环形链表 {

    /**
     * 利用「快慢指针」，慢指针走一步，快指针走两步
     * 如果有环，两个指针一定会相遇
     * 如果没有环，快指针会为null
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

}
