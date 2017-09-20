package com.vladimirkondenko.hackerrank.xorandsum

import java.util.*

fun main(args: Array<String>) {
    print(input(Scanner(System.`in`)))
}

fun input(scanner: Scanner): Long {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    return xorAndSum(a, b)
}

fun xorAndSum(a: Int, b: Int): Long {
    var result = 0L
    for (i in 0..312159) result += func(a, b, i)
    return result
}

fun func(a: Int, b: Int, i: Int) = a.xor(b shl i)