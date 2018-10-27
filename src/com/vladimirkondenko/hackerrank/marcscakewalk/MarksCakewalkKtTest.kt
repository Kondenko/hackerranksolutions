package com.vladimirkondenko.hackerrank.marcscakewalk

import com.vladimirkondenko.hackerrank.assertEquals
import com.vladimirkondenko.hackerrank.assertNotEquals
import org.junit.Test
import java.util.*

class MarksCakewalkKtTest {

    @Test
    fun test1() {
        input(Scanner("3\n1 3 2")) assertEquals 11
    }

    @Test
    fun test2() {
        input(Scanner("3\n1 3 2")) assertNotEquals 10
    }

}