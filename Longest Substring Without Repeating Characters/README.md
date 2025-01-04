# Longest Substring Without Repeating Characters

## LeetCode Problem
- Problem Number: 3
- Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
- Difficulty: Medium
- Topics: Hash Table, String, Sliding Window

## Problem Description
Given a string s, find the length of the longest substring without repeating characters.

Note:
- A substring is a contiguous sequence of characters within the string
- The substring must not have any repeating characters

## Examples

### Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

### Example 2:
```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

### Example 3:
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Constraints
- 0 <= s.length <= 5 * 10⁴
- s consists of English letters, digits, symbols and spaces