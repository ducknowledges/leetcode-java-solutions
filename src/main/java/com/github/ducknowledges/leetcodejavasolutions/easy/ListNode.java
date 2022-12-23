package com.github.ducknowledges.leetcodejavasolutions.easy;

import java.util.Objects;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {};
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return this.next;
    }

    public ListNode setNext(ListNode node) {
        this.next = node;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
