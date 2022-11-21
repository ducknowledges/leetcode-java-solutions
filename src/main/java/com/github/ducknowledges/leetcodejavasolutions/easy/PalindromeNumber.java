package com.github.ducknowledges.leetcodejavasolutions.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * */
public class PalindromeNumber {

    public boolean isPalindrome(int number, String timeComplexity) {
        if (timeComplexity.equals("T(log(n))S(log(n))")) {
            return this.isPalindromeTimeLogNSpaceLogN(number);
        } else {
            return this.isPalindromeTimeLogNSpace1(number);
        }
    }

    /*
     * Time: O(log(n))
     * Space: O(log(n))
     * */
    public boolean isPalindromeTimeLogNSpaceLogN(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    /*
     * Time: O(log(n))
     * Space: O(1)
     * */
    public boolean isPalindromeTimeLogNSpace1(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
