package com.github.ducknowledges.leetcodejavasolutions.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PalindromeNumberTest {

    private static PalindromeNumber palindromeNumber;

    @BeforeAll
    static void setup() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void shouldReturnTrueIfNumberIsPalindrome() {
        int number = 121;
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(log(n))")).isTrue();
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(1)")).isTrue();
    }

    @Test
    void shouldReturnFalseIfIntegerMaxValue() {
        int number = Integer.MAX_VALUE;
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(log(n))")).isFalse();
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(1)")).isFalse();
    }

    @Test
    void shouldReturnTrueIfNumberIsZero() {
        int number = 0;
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(log(n))")).isTrue();
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(1)")).isTrue();
    }

    @Test
    void shouldReturnFalseIfNumberIsNegative() {
        int number = -121;
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(log(n))")).isFalse();
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(1)")).isFalse();
    }

    @Test
    void shouldReturnTrueIfNumberIsNotPalindrome() {
        int number = 10;
        assertThat(palindromeNumber.isPalindrome(number, "O(n)")).isFalse();
        assertThat(palindromeNumber.isPalindrome(number, "T(log(n))S(1)")).isFalse();
    }
}