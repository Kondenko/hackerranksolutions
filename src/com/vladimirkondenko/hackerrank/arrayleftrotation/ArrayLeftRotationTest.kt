package com.vladimirkondenko.hackerrank.arrayleftrotation

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class ArrayLeftRotationTest {

    @Test
    fun test1() {
        assertEquals(
                "5 1 2 3 4",
                ArrayLeftRotation.input(Scanner(
                """
                5 4
                1 2 3 4 5
                """.trimIndent())
        ))
    }

}