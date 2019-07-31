package com.vladimirkondenko.leetcode.besttimetobuyandsellstock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void maxProfit() {
        assertEquals(7, Solution.maxProfit(new int[]{6, 1, 3, 2, 4, 7}));
    }

    @Test
    public void maxProfit2() {
        assertEquals(4, Solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maxProfit3() {
        assertEquals(7, Solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfit4() {
        assertEquals(0, Solution.maxProfit(new int[]{7, 6, 4, 3, 2, 1}));
    }

    @Test
    public void maxProfit5() {
        assertEquals(7, Solution.maxProfit(new int[]{3, 2, 6, 5, 0, 3}));
    }

    @Test
    public void maxProfit6() {
        assertEquals(1, Solution.maxProfit(new int[]{1, 2}));
    }

    @Test
    public void maxProfit7() {
        assertEquals(2, Solution.maxProfit(new int[]{2, 4, 1}));
    }

    @Test
    public void maxProfit8() {
        assertEquals(2, Solution.maxProfit(new int[]{2, 1, 2, 0, 1}));
    }

    @Test
    public void maxProfit9() {
        assertEquals(2, Solution.maxProfit(new int[]{2, 1, 2, 1, 0, 0, 1}));
    }

    @Test
    public void maxProfit10() {
        assertEquals(6, Solution.maxProfit(new int[]{4, 2, 1, 7}));
    }

    @Test
    public void maxProfit11() {
        assertEquals(10, Solution.maxProfit(new int[]{1, 11, 7, 4, 2}));
    }

}