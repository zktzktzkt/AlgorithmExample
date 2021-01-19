package com.example.algorithmexample.链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * Created by Lenovo on 21/01/06.
 */
class _206_反转链表 {

    /**
     * 递归
     */
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    /**
     * 遍历
     */
    public ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }

        return newHead;
    }


}
