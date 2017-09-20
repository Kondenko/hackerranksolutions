package com.vladimirkondenko.hackerrank.bigsorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("BigSorting");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new BigNumericComparator());
        StringBuilder builder = new StringBuilder();
        for (String s : unsorted) {
            builder.append(s).append('\n');
        }
        System.out.print(builder);
    }

    public static class BigNumericComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            long l1 = o1.length();
            long l2 = o2.length();
            if (l1 > l2) return 1;
            if (l1 < l2) return -1;
            BigInteger i1 = new BigInteger(o1);
            BigInteger i2 = new BigInteger(o2);
            if (i1.compareTo(i2) > 0) return 1;
            if (i1.compareTo(i2) < 0) return -1;
            return 0;
        }

    }

}