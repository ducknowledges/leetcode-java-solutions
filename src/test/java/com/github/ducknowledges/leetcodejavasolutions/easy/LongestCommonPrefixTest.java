package com.github.ducknowledges.leetcodejavasolutions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    private static  LongestCommonPrefix longestCommonPrefix;

    @BeforeAll
    static void setup() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void shouldGetLongestPrefixString() {
        String[] strings = new String[]{"flow", "flower","flowers", };
        assertThat(longestCommonPrefix.longestCommonPrefix(strings)).isEqualTo("flow");
    }

    @Test
    void shouldGetLongestPrefixString2() {
        String[] strings = new String[]{"flower", "flow", "flowers"};
        assertThat(longestCommonPrefix.longestCommonPrefix(strings)).isEqualTo("flow");
    }

    @Test
    void shouldGetEmptyPrefixString() {
        String[] strings = new String[]{"dog","racecar","car"};
        assertThat(longestCommonPrefix.longestCommonPrefix(strings)).isEmpty();
    }

    @Test
    void shouldReturnEmptyPrefixStringIfGetEmptyStrings() {
        String[] strings = new String[]{};
        assertThat(longestCommonPrefix.longestCommonPrefix(strings)).isEmpty();
    }

}