package com.vladimirkondenko.hackerrank.greedyflorist

import com.vladimirkondenko.hackerrank.readInt
import org.junit.Test
import java.io.File
import java.util.*
import kotlin.test.assertEquals

class GreedyFloristKtTest {

    @Test
    fun input00() {
        val inputFile = "/home/user/IdeaProjects/Hackerrank/src/com/vladimirkondenko/hackerrank/greedyflorist/greedy-florist-testcases/input/input00.txt"
        val outputFile = "/home/user/IdeaProjects/Hackerrank/src/com/vladimirkondenko/hackerrank/greedyflorist/greedy-florist-testcases/output/output00.txt"
        assertEquals(File(outputFile).readInt(), input(Scanner(File(inputFile))))
    }

    @Test
    fun input10() {
        val inputFile = "/home/user/IdeaProjects/Hackerrank/src/com/vladimirkondenko/hackerrank/greedyflorist/greedy-florist-testcases/input/input10.txt"
        val outputFile = "/home/user/IdeaProjects/Hackerrank/src/com/vladimirkondenko/hackerrank/greedyflorist/greedy-florist-testcases/output/output10.txt"
        assertEquals(File(outputFile).readInt(), input(Scanner(File(inputFile))))
    }

}