package com.vladimirkondenko.hackerrank.coinchange

import org.junit.Test

import org.junit.Assert.*


class CoinChangeTest {

    @Test
    fun coinChange() {
        assertEquals(4,
                com.vladimirkondenko.hackerrank.coinchange.coinChange(4, intArrayOf(1, 2, 3)))
    }

    @Test
    fun coinChange2() {
        assertEquals(5,
                com.vladimirkondenko.hackerrank.coinchange.coinChange(10, intArrayOf( 2, 3, 5, 6)))
    }

}