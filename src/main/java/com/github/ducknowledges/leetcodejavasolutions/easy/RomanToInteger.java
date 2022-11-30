package com.github.ducknowledges.leetcodejavasolutions.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Number
 * https://leetcode.com/problems/roman-to-integer/
 * */
public class RomanToInteger {

    /*
     * Roman numeral in the range [1, 3999]
     * Time: O(1)
     * Space: O(1)
     * */
    public int romanToInt(String numeral) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = romanValues.get(numeral.charAt(numeral.length() - 1));
        for (int i = numeral.length() - 2; i >= 0; i--) {
            int prev = romanValues.get(numeral.charAt(i + 1));
            int current = romanValues.get(numeral.charAt(i));
            result += current < prev ? -current : current;
        }
        return result;
    }
}
