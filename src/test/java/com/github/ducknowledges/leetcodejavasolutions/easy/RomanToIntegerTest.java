package com.github.ducknowledges.leetcodejavasolutions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    private static RomanToInteger romanToInteger;

    @BeforeAll
    static void setup() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void shouldConvertRomanTo3() {
        String roman = "III";
        assertThat(romanToInteger.romanToInt(roman)).isEqualTo(3);
    }

    @Test
    void shouldConvertRomanTo58() {
        String roman = "LIVII";
        assertThat(romanToInteger.romanToInt(roman)).isEqualTo(56);
    }

    @Test
    void shouldConvertRomanTo1994() {
        String roman = "MCMXCIV";
        assertThat(romanToInteger.romanToInt(roman)).isEqualTo(1994);
    }
}