package com.vladimirkondenko.hackerrank.fibonaccimodified

import java.math.BigInteger

/**
 * <a href="https://www.hackerrank.com/challenges/fibonacci-modified/problem">Fibonacci Modified
</a>
 */
object Solution {

    val negOne = BigInteger.ONE.negate()

    @JvmStatic
    fun main(args: Array<String>) {
        val input = readLine()!!.split(" ")
        println(modifiedFibonacci(input[0].toBigInt(), input[1].toBigInt(), input[2].toInt()))
    }


    fun modifiedFibonacci(t1: BigInteger, t2: BigInteger, n: Int): BigInteger {
        var mem = Array<BigInteger>(n + 1) { num -> negOne }
        mem[0] = t1
        mem[1] = t2
        for (i in 2..n) mem[i] = fib(mem[i - 2], mem[i - 1])
        return mem[n - 1]
    }

    fun fib(t1: BigInteger, t2: BigInteger) = t1.plus(t2.multiply(t2))

    fun String.toBigInt() = BigInteger(this)

}