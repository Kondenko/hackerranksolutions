package com.vladimirkondenko.hackerrank.minimumabsolutedifference

import java.util.*

// TODO Not solved
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(input(scanner))
}

fun input(scanner: Scanner): Long {
    val n: Int = scanner.nextInt()
    val array = LongArray(n) { scanner.nextLong() }.map(Math::abs).toLongArray()
    return absMin2(array)
}

fun absMin2(array: LongArray): Long {
    return Collections.min(array.zip(array.drop(0)).map {pair -> Math.abs(pair.first - pair.second)})
}


fun absMin(array: IntArray): Int {
    array.sort()
    var result = Int.MAX_VALUE
    for (i in 0..(array.size - 2)) {
        val minAbs = Math.abs(array[i] - array[i + 1])
//        println("$i: |${array[i]} - ${array[i + 1]}| = $minAbs")
        if (minAbs < result) {
//            println("New min: $result")
            result = minAbs
        }
    }
    return result
}

/*

fun input(scanner: Scanner): Int {
    val n: Int = scanner.nextInt()
    val array = IntArray(n) { scanner.nextInt() }
    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE
    array.forEach {
//        num ->
        val num = Math.abs(it)
        if (num < min1) {
            min2 = min1
            min1 = num
        } else if (num < min2) {
            min2 = num
        }
    }
    return Math.abs(min1 - min2)
}

*/

/*
3
3 -7 0
 */