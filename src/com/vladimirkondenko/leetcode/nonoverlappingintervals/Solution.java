package com.vladimirkondenko.leetcode.nonoverlappingintervals;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int intervalEnd = intervals[0][1];
        int c = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervalEnd <= intervals[i][0]) {
                intervalEnd = intervals[i][1];
                c++;
            }
        }
        return intervals.length - c;
    }

}
