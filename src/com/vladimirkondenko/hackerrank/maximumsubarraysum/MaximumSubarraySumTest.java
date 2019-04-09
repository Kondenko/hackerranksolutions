package com.vladimirkondenko.hackerrank.maximumsubarraysum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarraySumTest {

    @Test
    public void sequence() {
        assertEquals(6, MaximumSubarraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void sequence2() {
        assertEquals(4, MaximumSubarraySum.sequence(new int[]{2, -1, 1, 2}));
    }

    @Test
    public void sequence3() {
        assertEquals(4, MaximumSubarraySum.sequence(new int[]{-100, 2, -1, 1, 2}));
    }

    @Test
    public void sequence4() {
        assertEquals(7, MaximumSubarraySum.sequence(new int[]{1, 1, 1, 4}));
    }

    @Test
    public void sequence5() {
        assertEquals(3, MaximumSubarraySum.sequence(new int[]{1, 1, 1, -4}));
    }

    @Test
    public void sequence6() {
        assertEquals(8, MaximumSubarraySum.sequence(new int[]{1, 1, 1, 4, 1}));
    }

}