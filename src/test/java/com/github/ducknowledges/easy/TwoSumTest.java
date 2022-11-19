package com.github.ducknowledges.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoSumTest {

    private static TwoSum twoSum;

    @BeforeAll
    static void setup() {
        twoSum = new TwoSum();
    }

    @Test
    void shouldReturnIndices_0_3() {
        int[] actual = twoSum.getTwoSum(new int[]{2, 15, 11, 7}, 9);
        int[] expected = {0, 3};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_1_2() {
        int[] actual = twoSum.getTwoSum(new int[]{3, 2, 4}, 6);
        int[] expected = {1, 2};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_0_1() {
        int[] actual = twoSum.getTwoSum(new int[]{3, 3}, 6);
        int[] expected = {0, 1};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_0_2() {
        int[] actual = twoSum.getTwoSum(new int[]{0, 7, 9, 15}, 9);
        int[] expected = {0, 2};
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyArray() {
        int[] actual = twoSum.getTwoSum(new int[]{1, 7, 9, 15}, 9);
        assertThat(actual).isEqualTo(new int[]{});
    }
}