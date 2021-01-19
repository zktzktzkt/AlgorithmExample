package com.example.algorithmexample.链表;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * Created by Lenovo on 21/01/09.
 */
class _83_删除排序链表中的重复元素 {

    /**
     * 由于输入的列表已排序，因此我们可以通过将「当前结点的值」与「它之后的结点的值」进行比较来确定它是否为重复结点。
     * 如果它是重复的，我们更改当前结点的 next 指针，以便它跳过下一个结点并直接指向下一个结点之后的结点。
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}
