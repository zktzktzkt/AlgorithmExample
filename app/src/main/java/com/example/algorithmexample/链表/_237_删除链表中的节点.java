package com.example.algorithmexample.链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * Created by Lenovo on 21/01/06.
 */
class _237_删除链表中的节点 {


    /**
     * 因为我们无法访问我们想要删除的节点「之前」的节点，
     * 所以必须将「想要删除的节点的值」替换为它「后面节点中的值」，然后删除它之后的节点。
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
