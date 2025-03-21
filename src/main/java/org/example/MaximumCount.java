// Given an array nums sorted in non-decreasing order,
// return the maximum between the number of positive integers and the number of negative integers.
//
// In other words, if the number of positive integers in nums is pos and the number of negative
// integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

package org.example;

public class MaximumCount {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
        }
        return Math.max(pos,neg);
    }
}

