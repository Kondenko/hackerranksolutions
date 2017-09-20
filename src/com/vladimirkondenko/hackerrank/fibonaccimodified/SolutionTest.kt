package com.vladimirkondenko.hackerrank.fibonaccimodified

import org.junit.Test

import org.junit.Assert.*
import java.math.BigInteger

class SolutionTest {

    @Test
    fun modifiedFibonacciTest() {
        assertEquals(BigInteger("5"), Solution.modifiedFibonacci(BigInteger.ZERO, BigInteger.ONE, 5))
    }

    @Test
    fun fib() {
        assertEquals(BigInteger.ONE, Solution.fib(BigInteger.ZERO, BigInteger.ONE))
        assertEquals(BigInteger("2"), Solution.fib(BigInteger.ONE, BigInteger.ONE))
        assertEquals(BigInteger("5"), Solution.fib(BigInteger.ONE, BigInteger("2")))
    }


}