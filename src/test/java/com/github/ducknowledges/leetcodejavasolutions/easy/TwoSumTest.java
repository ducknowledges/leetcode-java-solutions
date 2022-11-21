package com.github.ducknowledges.leetcodejavasolutions.easy;

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
        int[] actual1 = twoSum.getTwoSum(new int[]{2, 15, 11, 7}, 9, "T(n^2)S(1)");
        int[] actual2 = twoSum.getTwoSum(new int[]{2, 15, 11, 7}, 9, "T(n)S(N)");
        int[] expected = {0, 3};
        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_1_2() {
        int[] actual1 = twoSum.getTwoSum(new int[]{3, 2, 4}, 6, "T(n^2)S(1)");
        int[] actual2 = twoSum.getTwoSum(new int[]{3, 2, 4}, 6, "T(n)S(N)");
        int[] expected = {1, 2};
        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_0_1() {
        int[] actual1 = twoSum.getTwoSum(new int[]{3, 3}, 6, "T(n^2)S(1)");
        int[] actual2 = twoSum.getTwoSum(new int[]{3, 3}, 6, "T(n)S(N)");
        int[] expected = {0, 1};
        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnIndices_0_2() {
        int[] actual1 = twoSum.getTwoSum(new int[]{0, 7, 9, 15}, 9, "T(n^2)S(1)");
        int[] actual2 = twoSum.getTwoSum(new int[]{0, 7, 9, 15}, 9, "T(n)S(N)");
        int[] expected = {0, 2};
        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyArray() {
        int[] actual1 = twoSum.getTwoSum(new int[]{1, 7, 9, 15}, 9, "T(n^2)S(1)");
        int[] actual2 = twoSum.getTwoSum(new int[]{1, 7, 9, 15}, 9, "T(n)S(N)");
        int[] actual3 = twoSum.getTwoSum(new int[]{1, 7, 9, 15}, 9, "");
        assertThat(actual1).isEqualTo(new int[]{});
        assertThat(actual2).isEqualTo(new int[]{});
        assertThat(actual3).isEqualTo(new int[]{});
    }
}