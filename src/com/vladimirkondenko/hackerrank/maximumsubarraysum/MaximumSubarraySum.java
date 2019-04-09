package com.vladimirkondenko.hackerrank.maximumsubarraysum;

/**
 * https://www.codewars.com/kata/maximum-subarray-sum/java
 */
public class MaximumSubarraySum {

    public static int sequence(int[] array) {
        if (array.length == 0) return 0;
        int sum = array[0];
        int maxSum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (sum + array[i] > array[i]) {
                sum += array[i];
            } else {
                sum = array[i];
            }
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum < 0 ? 0 : maxSum;
    }

}
