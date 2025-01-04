# Two Sum

## LeetCode Problem
- Problem Number: 1
- Problem Link: https://leetcode.com/problems/two-sum/
- Difficulty: Easy
- Topics: Array, Hash Table

## Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers in the array that add up to the `target`.

You may assume that:
- Each input has exactly one solution
- You may not use the same element twice
- You can return the answer in any order

## Examples

### Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

### Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

## Constraints
- 2 <= nums.length <= 10⁴
- -10⁹ <= nums[i] <= 10⁹
- -10⁹ <= target <= 10⁹
- Only one valid answer exists

## Solution Approach
There are two main approaches to solve this problem:

### 1. Hash Table Approach (Optimal)
- Time Complexity: O(n)
- Space Complexity: O(n)
- Algorithm:
  1. Create a HashMap to store complement values
  2. For each number in the array:
     - Calculate complement (target - current number)
     - If complement exists in HashMap, return [complementIndex, currentIndex]
     - Add current number and its index to HashMap

### 2. Brute Force Approach
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Algorithm:
  1. Use nested loops to try every possible pair
  2. Check if any pair sums to target
  3. Return indices when found

## Common Pitfalls
1. Using the same element twice
2. Not considering negative numbers
3. Forgetting to check if complement exists before adding to HashMap
4. Returning wrong order of indices

## Related Problems
- 167: Two Sum II - Input Array Is Sorted
- 170: Two Sum III - Data structure design
- 653: Two Sum IV - Input is a BST