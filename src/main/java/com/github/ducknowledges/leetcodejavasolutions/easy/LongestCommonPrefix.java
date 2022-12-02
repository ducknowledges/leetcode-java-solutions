package com.github.ducknowledges.leetcodejavasolutions.easy;

/**
 * Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 * */
public class LongestCommonPrefix {

    /*
     * Time: O(n * m)
     * Space: O(m)
     * where m is max length of string
     * */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();
        int charCounter = 0;
        while (true) {
            if (charCounter >= strs[0].length()) {
                break;
            }
            boolean coincidence = true;
            char reference = strs[0].charAt(charCounter);
            for (int i = 0; i < strs.length; i++) {
                if (charCounter >= strs[i].length() || reference != strs[i].charAt(charCounter)) {
                    coincidence = false;
                    break;
                }
            }
            if (coincidence) {
                stringBuilder.append(reference);
                charCounter++;
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}
