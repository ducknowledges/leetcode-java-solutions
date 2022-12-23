package com.github.ducknowledges.leetcodejavasolutions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    private ListNode listNode1;
    private ListNode listNode2;

    @BeforeEach
    void setUp() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(1);
        listNode1 = node1.setNext(node2.setNext(node3));
        listNode2 = node6.setNext(node5.setNext(node4));
    }

    @Test
    void shouldMergeTwoSortedLists() {
        ListNode expected = new ListNode(
            1, new ListNode(
            1, new ListNode(
            2, new ListNode(
            3, new ListNode(
            4, new ListNode(4))))));
        MergeTwoSortedLists x = new MergeTwoSortedLists();
        assertThat(x.mergeTwoLists(listNode1, listNode2)).isEqualTo(expected);
    }

}