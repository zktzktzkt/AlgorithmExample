package com.example.algorithmexample.链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * Created by Lenovo on 21/01/09.
 */
class _203_移除链表元素 {

    /**
     * 哨兵节点
     * 如果删除的节点是中间的节点，则问题似乎非常简单：
     *   - 选择要删除节点的前一个结点 prev。
     *   - 将 prev 的 next 设置为要删除结点的 next。
     * 当要删除的一个或多个节点位于链表的头部时，事情会变得复杂。
     *   - 可以通过哨兵节点去解决它，哨兵节点广泛应用于树和链表中，如伪头、伪尾、标记等，它们是纯功能的，通常不保存任何数据，
     *     其主要目的是使链表标准化，如使链表永不为空、永不无头、简化插入和删除。
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return sentinel.next;
    }
}
