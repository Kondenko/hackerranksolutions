package com.vladimirkondenko.hackerrank.greedyflorist

import com.vladimirkondenko.hackerrank.immutableSort
import java.util.*

fun main(args: Array<String>) {
    println(input(Scanner(System.`in`)))
}

fun input(scanner: Scanner): Int {
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    val array = IntArray(n) { scanner.nextInt() }
    return greedyFlorist(n, k, array)
}

fun greedyFlorist(n: Int, k: Int, c: IntArray): Int {
//    if (k >= n) return c.sum()
    val sorted = c.immutableSort()
    var result = 0
    var x = 1
    var i = n
    while (i > 0) {
        var j = 1
        while (i > 0 && j < k) {
            result += x * sorted[--i]
            j++
        }
        x++
    }
    return result
}