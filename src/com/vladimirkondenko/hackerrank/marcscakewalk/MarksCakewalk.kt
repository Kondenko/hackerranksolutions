package com.vladimirkondenko.hackerrank.marcscakewalk

import com.vladimirkondenko.hackerrank.pow
import java.util.*

fun main(args: Array<String>) {
    println(input(Scanner(System.`in`)))
}

fun input(scanner: Scanner): Long {
    val n = scanner.nextInt()
    val array = IntArray(n) { scanner.nextInt() }
    return cakewalk(array)
}

fun cakewalk(arr: IntArray): Long {
    var result = 0L
    var j = 0
    arr.sortDescending()
    arr.forEach { c ->
        result += calories(j, c).toLong()
        j++
    }
    return result
}

fun calories(j: Int, c: Int) = (2 pow j) * c

