package com.example.algorithmexample.队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
class _232_用栈实现队列 {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    /** Initialize your data structure here. */
    public _232_用栈实现队列() {

    }

    /** 入队 */
    public void push(int x) {
        inStack.push(x);
    }

    /** 出队 */
    public int pop() {
        checkOutStack();
        return outStack.pop();
    }

    /** 获取队头 */
    public int peek() {
        checkOutStack();
        return outStack.peek();
    }

    /** 是否为空 */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void checkOutStack() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
