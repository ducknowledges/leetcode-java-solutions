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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.getVal() < list2.getVal()) {
            return new ListNode(list1.getVal(), mergeTwoLists(list1.getNext(), list2));
        } else {
            return new ListNode(list2.getVal(), mergeTwoLists(list2.getNext(), list1));
        }
    }

}
