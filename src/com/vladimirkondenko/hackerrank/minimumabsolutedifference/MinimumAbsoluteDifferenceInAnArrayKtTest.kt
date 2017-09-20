package com.vladimirkondenko.hackerrank.minimumabsolutedifference

import org.junit.Test

import org.junit.Assert.*
import java.io.File
import java.util.*

class MinimumAbsoluteDifferenceInAnArrayKtTest {

    @Test
    fun absMin2() {
        assertEquals(File("/home/user/Downloads/output02.txt").readText().toInt(), input(Scanner(File("/home/user/Downloads/input02.txt"))))
    }

    @Test
    fun absMin3() {
        assertEquals(File("/home/user/Downloads/output03.txt").readText().toInt(), input(Scanner(File("/home/user/Downloads/input03.txt"))))
    }

}