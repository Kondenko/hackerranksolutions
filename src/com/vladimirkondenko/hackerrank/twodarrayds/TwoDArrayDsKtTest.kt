package com.vladimirkondenko.hackerrank.twodarrayds

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*


class TwoDArrayDsKtTest {

    /*
    @Test
    fun hourglassSum0() {
        val expected = 28
        val actual = input(Scanner(
                """
                -9 -9 -9 1 1 1
                 0 -9 0 4 3 2
                -9 -9 -9 1 2 3
                 0 0 8 6 6 0
                 0 0 0 -2 0 0
                 0 0 1 2 4 0
                """.trimIndent()
        ))
        assertEquals(expected, actual)
    }
    */

    @Test
    fun hourglassSum1() {
        val expected = 19
        val actual = input(Scanner(
                """
                1 1 1 0 0 0
                0 1 0 0 0 0
                1 1 1 0 0 0
                0 0 2 4 4 0
                0 0 0 2 0 0
                0 0 1 2 4 0
                """.trimIndent()
        ))
        assertEquals(expected, actual)
    }

    @Test
    fun hourglassSum2() {
        val expected = 13
        val actual = input(Scanner(
                """
                1 1 1 0 0 0
                0 1 0 0 0 0
                1 1 1 0 0 0
                0 9 2 -4 -4 0
                0 0 0 -2 0 0
                0 0 -1 -2 -4 0
                """.trimIndent()
        ))
        assertEquals(expected, actual)
    }

    @Test
    fun hourglassSum3() {
        val expected = 28
        val actual = input(Scanner(
                """
                -9 -9 -9 1 1 1
                0 -9 0 4 3 2
                -9 -9 -9 1 2 3
                0 0 8 6 6 0
                0 0 0 -2 0 0
                0 0 1 2 4 0
                """.trimIndent()
        ))
        assertEquals(expected, actual)
    }


}