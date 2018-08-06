package com.vladimirkondenko.hackerrank.twodarrayds

import java.util.*

fun main(args: Array<String>) {
    print(input(Scanner(System.`in`)))
}

fun input(scan: Scanner): Int {
    val arr = Array<Array<Int>>(6) { _ -> Array<Int>(6) { 0 } }
    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }
    return hourglassSum(arr)
}

fun hourglassSum(arr: Array<Array<Int>>): Int {
    val size = 6
    var sums = emptyList<Int>()
    for (i in 0 until size - 2) {
        for (j in 0 until size - 2) {
            sums += run {
                var sum = 0
                sum += arr[i][j]
                sum += arr[i][j + 1]
                sum += arr[i][j + 2]
                sum += arr[i + 1][j + 1]
                sum += arr[i + 2][j]
                sum += arr[i + 2][j + 1]
                sum += arr[i + 2][j + 2]
                sum
            }
        }
    }
    return sums.max() ?: 0
}
