package com.github.ducknowledges.leetcodejavasolutions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesSortedArrayTest {

    @Test
    void shouldRemoveDuplicatesAndReturn2() {
        int[] array = {1,1,2};
        RemoveDuplicatesSortedArray remover = new RemoveDuplicatesSortedArray();
        assertThat(remover.removeDuplicates(array)).isEqualTo(2);
    }

    @Test
    void shouldRemoveDuplicatesAndReturn5() {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesSortedArray remover = new RemoveDuplicatesSortedArray();
        assertThat(remover.removeDuplicates(array)).isEqualTo(5);
    }
}