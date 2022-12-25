package com.github.ducknowledges.leetcodejavasolutions.easy;

/**
 * Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * */
public class MergeTwoSortedLists {

    /*
     * Time: O(m + n)
     * Space: O(m + n)
     * */
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.getVal() < list2.getVal()) {
            return new ListNode(list1.getVal(), mergeTwoLists1(list1.getNext(), list2));
        } else {
            return new ListNode(list2.getVal(), mergeTwoLists1(list2.getNext(), list1));
        }
    }

    /*
     * Time: O(m + n)
     * Space: O(1)
     * */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode();
        ListNode pointerNode = preHead;
        while (list1 != null && list2 != null) {
            if (list1.getVal() > list2.getVal()) {
                pointerNode.setNext(list2);
                list2 = list2.getNext();
            } else {
                pointerNode.setNext(list1);
                list1 = list1.getNext();
            }
            pointerNode = pointerNode.getNext();
        }
        pointerNode.setNext(list1 == null ? list2 : list1);
        return preHead.getNext();
    }
}
