package com.vladimirkondenko.leetcode.nonoverlappingintervals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void eraseOverlapIntervals() {
        assertEquals(2, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));
    }

    @Test
    public void eraseOverlapIntervals1() {
        assertEquals(1, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    public void eraseOverlapIntervals2() {
        assertEquals(0, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

    @Test
    public void eraseOverlapIntervals3() {
        assertEquals(2, Solution.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}}));
    }

    @Test
    public void eraseOverlapIntervals4() {
        assertEquals(2, Solution.eraseOverlapIntervals(new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}}));
    }

    @Test
    public void eraseOverlapIntervals5() {
        assertEquals(2, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 3}, {1, 4}}));
    }

    @Test
    public void eraseOverlapIntervals6() {
        assertEquals(0, Solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

}