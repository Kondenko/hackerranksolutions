package com.vladimirkondenko.hackerrank.coinchange

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val c = IntArray(m) { _ -> scanner.nextInt() }
    println(coinChange(n, c))
}

fun coinChange(n: Int, c: IntArray): Long {
    val result = Array(c.size + 1) { _ -> Array<Long>(n + 1) { _ -> 0 } }
    for (i in 0..c.size) result[i][0] = 1
    for (i in 0..n) result[0][i] = 0
    for (i in 1..c.size) {
        for (j in 1..n) {
            result[i][j] =
                    if (c[i - 1] <= j) result[i - 1][j] + result[i][j - c[i - 1]]
                    else result[i - 1][j]
        }
    }
    return result[c.size][n]
}